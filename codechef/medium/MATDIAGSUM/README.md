# MATDIAGSUM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Diagonals

Given a `N x N` square matrix, find the sum of both primary as well as secondary diagonal elements.

For eg. in the following matrix:

Sum of primary and secondary diagonal element = 3 + 2 + 0 + 4 + 5 = 14

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contain $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the sum of diagonals elements.
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3
3 1 5
8 2 1
4 6 0
```

```
14
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:40:31.761Z  

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
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];

            if (i != N - 1 - i) {
                sum += matrix[i][N - 1 - i];
            }
        }

        System.out.println(sum);

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATDIAGSUM)