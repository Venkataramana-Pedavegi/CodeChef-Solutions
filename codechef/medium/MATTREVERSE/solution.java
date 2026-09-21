import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print rows from bottom to top
        for (int i = n - 1; i >= 0; i--) {

            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
}