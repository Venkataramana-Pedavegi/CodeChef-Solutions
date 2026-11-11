import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // Fast I/O reader
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int head = 0;
        private int tail = 0;

        private int read() throws IOException {
            if (head >= tail) {
                head = 0;
                tail = in.read(buffer, 0, buffer.length);
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public long nextLong() throws IOException {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) c = read();
            long res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return neg ? -res : res;
        }

        public int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    // Calculates the total gain for K sections starting from U
    private static long calculateGain(long K, long U) {
        if (K <= 0) return Long.MIN_VALUE;
        return K * U - (K * (K - 1)) / 2;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        if (n <= 0) return;

        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + scanner.nextLong();
        }

        int q = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int L = scanner.nextInt();
            long U = scanner.nextLong();

            // Target prefix sum to reach at least U sections: pref[R] >= pref[L - 1] + U
            long target = pref[L - 1] + U;

            int low = L, high = n;
            int candidate = n;

            // Binary search for the smallest R where sections K >= U
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (pref[mid] >= target) {
                    candidate = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int bestR = candidate;
            long bestGain = calculateGain(pref[candidate] - pref[L - 1], U);

            // Compare with candidate - 1 (where K < U)
            if (candidate - 1 >= L) {
                long prevGain = calculateGain(pref[candidate - 1] - pref[L - 1], U);
                // Favor smaller index on ties (prevGain >= bestGain)
                if (prevGain >= bestGain) {
                    bestGain = prevGain;
                    bestR = candidate - 1;
                }
            }

            sb.append(bestR).append(i == q - 1 ? "" : " ");
        }

        System.out.println(sb);
    }
}