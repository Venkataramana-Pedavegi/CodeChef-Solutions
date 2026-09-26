import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        int[][] dp = new int[n][m];

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Starting cell
        dp[0][0] = arr[0][0];

        // First row
        for (int j = 1; j < m; j++) {
            dp[0][j] = dp[0][j - 1] + arr[0][j];
        }

        // First column
        for (int i = 1; i < n; i++) {
            dp[i][0] = dp[i - 1][0] + arr[i][0];
        }

        // Remaining cells
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                dp[i][j] = arr[i][j] +
                           Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }

        System.out.println(dp[n - 1][m - 1]);

        sc.close();
    }
}