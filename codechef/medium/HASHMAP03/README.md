# HASHMAP03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Leaderboard Sorting Using HashMap

A quiz application stores user scores in a `HashMap<String, Integer>`, where:

- the key represents the username;
- the value represents the user's score.

Your task is to sort the leaderboard by score.

### Task

Complete the function:

```
sortMapByValueDescending()

```

The function receives a `HashMap<String, Integer>` and must return a `List<Map.Entry<String, Integer>>` sorted using the following rules:

- Higher scores come first.
- If two users have the same score, sort their usernames alphabetically.

The `main()` method is already provided and must not be modified.

### Input Format
- The first line contains an integer $N$, the number of users.
- The next $N$ lines contain:

```
username score

```

### Output Format

Print each user in the format:

```
username: score

```

in the required sorted order.

### Sample 1:
Input
Output

```
4
alice 250
bob 450
carol 300
dave 400

```

```
bob: 450
dave: 400
carol: 300
alice: 250
```

### Explanation:

The scores in descending order are:

$$ 450 > 400 > 300 > 250 $$

Therefore, `bob` appears first and `alice` appears last.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:14:52.604Z  

```java
import java.util.*;

public class Main
{
    public static List<Map.Entry<String, Integer>>
        sortMapByValueDescending(
            HashMap<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(map.entrySet());

        list.sort(
            (a, b) ->
            {
                int scoreCompare =
                    Integer.compare(
                        b.getValue(),
                        a.getValue()
                    );

                if (scoreCompare != 0)
                {
                    return scoreCompare;
                }

                return a.getKey()
                        .compareTo(b.getKey());
            }
        );

        return list;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map =
            new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            String username = sc.next();
            int score = sc.nextInt();

            map.put(username, score);
        }

        List<Map.Entry<String, Integer>> sortedList =
            sortMapByValueDescending(map);

        for (Map.Entry<String, Integer> entry
                : sortedList)
        {
            System.out.println(
                entry.getKey() + ": " +
                entry.getValue()
            );
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP03)