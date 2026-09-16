import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            int[][] mat = new int[n][n];

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    mat[i][j] = sc.nextInt();
                }
            }

            int maxTrace = 0;

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    int sum = 0;

                    int x = i;
                    int y = j;

                    while (x < n && y < n)
                    {
                        sum += mat[x][y];
                        x++;
                        y++;
                    }

                    maxTrace = Math.max(maxTrace, sum);
                }
            }

            System.out.println(maxTrace);
        }

        sc.close();

	}
}
