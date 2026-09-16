# MATADD

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Two Matrices

Given two matrices of same size  **M x N**, add them and print the resultant matrix.

For eg., here we can see, the sum of matrices `A` and `B` is the matrix `A+B` at the rightmost side.

Let's say we have two matrices A and B of the same dimensions (**M x N**). The sum of these two matrices, denoted as C = A + B, is another matrix of the same dimensions where each element C[i][j] is the sum of the corresponding elements A[i][j] and B[i][j].

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the number of rows and columns of the two input matrices.
- Next $N$ lines contains $M$ space separated integers, the elements of first matrix.
- Similarly, next $N$ lines contains $M$ space separated integers, the elements of second matrix.
### Output Format

Output $N$ lines contains $M$ space separated integers, the elements of resultant matrix.

### Constraints
- $1 \leq N, M \leq 1000$
- The elements of both the matrices are non-negative and won't exceed $100000$.
### Sample 1:
Input
Output

```
2 3
2 3 4
4 5 6
1 7 4 
6 4 9
```

```
3 10 8
10 9 15
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:35:28.267Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows
        int M = sc.nextInt(); // columns

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // Read first matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read second matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Add and print matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATADD)