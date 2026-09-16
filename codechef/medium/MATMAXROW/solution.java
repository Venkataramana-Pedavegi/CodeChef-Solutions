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

        int maxOnes = 0;
        int answer = 1;

        for (int i = 0; i < n; i++)
        {
            int left = 0;
            int right = m - 1;
            int firstOne = m;

            // Binary search for first 1
            while (left <= right)
            {
                int mid = left + (right - left) / 2;

                if (matrix[i][mid] == 1)
                {
                    firstOne = mid;
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }

            // Number of 1s in this row
            int ones = m - firstOne;

            // > ensures first row is selected in case of tie
            if (ones > maxOnes)
            {
                maxOnes = ones;
                answer = i + 1;
            }
        }

        System.out.println(answer);

        sc.close();
	}
}
