# FREQRANK

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sliding Window Frequency Board

You are given an array $A$ of $N$ integers ($1$-indexed). For every distinct value present in the array, we define three properties:

- Frequency: The total number of times the value appears in $A$.
- First Occurrence: The smallest index $i$ ($1 \le i \le N$) where $A[i]$ appears in the array.
- Numerical Value: The actual integer value itself.

Distinct values are ranked according to the following tie-breaking rules:

- Higher frequency comes first.
- If frequencies are equal, smaller first occurrence index comes first.
- If first occurrence indices are also equal, smaller numerical value comes first.

You need to process $Q$ queries. Each query is one of the following three types:

- SET i x : Update the element at index $i$ to $x$ (i.e., $A[i] = x$).
- COUNT x : Print the current frequency of the integer $x$ in array $A$.
- TOP k : Print the first $k$ distinct values currently present in the array according to the ranking rules, separated by spaces. If there are fewer than $k$ distinct values in the array, print all distinct values in ranked order.
### Input Format
- The first line of input contains two space-separated integers $N$ and $Q$ — the size of the array and the number of queries, respectively.
- The second line contains $N$ space-separated integers $A_1, A_2, \dots, A_N$ — representing the initial state of the array.
- The next $Q$ lines each contain a query in one of the formats described above (SET i x, COUNT x, or TOP k).
### Output Format

For each COUNT and TOP query, print the required result on a new line.

### Constraints
- $1 \le N, Q \le 200000$
- $1 \le i \le N$
- $-10^9 \le A_i, x \le 10^9$
- $1 \le k \le N$
### Sample 1:
Input
Output

```
1 5
10
TOP 3
SET 1 10
COUNT 10
SET 1 -5
TOP 2
```

```
10
1
-5
```

### Explanation:
- Initially: Array $A = [10]$.
- TOP 3: Only $10$ exists in the array $\rightarrow$ Output 10.
- SET 1 10: $A[1]$ is set to $10$. Array remains $A = [10]$.
- COUNT 10: $10$ appears $1$ time $\rightarrow$ Output 1.
- SET 1 -5: $A[1]$ is updated to $-5$. Array becomes $A = [-5]$.
- TOP 2: Only $-5$ exists in the array $\rightarrow$ Output -5.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:58:44.402Z  

```java
import java.io.*;
import java.util.*;

public class Main {

    static class Info {
        int value;
        TreeSet<Integer> positions = new TreeSet<>();

        Info(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer =
                new StringTokenizer(reader.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int queries = Integer.parseInt(tokenizer.nextToken());

        List<Integer> array = new ArrayList<>(n);
        Map<Integer, Info> information = new HashMap<>();

        tokenizer = new StringTokenizer(reader.readLine());

        for (int index = 1; index <= n; index++) {
            int value = Integer.parseInt(tokenizer.nextToken());

            array.add(value);

            information
                    .computeIfAbsent(value, Info::new)
                    .positions
                    .add(index);
        }

        Comparator<Info> rankingComparator = (first, second) -> {
            int comparison =
                    Integer.compare(
                            second.positions.size(),
                            first.positions.size()
                    );

            if (comparison != 0) {
                return comparison;
            }

            comparison =
                    Integer.compare(
                            first.positions.first(),
                            second.positions.first()
                    );

            if (comparison != 0) {
                return comparison;
            }

            return Integer.compare(first.value, second.value);
        };

        TreeSet<Info> ranking =
                new TreeSet<>(rankingComparator);

        ranking.addAll(information.values());

        StringBuilder answer = new StringBuilder();

        for (int query = 0; query < queries; query++) {
            tokenizer = new StringTokenizer(reader.readLine());
            String operation = tokenizer.nextToken();

            if (operation.equals("SET")) {
                int index = Integer.parseInt(tokenizer.nextToken());
                int newValue = Integer.parseInt(tokenizer.nextToken());

                int oldValue = array.get(index - 1);

                if (oldValue == newValue) {
                    continue;
                }

                Info oldInfo = information.get(oldValue);

                ranking.remove(oldInfo);
                oldInfo.positions.remove(index);

                if (oldInfo.positions.isEmpty()) {
                    information.remove(oldValue);
                } else {
                    ranking.add(oldInfo);
                }

                Info newInfo = information.get(newValue);

                if (newInfo == null) {
                    newInfo = new Info(newValue);
                    information.put(newValue, newInfo);
                } else {
                    ranking.remove(newInfo);
                }

                newInfo.positions.add(index);
                ranking.add(newInfo);

                array.set(index - 1, newValue);

            } else if (operation.equals("COUNT")) {
                int value = Integer.parseInt(tokenizer.nextToken());
                Info info = information.get(value);

                answer.append(
                        info == null ? 0 : info.positions.size()
                ).append('\n');

            } else {
                int k = Integer.parseInt(tokenizer.nextToken());
                int printed = 0;

                for (Info info : ranking) {
                    if (printed == k) {
                        break;
                    }

                    if (printed > 0) {
                        answer.append(' ');
                    }

                    answer.append(info.value);
                    printed++;
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

[View on CodeChef](https://www.codechef.com/problems/FREQRANK)