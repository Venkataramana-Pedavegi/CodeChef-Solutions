# MATRIXMEDIAN - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Matrix Median

You are given a  **row-wise sorted 2D matrix**  of size $N \times M$. Your task is to find the  **median**  of the matrix.

The  **median**  is the middle element after sorting all elements of the matrix in  **non-decreasing order**. It is guaranteed that $N \times M$ is  **odd**, so the median always exists.

## Function Declaration
### Function Name

$findMedian$ – This function finds the median of a row-wise sorted matrix.

### Parameters
- $matrix$ : A 2D array of integers of size $N \times M$, where each row is sorted in non-decreasing order.
- $N$ : The number of rows in the matrix.
- $M$ : The number of columns in the matrix.
### Return Value
- Returns a single integer — the median of the matrix.
## Constraints
- $1 ≤ N, M ≤ 10^5$
- $1 ≤ N \times M ≤ 10^6$
- $1 \leq matrix[i][j] \leq 10^9$
- $N \times M$ is odd
- Each row of the matrix is sorted in non-decreasing order
### Input Format

The first line contains two space-separated integers $N$ and $M$, denoting the number of rows and columns of the matrix.

Each of the next $N$ lines contains $M$ space-separated integers, denoting the elements of the matrix.

### Output Format

Print a single integer — the  **median**  of the matrix.

### Sample 1:
Input
Output

```
3 3
1 4 9
2 5 6
3 7 8

```

```
5
```

### Explanation:

If we flatten and sort the matrix, we get:
`1 2 3 4 5 6 7 8 9` The middle element is `5`, which is the median.

### Sample 2:
Input
Output

```
3 3
10 20 30
5 15 25
1 2 3

```

```
10
```

### Explanation:

Flattened array: `[10, 20, 30, 5, 15, 25, 1, 2, 3]` -> sorted `[1, 2, 3, 5, 10, 15, 20, 25, 30]`. Median = `10`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T03:52:02.269Z  

```java
static int countLessOrEqual(int[] row, int target) {
    int low = 0;
    int high = row.length - 1;
    
    // Binary search for upper bound: count elements <= target
    while (low <= high) {
        int mid = low + (high - low) / 2;
        if (row[mid] <= target) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }
    return low;
}

static int findMedian(int[][] matrix, int N, int M) {
    int low = Integer.MAX_VALUE;
    int high = Integer.MIN_VALUE;

    // Minimum element is in the first column; maximum element is in the last column
    for (int i = 0; i < N; i++) {
        low = Math.min(low, matrix[i][0]);
        high = Math.max(high, matrix[i][M - 1]);
    }

    // Since N * M is odd, median has (N * M) / 2 elements strictly smaller or equal
    int required = (N * M) / 2 + 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;
        int count = 0;

        for (int i = 0; i < N; i++) {
            count += countLessOrEqual(matrix[i], mid);
        }

        if (count < required) {
            low = mid + 1;
        } else {
            high = mid - 1;
        }
    }

    return low;
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATRIXMEDIAN)