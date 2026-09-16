# MATZIGZAG

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Zig-zag traversal

Given a `N x M` matrix, print its element in zig-zag fashion, i.e., print first row from left to right, second row from right to left, third row again from left to right and so on.

For eg., for the following matrix :

Output should be: 4 6 0 1 2 8 3 1 5

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, $N*M$ elements of the given matrix in zig-zag fashion.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
4 6 0
8 2 1
3 1 5

```

```
4 6 0 1 2 8 3 1 5 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:37:20.829Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < M; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATZIGZAG)