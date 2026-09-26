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