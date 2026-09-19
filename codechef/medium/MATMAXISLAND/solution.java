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