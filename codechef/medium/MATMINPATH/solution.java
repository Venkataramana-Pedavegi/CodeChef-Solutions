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

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                if (i == 0 && j == 0)
                {
                    continue;
                }
                else if (i == 0)
                {
                    mat[i][j] += mat[i][j - 1];
                }
                else if (j == 0)
                {
                    mat[i][j] += mat[i - 1][j];
                }
                else
                {
                    mat[i][j] += Math.min(
                        mat[i - 1][j],
                        mat[i][j - 1]
                    );
                }
            }
        }

        System.out.println(mat[n - 1][m - 1]);

        sc.close();
	}
}
