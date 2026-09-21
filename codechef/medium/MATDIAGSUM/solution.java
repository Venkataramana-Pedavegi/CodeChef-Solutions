import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        // Input matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {

            // Primary diagonal
            sum += matrix[i][i];

            // Secondary diagonal
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println(sum);
    }
}