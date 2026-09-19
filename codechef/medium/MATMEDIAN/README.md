# MATMEDIAN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Median in Matrix

Given a `N x M` row-wise sorted matrix, find the median of the matrix. (*Note:*  `N*M` is always odd)

For eg., in the following matrix:

If we place all elements in the sorter order: 2 3 4 4 4 5 6 6 7

Then the median of the matrix is: `4`

 **Follow up:**  Can you solve it in better time than  **O(NMlog(NM))**  and without taking extra space ?

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the median of the matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
- The elements in each row are sorted in non-decreasing order.
- N*M is always odd
### Sample 1:
Input
Output

```
3 3
3 4 5
2 4 6
4 6 7
```

```
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T13:50:23.007Z  

```java
import java.util.*;

class Main {

    // Count elements <= x in one sorted row
    static int countLessEqual(int[] row, int x) {

        int low = 0;
        int high = row.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (row[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // low = number of elements <= x
        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                mat[i][j] = sc.nextInt();

                // Minimum element
                low = Math.min(low, mat[i][j]);

                // Maximum element
                high = Math.max(high, mat[i][j]);
            }
        }

        int required = (n * m) / 2 + 1;

        // Binary search on answer
        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < n; i++) {
                count += countLessEqual(mat[i], mid);
            }

            if (count < required) {
                // Median is greater
                low = mid + 1;
            } else {
                // Median can be mid or smaller
                high = mid;
            }
        }

        System.out.println(low);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMEDIAN)