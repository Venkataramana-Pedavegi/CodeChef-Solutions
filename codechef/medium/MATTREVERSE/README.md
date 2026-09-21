# MATTREVERSE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-21T16:30:21.782Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Zig-zag traversal
        for (int i = 0; i < n; i++) {

            if (i % 2 == 0) {

                // Even row → left to right
                for (int j = 0; j < m; j++) {
                    System.out.print(matrix[i][j] + " ");
                }

            } else {

                // Odd row → right to left
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATTREVERSE)