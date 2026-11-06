import java.io.*;
import java.util.*;

class Codechef {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        FastScanner fs = new FastScanner();
        String token = fs.next();
        if (token == null) return;
        int t = Integer.parseInt(token);

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int m = fs.nextInt();
            int n = fs.nextInt();
            long k = fs.nextLong();

            long[] T = new long[m];
            for (int i = 0; i < m; i++) {
                T[i] = fs.nextLong();
            }

            long[] P = new long[m];
            for (int i = 0; i < m; i++) {
                P[i] = fs.nextLong();
            }

            long low = 0;
            long high = 2_000_000_000L;
            long ans = high;

            long[] count = new long[m];

            while (low <= high) {
                long mid = low + (high - low) / 2;

                for (int i = 0; i < m; i++) {
                    if (mid >= T[i]) {
                        count[i] = 1 + (mid - T[i]) / P[i];
                    } else {
                        count[i] = 0;
                    }
                }

                Arrays.sort(count);

                long collected = 0;
                int pick = Math.min(n, m);
                for (int i = 0; i < pick; i++) {
                    collected += count[m - 1 - i];
                    if (collected >= k) break;
                }

                if (collected >= k) {
                    ans = mid;
                    high = mid - 1; // Try to find a smaller feasible time
                } else {
                    low = mid + 1;
                }
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}