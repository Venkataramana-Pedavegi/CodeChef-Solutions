
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[][] events = new int[N][2];
        int[][] starts = new int[N][2];

        for (int i = 0; i < N; i++) {
            events[i][0] = sc.nextInt();
            events[i][1] = sc.nextInt();

            starts[i][0] = events[i][0];
            starts[i][1] = i;
        }

        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        int[] ans = new int[N];

        for (int i = 0; i < N; i++) {
            int target = events[i][1];

            int low = 0;
            int high = N - 1;
            int result = -1;

            while (low <= high) {
                int mid = low + (high - low) / 2;

                if (starts[mid][0] >= target) {
                    result = starts[mid][1];
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            ans[i] = result;
        }

        for (int i = 0; i < N; i++) {
            System.out.print(ans[i]);

            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        System.out.println();
        sc.close();
    }
}
