# DPNMAO19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Zero Matrix

A research lab is analyzing cellular samples arranged in an $m \times n$ grid. A contamination event has occurred. The safety protocol dictates that if any cell in the grid is found to be contaminated (represented by a value of $0$), its entire row and column must be neutralized by setting all their cells to 0.

Your task is to write a program that takes the initial state of the grid and returns the final state after the safety protocol is applied.

### Input Format
- The first line contains two space separated integers, $M$ and $N$, representing the number of rows and columns in the matrix.
- The next $M$ lines each contain $N$ space separated integers, representing the elements of the matrix.
### Output Format
- Print the modified matrix. Each row should be on a new line, with elements separated by a space.
### Constraints
- $1 \le M, N \le 1000$
- $-10^9 \le \text{matrix}[i][j] \le 10^9$
### Sample 1:
Input
Output

```
3 3
1 1 1
1 0 1
1 1 1
```

```
1 0 1
0 0 0
1 0 1
```

### Sample 2:
Input
Output

```
3 4
0 1 2 0
3 4 5 2
1 3 1 5
```

```
0 0 0 0
0 4 5 0
0 3 1 0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:39:51.082Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO19)