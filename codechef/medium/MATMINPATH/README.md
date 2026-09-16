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
**Submitted:** 2026-09-16T06:15:43.068Z  

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

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (i == 0 && j == 0)
                {
                    continue;
                }
                else if (i == 0)
                {
                    mat[i][j] += mat[i][j - 1];
                }
                else if (j == 0)
                {
                    mat[i][j] += mat[i - 1][j];
                }
                else
                {
                    mat[i][j] += Math.min(
                        mat[i - 1][j],
                        mat[i][j - 1]
                    );
                }
            }
        }

        System.out.println(mat[n - 1][m - 1]);

        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMINPATH)