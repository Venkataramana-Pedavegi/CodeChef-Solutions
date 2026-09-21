# MATMULTIPLIC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Brute Force- Multiplication of Two Matrices

Matrix multiplication involves combining the rows of the first matrix with the columns of the second matrix to produce a new matrix. Specifically, let's say we have two matrices A and B, where A has dimensions  **M x N**  (M rows, N columns), and B has dimensions  **N x P**  (N rows, P columns). The resulting matrix C from the multiplication, denoted as C = A * B, will have dimensions  **M x P**.

To compute the element at position C[i][j] in the resulting matrix C, we take the dot product of the $i^{\text{th}}$ row of matrix A and the $j^{\text{th}}$ column of matrix B.

Mathematically, if A is represented as:

A = [[a11, a12,..., a1n], [a21, a22,..., a2n],..., [am1, am2,..., amn]]

and B is represented as:

B = [[b11, b12,..., b1p], [b21, b22,..., b2p],..., [bn1, bn2,..., bnp]]

then the resulting matrix C is calculated as:

C = [[c11, c12,..., c1p], [c21, c22,..., c2p],..., [cm1, cm2,..., cmp]]

where each element cij in matrix C is computed as:

cij = a[i][1] *b[1][j] + a[i][2]* b[2][j] +... + a[i][n]*b[n][j]

In other words, each element cij in the resulting matrix C is obtained by multiplying the corresponding elements of the ith row of matrix A with the corresponding elements of the jth column of matrix B and summing up the products.

For eg, see the multiplication of following two matrices:

### Input Format
- The first line of input will contain two space separated integers $M$ and $N$, denoting the number of rows and columns of the first matrix.
- Next $M$ lines contains $N$ space separated integers, the elements of first matrix.
- Next line contain two space separated integers $N$ and $P$, denoting the number of rows and columns of the second matrix.
- Next $N$ lines contains $P$ space separated integers, the elements of second matrix.
### Output Format

Output $M$ lines, each containing $P$ space separated integers, the elements of multiplication matrix of first and second input matrices.

### Constraints
- $1 \leq N, M, P \leq 100$
- The elements of both the matrices are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
2 3
2 3 4
4 5 6
3 2
1 2
3 4
2 2
```

```
19 24 
31 40 
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T16:35:23.844Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dimensions of first matrix
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] A = new int[M][N];

        // Input first matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Dimensions of second matrix
        int N2 = sc.nextInt();
        int P = sc.nextInt();

        int[][] B = new int[N2][P];

        // Input second matrix
        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Result matrix: M × P
        int[][] C = new int[M][P];

        // Matrix multiplication
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < P; j++) {

                for (int k = 0; k < N; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < P; j++) {
                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMULTIPLIC)