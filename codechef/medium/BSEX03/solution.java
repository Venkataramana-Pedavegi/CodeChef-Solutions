import java.util.*;

public class Main {

    // Implement the painterPartition method here
    public static long painterPartition(int[] boards, int k) {

        long low = 0;
        long high = 0;

        // low = largest board
        // high = total length
        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        // Binary search
        while (low < high) {

            long mid = low + (high - low) / 2;

            int painters = 1;
            long currentSum = 0;

            for (int board : boards) {

                if (currentSum + board <= mid) {
                    currentSum += board;
                } 
                else {
                    painters++;
                    currentSum = board;
                }
            }

            // If k painters are enough,
            // try a smaller maximum
            if (painters <= k) {
                high = mid;
            } 
            else {
                // Need more painters, so increase maximum
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {

                int N = sc.nextInt();
                int k = sc.nextInt();

                int[] boards = new int[N];

                for (int i = 0; i < N; i++) {
                    boards[i] = sc.nextInt();
                }

                System.out.println(painterPartition(boards, k));
            }
        }

        sc.close();
    }
}