import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Dimensions of first matrix
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[][] A = new int[M][N];

        // Input first matrix
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Dimensions of second matrix
        int N2 = sc.nextInt();
        int P = sc.nextInt();

        int[][] B = new int[N2][P];

        // Input second matrix
        for (int i = 0; i < N2; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Result matrix: M × P
        int[][] C = new int[M][P];

        // Matrix multiplication
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < P; j++) {

                for (int k = 0; k < N; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        for (int i = 0; i < M; i++) {

            for (int j = 0; j < P; j++) {
                System.out.print(C[i][j] + " ");
            }

            System.out.println();
        }
    }
}