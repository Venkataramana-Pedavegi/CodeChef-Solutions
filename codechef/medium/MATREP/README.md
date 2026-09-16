# MATREP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix Representation

Lets Implement the matrix.

### Task
- Choose whatever programming language you're comfortable in, and declare a 2D array for a square matrix.
- Store all the integers from 1 to $N^{\text{2}}$ in it.
- Print all the the integers from left to right going down in the matrix.
### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in square matrix.
### Output Format
- Output on a single line, $N^{\text{2}}$ space separated integers from 1 to $N^{\text{th}}$, the elements of the matrix.
### Constraints
- $1 \leq N \leq 100$
### Sample 1:
Input
Output

```
3
```

```
1 2 3 4 5 6 7 8 9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:30:01.730Z  

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

        int num = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = num++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATREP)