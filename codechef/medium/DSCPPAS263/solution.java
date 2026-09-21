import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int row = 0;
        int col = m - 1;
        int count = 0;

        while (row < n && col >= 0) {

            if (matrix[row][col] < 0) {

                // Everything below this element in this column
                // is also negative.
                count += n - row;

                col--;

            } else {

                // Current element is non-negative.
                // Move down to find negatives.
                row++;
            }
        }

        System.out.println(count);
    }
}