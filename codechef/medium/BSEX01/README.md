# BSEX01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Search in a 2D Matrix

You are given an  **N × M**  matrix where:

- Each row is sorted in ascending order.
- The first integer of each row is greater than the last integer of the previous row.

Your task is to find if an integer  **Target**  exists in the matrix.

 **Note:**  You must implement a solution with a time complexity faster than  **O(N + M)**.

### Input Format
- The first line contains two integers, N and M, separated by a space, representing the number of rows and columns in the matrix, respectively.
- The next N lines each contain M integers, representing the elements of the matrix.
- The final line contains a single integer, Target, which is the value to search for in the matrix.
### Output Format
- Print YES if the Target exists in the matrix.
- Print NO otherwise.
### Constraints
- $1 \leq m, n \leq 100$
- $-10^4 \leq \text{matrix}[i][j], \text{target} \leq 10^4$
- The matrix is guaranteed to be non-empty and sorted.
### Sample 1:
Input
Output

```
3 4
1 3 5 7 
10 11 16 20 
23 30 34 60
3

```

```
YES
```

### Explanation:
- Test case 1: The target 3 exists in the matrix
### Sample 2:
Input
Output

```
3 4
1 3 5 7 
10 11 16 20 
23 30 34 60
13
```

```
NO
```

### Explanation:
- Test case 2: The target 13 does not exists in the matrix

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:26:40.928Z  

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

        // Read matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read target
        int target = sc.nextInt();

        // Binary Search
        int low = 0;
        int high = n * m - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // Convert 1D index to 2D index
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
            {
                System.out.println("YES");
                return;
            }
            else if (matrix[row][col] < target)
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

[View on CodeChef](https://www.codechef.com/problems/BSEX01)