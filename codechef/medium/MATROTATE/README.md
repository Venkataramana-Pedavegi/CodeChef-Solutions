# MATROTATE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Matrix Rotations

Given a `N x N` square matrix, rotate 90°  **clockwise**.

For eg. see the following rotation:

## Function Declaration
### Function Name

$rotateClockwise$

### Description

$rotateClockwise$ : rotates a given  **N × N square matrix**  by  **90 degrees clockwise**. The rotation should be performed  **in-place**, meaning the input matrix itself is modified without using any extra matrix.

### Parameters
- $matrix$ : A 2D array of integers of size $N \times N$ Represents the square matrix to be rotated.
### Return Value
- The function does not return anything.
- The input matrix is modified directly to reflect the rotated matrix.
## Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contains $N$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines, each containing $N$ space separated integers, the elements of rotated matrix.
- Follow up: Can you do it in-place by modifying the input matrix, without allocating extra space for another matrix ?
### Sample 1:
Input
Output

```
3
3 1 5
8 2 1
4 6 0
```

```
4 8 3
6 2 1
0 1 5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:00:47.964Z  

```java
public static void rotateClockwise(int[][] matrix) {
     int n = matrix.length;

    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
    }

    for (int i = 0; i < n; i++) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = matrix[i][left];
            matrix[i][left] = matrix[i][right];
            matrix[i][right] = temp;

            left++;
            right--;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATROTATE)