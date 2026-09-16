import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                boolean equal = true;

                for (int k = 0; k < n; k++)
                {
                    if (matrix[i][k] != matrix[k][j])
                    {
                        equal = false;
                        break;
                    }
                }

                if (equal)
                {
                    count++;
                }
            }
        }

        System.out.println(count);

        sc.close();

	}
}
