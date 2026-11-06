import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // Fast I/O reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        String tStr = in.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = in.nextInt();
            
            long maxVal = 0;
            long prefixSum = 0;

            for (int i = 1; i <= n; i++) {
                long a = in.nextLong();
                prefixSum += a;
                // Ceiling division: ceil(prefixSum / i) = (prefixSum + i - 1) / i
                long required = (prefixSum + i - 1) / i;
                maxVal = Math.max(maxVal, required);
            }

            sb.append(maxVal).append("\n");
        }

        System.out.print(sb);
    }
}