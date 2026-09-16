# MATMAXROW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Row With Maximum Ones

Find the row with maximum no. of 1’s in a row-wise sorted binary matrix. If there are many such rows, print the first one.

For eg. in the following matrix:

Both row `2` and row `4` has maximum number of 1's, hence the answer would be  **2**  as its the first row which has maximum 1's.

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the row-wise sorted binary matrix.
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the row number which has maximum 1's.
- Follow up: can you solve it in better than O(N*M) time complexity?
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
- Matrix is row-wise sorted.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 1
0 1 1
```

```
1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:05:06.883Z  

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

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int maxOnes = 0;
        int answer = 1;

        for (int i = 0; i < n; i++)
        {
            int left = 0;
            int right = m - 1;
            int firstOne = m;

            while (left <= right)
            {
                int mid = left + (right - left) / 2;

                if (matrix[i][mid] == 1)
                {
                    firstOne = mid;
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }

            int ones = m - firstOne;

            if (ones > maxOnes)
            {
                maxOnes = ones;
                answer = i + 1;
            }
        }

        System.out.println(answer);

        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXROW)