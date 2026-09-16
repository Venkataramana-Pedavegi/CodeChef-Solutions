import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // rows
        int M = sc.nextInt(); // columns

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // Read first matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Read second matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Add and print matrices
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print((A[i][j] + B[i][j]) + " ");
            }
            System.out.println();
        }

        sc.close();
    
	}
}
