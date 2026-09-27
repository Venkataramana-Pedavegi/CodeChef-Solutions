# MATSEARCH

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Search In Matrix

You are given an `N x M` integer matrix with the following properties:

- Each row of the matrix is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.

Given an integer `X`, determine whether it exists in the matrix.

Write a solution with a time complexity of  **O(log(NM))**.

### Input Format
- The first line of input will contain three space separated integers $N$, $M$ and $X$, denoting the no. of rows and columns in the input matrix along with the integer which needs to be searched in matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line YES if X exists in the the given matrix, else NO.
### Constraints
- $0 \leq N, M \leq 100$
- $0 \leq X \leq 100000$
- The elements of the matrix are non-negative and won't exceed $100000$.
- Each row of the matrix is sorted in non-decreasing order.
- The first integer of each row is greater than the last integer of the previous row.
### Sample 1:
Input
Output

```
3 4 7
1 2 3 4
5 6 7 8
9 10 11 12

```

```
YES
```

### Sample 2:
Input
Output

```
3 4 7
1 2 3 4
5 6 6 8
9 10 11 12

```

```
NO
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:12:25.408Z  

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
        int x = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Binary Search
        int low = 0;
        int high = n * m - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == x)
            {
                System.out.println("YES");
                return;
            }
            else if (matrix[row][col] < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("NO");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATSEARCH)