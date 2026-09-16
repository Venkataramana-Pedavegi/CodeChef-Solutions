# BURGERS2 - Rating 1187

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Hungry Chef

Chef is very hungry. So, Chef goes to a shop selling burgers. The shop has $2$ types of burgers:

- Normal burgers, which cost $X$ rupees each
- Premium burgers, which cost $Y$ rupees each (where $Y \gt X$)

Chef has $R$ rupees. Chef wants to buy  **exactly**  $N$ burgers. He also wants to maximize the number of premium burgers he buys. Determine the number of burgers of both types Chef must buy.

Output $-1$ if it is not possible for Chef to buy $N$ burgers.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains four space-separated integers $X$, $Y$, $N$ and $R$ — the cost of a normal burger, the cost of a premium burger, the number of burgers Chef wants to buy and the amount of money Chef has.
### Output Format

For each test case, output on a new line two integers: the number of normal burgers and the number of premium burgers Chef must buy satisfying the given conditions.

Output $-1$ if he cannot buy $N$ burgers.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \le X \lt Y \le 1000$
- $1 \le N \le 10^6$
- $1 \le R \le 10^9$
### Sample 1:
Input
Output

```
4
2 10 4 12
4 8 10 50
99 100 5 10
9 10 10 200

```

```
4 0
8 2
-1
0 10

```

### Explanation:

 **Test case $1$:**  Chef has to buy $4$ normal burgers only. Even if he buys $1$ premium burger, he would not be able to buy $4$ burgers.

 **Test case $2$:**  Chef can buy $8$ normal burgers and $2$ premium burgers.

 **Test case $3$:**  It is not possible for Chef to buy $5$ burgers.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:36:26.386Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            HashMap<String, Long> map = new HashMap<>();

            map.put("X", sc.nextLong());
            map.put("Y", sc.nextLong());
            map.put("N", sc.nextLong());
            map.put("R", sc.nextLong());

            long X = map.get("X");
            long Y = map.get("Y");
            long N = map.get("N");
            long R = map.get("R");

            long minCost = N * X;

            if (R < minCost)
            {
                System.out.println("-1");
                continue;
            }

            long extra = R - minCost;

            // Extra cost of one premium burger
            long diff = Y - X;

            long premium = extra / diff;

            premium = Math.min(premium, N);

            long normal = N - premium;

            System.out.println(normal + " " + premium);
        }

        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BURGERS2)