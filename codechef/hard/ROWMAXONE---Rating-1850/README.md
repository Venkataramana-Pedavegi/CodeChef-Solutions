# ROWMAXONE - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-03T03:52:05.026Z  

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

[View on CodeChef](https://www.codechef.com/problems/ROWMAXONE)