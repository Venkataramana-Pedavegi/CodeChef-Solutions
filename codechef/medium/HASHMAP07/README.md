# HASHMAP07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Nearest Score Finder

You are given the scores of $N$ students. Store each score and the corresponding student name using a `TreeMap`.

After storing the data, process $Q$ queries.

For each query score $X$, print:

- The student with the highest score strictly less than $X$.
- The student with the lowest score strictly greater than $X$.

Use the `lowerKey()` and `higherKey()` methods of `TreeMap`.

If no lower or higher score exists, print `None` for that value.

### Input Format
- The first line contains an integer $N$.
- The next $N$ lines contain a student name and score.
- The next line contains an integer $Q$.
- The next $Q$ lines contain a query score $X$.

All student scores are unique.

### Output Format

For each query, print:

```
Lower: name score
Higher: name score

```

If a corresponding score does not exist, print:

```
Lower: None

```

or

```
Higher: None

```

### Sample 1:
Input
Output

```
5
Alice 70
Bob 85
Charlie 60
David 95
Emma 80
3
75
85
100
```

```
Lower: Alice 70
Higher: Emma 80
Lower: Emma 80
Higher: David 95
Lower: David 95
Higher: None
```

### Explanation:

For the query $75$:

- lowerKey(75) returns $70$.
- higherKey(75) returns $80$.

Therefore, Alice and Emma are the nearest students below and above the given score.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:18:30.049Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeMap<Integer, String> scores = new TreeMap<>();

        for (int i = 0; i < n; i++)
        {
            String name = sc.next();
            int score = sc.nextInt();

            scores.put(score, name);
        }

        int q = sc.nextInt();

        while (q-- > 0)
        {
            int x = sc.nextInt();

            Integer lower = scores.lowerKey(x);
            Integer higher = scores.higherKey(x);

            if (lower == null)
            {
                System.out.println("Lower: None");
            }
            else
            {
                System.out.println(
                    "Lower: " + scores.get(lower) + " " + lower
                );
            }

            if (higher == null)
            {
                System.out.println("Higher: None");
            }
            else
            {
                System.out.println(
                    "Higher: " + scores.get(higher) + " " + higher
                );
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP07)