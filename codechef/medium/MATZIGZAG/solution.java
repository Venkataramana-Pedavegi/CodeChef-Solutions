import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < M; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int j = M - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }

        sc.close();

	}
}
