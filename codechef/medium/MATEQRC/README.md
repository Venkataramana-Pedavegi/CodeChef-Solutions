# MATEQRC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Equal Rows and Columns

Given a `N x N` integer matrix, find the no. of pairs of row and column which are equal.

For eg. in the following matrix:

Number of equal pairs of row and columns is:  **2**  (Row 2 and column 2 are equal. Similarly, row 3 and column 3 are also equal)

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the no. of pairs of row and columns which are equal.
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed 1000.
### Sample 1:
Input
Output

```
4
9 0 0 3
0 1 1 5
0 1 1 5
8 5 5 1
```

```
4
```

### Explanation:

Row 2 and column 2 are equal.

Row 2 and column 3 are equal.

Row 3 and column 2 are equal.

Row 3 and column 3 are equal.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:10:20.512Z  

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

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                boolean equal = true;

                for (int k = 0; k < n; k++)
                {
                    if (matrix[i][k] != matrix[k][j])
                    {
                        equal = false;
                        break;
                    }
                }

                if (equal)
                {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATEQRC)