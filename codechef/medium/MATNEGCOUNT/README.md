# MATNEGCOUNT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Negative Numbers

Given a `N x M` matrix which is sorted in non-increasing order both row-wise and column-wise, count the number of negative numbers in matrix.

For eg, in the following matrix:

There are total `6` negative numbers.

 *Note:*  It's easy to solve this problem in  **O(N*M)**  time, can you do it in  **O(N + M)** ?

### Input Format
- The first line of input contains two space separated integers $N$ and $M$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the count of negative integers in the given matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The absolute value of the matrix's elements doesn't exceed $100000$.
### Sample 1:
Input
Output

```
3 4
8 7 6 -1
7 7 -1 -2
4 -5 -6 -7

```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T16:33:35.071Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = m - 1;
        int count = 0;

        while (row < n && col >= 0) {

            if (matrix[row][col] < 0) {

                // Everything below this element in this column
                // is also negative.
                count += n - row;

                col--;

            } else {

                // Current element is non-negative.
                // Move down to find negatives.
                row++;
            }
        }

        System.out.println(count);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATNEGCOUNT)