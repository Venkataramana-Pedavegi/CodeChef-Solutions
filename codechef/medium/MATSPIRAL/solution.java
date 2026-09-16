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

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                mat[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = m - 1;

        while (top <= bottom && left <= right)
        {
            for (int j = left; j <= right; j++)
            {
                System.out.print(mat[top][j] + " ");
            }
            top++;

            for (int i = top; i <= bottom; i++)
            {
                System.out.print(mat[i][right] + " ");
            }
            right--;

            if (top <= bottom)
            {
                for (int j = right; j >= left; j--)
                {
                    System.out.print(mat[bottom][j] + " ");
                }
                bottom--;
            }

            if (left <= right)
            {
                for (int i = bottom; i >= top; i--)
                {
                    System.out.print(mat[i][left] + " ");
                }
                left++;
            }
        }

        sc.close();

	}
}
