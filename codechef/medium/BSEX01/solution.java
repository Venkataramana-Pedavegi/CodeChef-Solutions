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

        int[][] matrix = new int[n][m];

        // Read matrix
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Read target
        int target = sc.nextInt();

        // Binary Search
        int low = 0;
        int high = n * m - 1;

        while (low <= high)
        {
            int mid = low + (high - low) / 2;

            // Convert 1D index to 2D index
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
            {
                System.out.println("YES");
                return;
            }
            else if (matrix[row][col] < target)
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