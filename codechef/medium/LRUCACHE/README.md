# LRUCACHE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:57:12.612Z  

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

[View on CodeChef](https://www.codechef.com/problems/LRUCACHE)