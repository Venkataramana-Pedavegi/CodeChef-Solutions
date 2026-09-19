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