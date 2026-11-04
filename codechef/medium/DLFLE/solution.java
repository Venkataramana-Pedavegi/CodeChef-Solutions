import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        if (!fs.hasNext()) return;

        int n = fs.nextInt();
        int m = fs.nextInt();
        long k = fs.nextLong();

        long[] orders = new long[n];
        for (int i = 0; i < n; i++) {
            orders[i] = fs.nextLong();
        }

        int low = 0, high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canDeliver(orders, mid, n, m, k)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller number of orders to remove
            } else {
                low = mid + 1;  // Need to remove more orders from the front
            }
        }

        System.out.println(ans);
    }

    private static boolean canDeliver(long[] orders, int start, int n, int m, long k) {
        if (start == n) return true; // 0 orders remaining

        int trucksUsed = 1;
        long remainingCapacity = k;

        for (int i = start; i < n; i++) {
            // If a single order exceeds maximum truck capacity, it's impossible
            if (orders[i] > k) {
                return false;
            }

            if (orders[i] <= remainingCapacity) {
                remainingCapacity -= orders[i];
            } else {
                trucksUsed++;
                if (trucksUsed > m) {
                    return false;
                }
                remainingCapacity = k - orders[i];
            }
        }

        return trucksUsed <= m;
    }

    // Fast I/O for 2 * 10^5 inputs
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean hasNext() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return false;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return false;
                }
            }
            return true;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
}