import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < N; i++) {
            sum += matrix[i][i];

            if (i != N - 1 - i) {
                sum += matrix[i][N - 1 - i];
            }
        }

        System.out.println(sum);

        sc.close();

	}
}
