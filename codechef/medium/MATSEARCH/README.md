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
**Submitted:** 2026-09-19T13:47:22.839Z  

```java
import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int low = 0;
        int high = n * m - 1;

        boolean found = false;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Convert 1D index to 2D index
            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == x) {
                found = true;
                break;
            }
            else if (mat[row][col] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATSEARCH)