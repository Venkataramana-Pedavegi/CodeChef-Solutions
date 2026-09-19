# MATMAXISLAND

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Maximum Area Island

Given is a `N x M` binary matrix which represents islands. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.

The area of an island is the number of cells with a value `1` in the island.

Return the maximum area of an island in matrix. If there is no island, return `0`.

For eg., in the following matrix:

Maximum area of island is:  **5**  (lands are highlighted in maximum area island).

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines containing $M$ space separated integers, the elements of the matrix.
### Output Format
- Output on a single line the maximum area of the island.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 1
0 1 1
```

```
6
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T13:45:07.701Z  

```java
import java.util.*;

class Main {

    static int n, m;
    static int[][] mat;

    static int dfs(int r, int c) {

        // Boundary or water
        if (r < 0 || r >= n || c < 0 || c >= m || mat[r][c] == 0) {
            return 0;
        }

        // Mark as visited
        mat[r][c] = 0;

        // Count current cell
        int area = 1;

        // Up
        area += dfs(r - 1, c);

        // Down
        area += dfs(r + 1, c);

        // Left
        area += dfs(r, c - 1);

        // Right
        area += dfs(r, c + 1);

        return area;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 1) {
                    int area = dfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(maxArea);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXISLAND)