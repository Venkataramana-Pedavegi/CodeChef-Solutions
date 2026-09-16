# MATNEGCOUNT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Negative Numbers

Given a `N x M` matrix which is sorted in non-increasing order both row-wise and column-wise, count the number of negative numbers in matrix.

For eg, in the following matrix:

There are total `6` negative numbers.

 *Note:*  It's easy to solve this problem in  **O(N*M)**  time, can you do it in  **O(N + M)** ?

### Input Format
- The first line of input contains two space separated integers $N$ and $M$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the count of negative integers in the given matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The absolute value of the matrix's elements doesn't exceed $100000$.
### Sample 1:
Input
Output

```
3 4
8 7 6 -1
7 7 -1 -2
4 -5 -6 -7

```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:43:44.816Z  

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

        int i = 0;
        int j = M - 1;
        int count = 0;

        while (i < N && j >= 0) {

            if (matrix[i][j] < 0) {
                count += N - i;
                j--;
            } else {
                i++;
            }
        }

        System.out.println(count);

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATNEGCOUNT)