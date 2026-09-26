# MATMINPATH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Path With Minimum Sum

Given a `N x M` matrix with non-negative integers, find the minimum sum of path cells from top left cell to bottom right cell. You can only move right or downward from any cell without exiting the matrix boundary.

For eg., in the following matrix :

Minimum path sum =  **13**  (highlighted cells are minimum path cells).

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the minimum sum of path cells from top left cell to bottom right cell
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
4 3 0
8 2 1
3 1 5

```

```
13
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-26T18:11:23.805Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] dp = new int[n][m];

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Starting cell
        dp[0][0] = arr[0][0];

        // First row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }

        // First column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        // Remaining cells
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = arr[i][j] +
                           Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println(dp[n - 1][m - 1]);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMINPATH)