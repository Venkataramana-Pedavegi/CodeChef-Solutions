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
**Submitted:** 2026-09-26T18:16:55.941Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static int n, m;
    static int[][] grid;

    static int dfs(int i, int j)
    {
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] == 0) {
            return 0;
        }

        grid[i][j] = 0;

        int area = 1;

        area += dfs(i - 1, j); // Up
        area += dfs(i + 1, j); // Down
        area += dfs(i, j - 1); // Left
        area += dfs(i, j + 1); // Right

        return area;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        grid = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == 1) {
                    int area = dfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        System.out.println(maxArea);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMAXISLAND)