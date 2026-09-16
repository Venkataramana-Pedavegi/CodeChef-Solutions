# MATSORTDIAG

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort Matrix Diagonally

Given a `N x M` matrix, sort its elements diagonally. For eg. see the following matrix and its diagonal sorting:

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the input matrix.
- Next $N$ lines contains $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines, each containing $M$ space separated integers, the elements of diagonally sorted matrix.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are non-negative and won't exceed $1000$.
### Sample 1:
Input
Output

```
3 3
3 1 5
8 2 1
4 6 0
```

```
0 1 5
6 2 1
4 8 3
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:51:40.345Z  

```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.PriorityQueue;

public class Main {
    public static int[][] diagonalSort(int[][] mat) {
        int row = mat.length, col = mat[0].length;
        HashMap<Integer, PriorityQueue<Integer>> d = new HashMap<>();
        
        // Group elements by their diagonal key (i - j)
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                if (!d.containsKey(key)) {
                    d.put(key, new PriorityQueue<>());
                }
                d.get(key).offer(mat[i][j]);
            }
        }
        
        // Put the sorted elements back into the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int key = i - j;
                mat[i][j] = d.get(key).poll();
            }
        }
        
        return mat;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] mat = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        mat = diagonalSort(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATSORTDIAG)