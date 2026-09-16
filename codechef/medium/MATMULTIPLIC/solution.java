import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] A = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        int N2 = sc.nextInt();
        int P = sc.nextInt();

        int[][] B = new int[N2][P];

        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        int[][] C = new int[M][P];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                for (int k = 0; k < N; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < P; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

	}
}
