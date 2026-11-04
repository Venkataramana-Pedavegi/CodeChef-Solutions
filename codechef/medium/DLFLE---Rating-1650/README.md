# DLFLE - Rating 1650

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T07:56:17.997Z  

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

[View on CodeChef](https://www.codechef.com/problems/DLFLE)