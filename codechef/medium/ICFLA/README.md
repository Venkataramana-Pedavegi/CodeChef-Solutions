# ICFLA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ice Cream Flavours

Tema makes ice cream cones using  **exactly two balls**. Each ball has a flavour represented by a positive integer.

A cone may contain two balls of the same flavour or two different flavours. The order of the balls does not matter, so $\{1,2\}$ and $\{2,1\}$ represent the same type, while $\{1,1\}$ and $\{1,2\}$ represent different types.

Tema does not need to make all cones at the same time, so the same balls may be reused for different cones. However, to make a cone of type $\{x,x\}$, he must have at least two balls of flavour $x$.

Given an integer $N$, find the  **minimum number of balls**  Tema must have so that he can make exactly $N$ different types of ice cream.

### Input Format
- The first line contains an integer $N$ — the number of different ice cream types Tema wants to make.
### Output Format
- Print a single integer — the minimum number of balls required.
### Constraints
- $1 \le N \le 10^{18}$
### Sample 1:
Input
Output

```
6
```

```
4
```

### Explanation:

With $4$ balls of distinct flavours, for example $\{1,2,3,4\}$, Tema can make $6$ different types:

$\{1,2\},\{1,3\},\{1,4\},\{2,3\},\{2,4\},\{3,4\}$.

With fewer than $4$ balls, it is not possible to make $6$ different types.

Therefore, the minimum number of balls required is  **4**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:37:00.622Z  

```java
import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;
        
        long n = sc.nextLong();

        // Binary search for the maximum k such that k * (k - 1) / 2 <= n
        long low = 1;
        long high = 2000000000L; // ~2 * 10^9 because (2e9 * (2e9 - 1)) / 2 > 10^18
        long bestK = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long combinations = mid * (mid - 1) / 2;

            if (combinations <= n) {
                bestK = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long distinctPairs = bestK * (bestK - 1) / 2;
        long remaining = n - distinctPairs;
        long totalBalls = bestK + remaining;

        System.out.println(totalBalls);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ICFLA)