import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLong()) return;
        
        long n = sc.nextLong();

        // Binary search for the maximum k such that k * (k - 1) / 2 <= n
        long low = 1;
        long high = 2000000000L; // ~2 * 10^9 because (2e9 * (2e9 - 1)) / 2 > 10^18
        long bestK = 1;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            long combinations = mid * (mid - 1) / 2;

            if (combinations <= n) {
                bestK = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        long distinctPairs = bestK * (bestK - 1) / 2;
        long remaining = n - distinctPairs;
        long totalBalls = bestK + remaining;

        System.out.println(totalBalls);
    }
}