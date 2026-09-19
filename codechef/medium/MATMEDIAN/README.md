# MATMEDIAN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distance to Nearest 0

Given is a `N x M` binary matrix, for each cell find its distance from the nearest `0`.

 **Note:**  Distance between vertically or horizontally adjacent cells is `1`. (See the sample input/output for more clarity)

### Input Format
- The first line of input will contain two space separated integers $N$ and $M$, denoting the no. of rows and columns in the matrix.
- Next $N$ lines containing $M$ space separated integers, the elements of the matrix.
### Output Format
- Output $N$ lines containing $M$ space separated integers, the distance of each cell from nearest 0.
### Constraints
- $1 \leq N, M \leq 100$
- The elements of the matrix are either 0 or 1.
- There is at least one 0 in the matrix.
### Sample 1:
Input
Output

```
3 3
0 1 1
0 1 0
1 1 1
```

```
0 1 1
0 1 0
1 2 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T13:49:27.528Z  

```java
import java.util.*;

class Main {

    static int n, m;

    static int[] dr = {-1, 1, 0, 0};
    static int[] dc = {0, 0, -1, 1};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        int[][] mat = new int[n][m];
        int[][] dist = new int[n][m];

        Queue<int[]> q = new LinkedList<>();

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                mat[i][j] = sc.nextInt();

                if (mat[i][j] == 0) {
                    // All zeros are starting points
                    q.offer(new int[]{i, j});

                    dist[i][j] = 0;
                } else {
                    // -1 means not visited
                    dist[i][j] = -1;
                }
            }
        }

        // Multi-source BFS
        while (!q.isEmpty()) {

            int[] current = q.poll();

            int r = current[0];
            int c = current[1];

            // Check 4 directions
            for (int d = 0; d < 4; d++) {

                int nr = r + dr[d];
                int nc = c + dc[d];

                if (nr >= 0 && nr < n &&
                    nc >= 0 && nc < m &&
                    dist[nr][nc] == -1) {

                    dist[nr][nc] = dist[r][c] + 1;

                    q.offer(new int[]{nr, nc});
                }
            }
        }

        // Print answer
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {
                System.out.print(dist[i][j] + " ");
            }

            System.out.println();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATMEDIAN)