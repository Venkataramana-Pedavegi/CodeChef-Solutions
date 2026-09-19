import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        int[][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        int low = 0;
        int high = n * m - 1;

        boolean found = false;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Convert 1D index to 2D index
            int row = mid / m;
            int col = mid % m;

            if (mat[row][col] == x) {
                found = true;
                break;
            }
            else if (mat[row][col] < x) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}