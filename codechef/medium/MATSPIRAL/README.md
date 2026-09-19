# MATSPIRAL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print Matrix In Spiral Fashion

Given an `N x M` integer matrix, print its element in spiral fashion (clockwise).

See the following example:

Output should be: 1 2 3 4 8 12 11 10 9 5 6 7

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on $N*M$ space separated integers, the elements of input matrix in spiral fashion.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 4
1 2 3 4
5 6 7 8
9 10 11 12

```

```
1 2 3 4 8 12 11 10 9 5 6 7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T13:43:48.246Z  

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

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right)
        {
            for (int j = left; j <= right; j++)
            {
                System.out.print(mat[top][j] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++)
            {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (top <= bottom)
            {
                for (int j = right; j >= left; j--)
                {
                    System.out.print(mat[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATSPIRAL)