# MATDIAGSUM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sum of Diagonals

Given a `N x N` square matrix, find the sum of both primary as well as secondary diagonal elements.

For eg. in the following matrix:

Sum of primary and secondary diagonal element = 3 + 2 + 0 + 4 + 5 = 14

### Input Format
- The first line of input will contain a single integer $N$, denoting the no. of rows and columns in input matrix
- Next $N$ lines contain $N$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line, the sum of diagonals elements.
### Constraints
- $1 \leq N \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
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
14
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T16:32:25.631Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println(sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATDIAGSUM)