# PEAKELEMENTS - Rating 1650

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find a Peak Element II

You are given a  **2D matrix**  $mat$ of size $m \times n$ consisting of positive integers. An element $mat[i][j]$ is called a  **peak element**  if it is strictly greater than all of its adjacent neighbours (up, down, left, right).

You need to find  **a peak element**  in the matrix.

If multiple peak elements exist,  **return any one of them**.

Output the position of the peak as $[i, j]$ (0-indexed).

You can assume that the matrix is surrounded by an outer perimeter of $-1$ (for comparison), and no two adjacent cells are equal.

Your solution must run in $O(m \log n)$ or $O(n \log m)$ time.

## Function Declaration
### Function Name

$findPeakGrid$ – This function finds the position of a peak element in a 2D grid.

### Parameters
- $m$ : An integer representing the number of rows in the matrix.
- $n$ : An integer representing the number of columns in the matrix.
- $mat$ : A 2D array/matrix of integers.
### Return Value
- Returns a list/array/pair containing exactly two integers $[i, j]$, where $i$ is the row index and $j$ is the column index of the peak element.
## Constraints
- $1 \le m, n \le 500$
- $1 \le mat[i][j] \le 2.5 \times 10^5$
- No two adjacent cells are equal
- The matrix is conceptually surrounded by $-1$
- At least one peak element always exists
- Time complexity must be $O(m \log n)$ or $O(n \log m)$
### Input Format
- The first line contains two space-separated integers $m$ and $n$ — the number of rows and columns.
- The next $m$ lines each contain $n$ space-separated integers representing the matrix elements.
### Output Format

Print two  **space-separated integers**  $i$ and $j$ — the position of the  **peak**.

### Sample 1:
Input
Output

```
2 2
1 4
3 2

```

```
0 1
```

### Explanation:

Peaks are `[0,1] = 4` and `[1,0] = 3`. So both answers are correct.

### Sample 2:
Input
Output

```
3 3
10 20 15
21 30 14
7 16 32

```

```
1 1

```

### Explanation:

Peaks are `[1,1] = 30` and `[2,2] = 32`. So both answers are correct

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T03:55:31.850Z  

```java
public static int[] findPeakGrid(int m, int n, int[][] mat) {
    int low = 0;
    int high = n - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        // Find the index of the maximum element in column 'mid'
        int maxRow = 0;
        for (int i = 0; i < m; i++) {
            if (mat[i][mid] > mat[maxRow][mid]) {
                maxRow = i;
            }
        }

        // Conceptual perimeter values are -1
        int leftVal = (mid > 0) ? mat[maxRow][mid - 1] : -1;
        int rightVal = (mid + 1 < n) ? mat[maxRow][mid + 1] : -1;

        if (mat[maxRow][mid] > leftVal && mat[maxRow][mid] > rightVal) {
            return new int[]{maxRow, mid};
        } else if (leftVal > mat[maxRow][mid]) {
            high = mid - 1;
        } else {
            low = mid + 1;
        }
    }

    return new int[]{-1, -1};
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PEAKELEMENTS)