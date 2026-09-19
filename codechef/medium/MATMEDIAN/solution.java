import java.util.*;

class Main {

    // Count elements <= x in one sorted row
    static int countLessEqual(int[] row, int x) {

        int low = 0;
        int high = row.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (row[mid] <= x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // low = number of elements <= x
        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] mat = new int[n][m];

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                mat[i][j] = sc.nextInt();

                // Minimum element
                low = Math.min(low, mat[i][j]);

                // Maximum element
                high = Math.max(high, mat[i][j]);
            }
        }

        int required = (n * m) / 2 + 1;

        // Binary search on answer
        while (low < high) {

            int mid = low + (high - low) / 2;

            int count = 0;

            // Count elements <= mid
            for (int i = 0; i < n; i++) {
                count += countLessEqual(mat[i], mid);
            }

            if (count < required) {
                // Median is greater
                low = mid + 1;
            } else {
                // Median can be mid or smaller
                high = mid;
            }
        }

        System.out.println(low);
    }
}