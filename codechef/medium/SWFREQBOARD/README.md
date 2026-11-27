# SWFREQBOARD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sliding Window Frequency Board

You are given a window of maximum capacity $W$, which is initially empty. Whenever an element is pushed:

- It is appended to the back of the window.
- If the window size exceeds $W$, the oldest element is automatically removed from the front.

You need to process $Q$ operations. The operations can be of four types:

- PUSH x: Add the integer $x$ to the window.
- FREQ x: Output the current frequency of $x$ in the window.
- DISTINCT: Output the number of distinct values currently present in the window.
- TOP k: Output at most $k$ distinct values currently present in the window, separated by spaces.

The values should be ordered primarily by higher frequency.If two values have the same frequency, break ties by selecting the smaller numerical value.If the window is currently empty, print EMPTY.

### Input Format
- The first line of input contains two space-separated integers $Q$ and $W$ — the number of operations and the maximum window size, respectively.
- The next $Q$ lines each contain a single operation in one of the formats described above (PUSH x, FREQ x, DISTINCT, or TOP k).
### Output Format

For each FREQ, DISTINCT, and TOP operation, print the required result on a new line.

### Constraints
- $1 \le Q \le 200000$
- $1 \le W \le 200000$
- $-10^9 \le x \le 10^9$
- The sum of $k$ over all TOP queries does not exceed $200000$.
### Sample 1:
Input
Output

```
7 1
PUSH 5
FREQ 5
PUSH 7
FREQ 5
DISTINCT
TOP 3
PUSH 7
```

```
1
0
1
7
```

### Explanation:

Since $W = 1$, the window can hold at most $1$ element at any time.

- PUSH 5: Window becomes [5].
- FREQ 5: $5$ appears $1$ time $\rightarrow$ Output 1.
- PUSH 7: Window size exceeds $W=1$, so $5$ is evicted. Window becomes [7].
- FREQ 5: $5$ is no longer in the window $\rightarrow$ Output 0.
- DISTINCT: Window is [7], so there is $1$ distinct element $\rightarrow$ Output 1.
- TOP 3: Requests top 3 distinct elements. Only $7$ exists in the window $\rightarrow$ Output 7.
- PUSH 7: Window size exceeds $W=1$, so the previous $7$ is evicted. Window becomes [7].

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:57:07.491Z  

```java
import java.io.*;
import java.util.*;

public class Main {

    static Map<Integer, Integer> frequency = new HashMap<>();

    static TreeMap<Integer, TreeSet<Integer>> valuesByFrequency =
            new TreeMap<>();

    static Set<Integer> distinctValues = new HashSet<>();

    static void changeFrequency(int value, int change) {
        int oldFrequency = frequency.getOrDefault(value, 0);

        if (oldFrequency > 0) {
            TreeSet<Integer> bucket =
                    valuesByFrequency.get(oldFrequency);

            bucket.remove(value);

            if (bucket.isEmpty()) {
                valuesByFrequency.remove(oldFrequency);
            }
        }

        int newFrequency = oldFrequency + change;

        if (newFrequency == 0) {
            frequency.remove(value);
            distinctValues.remove(value);
        } else {
            frequency.put(value, newFrequency);

            valuesByFrequency
                    .computeIfAbsent(
                            newFrequency,
                            ignored -> new TreeSet<>()
                    )
                    .add(value);

            distinctValues.add(value);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer =
                new StringTokenizer(reader.readLine());

        int queries = Integer.parseInt(tokenizer.nextToken());
        int windowSize = Integer.parseInt(tokenizer.nextToken());

        Queue<Integer> window = new LinkedList<>();
        StringBuilder answer = new StringBuilder();

        for (int query = 0; query < queries; query++) {
            tokenizer = new StringTokenizer(reader.readLine());
            String operation = tokenizer.nextToken();

            if (operation.equals("PUSH")) {
                int value = Integer.parseInt(tokenizer.nextToken());

                window.offer(value);
                changeFrequency(value, 1);

                if (window.size() > windowSize) {
                    int removed = window.poll();
                    changeFrequency(removed, -1);
                }

            } else if (operation.equals("FREQ")) {
                int value = Integer.parseInt(tokenizer.nextToken());

                answer.append(
                        frequency.getOrDefault(value, 0)
                ).append('\n');

            } else if (operation.equals("DISTINCT")) {
                answer.append(distinctValues.size()).append('\n');

            } else {
                int k = Integer.parseInt(tokenizer.nextToken());
                int printed = 0;

                for (Map.Entry<Integer, TreeSet<Integer>> entry
                        : valuesByFrequency
                            .descendingMap()
                            .entrySet()) {

                    for (int value : entry.getValue()) {
                        if (printed == k) {
                            break;
                        }

                        if (printed > 0) {
                            answer.append(' ');
                        }

                        answer.append(value);
                        printed++;
                    }

                    if (printed == k) {
                        break;
                    }
                }

                if (printed == 0) {
                    answer.append("EMPTY");
                }

                answer.append('\n');
            }
        }

        System.out.print(answer);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SWFREQBOARD)