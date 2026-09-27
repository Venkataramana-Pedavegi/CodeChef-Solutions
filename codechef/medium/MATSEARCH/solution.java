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
        int x = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Binary Search
        int low = 0;
        int high = n * m - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == x)
            {
                System.out.println("YES");
                return;
            }
            else if (matrix[row][col] < x)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        System.out.println("NO");
    }
}