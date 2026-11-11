import java.io.InputStream;
import java.io.IOException;

class Codechef {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String token = sc.next();
        if (token != null) {
            long D1 = Long.parseLong(token);
            long D2 = sc.nextLong();
            long C1 = sc.nextLong();
            long C2 = sc.nextLong();

            long g = gcd(D1, D2);
            long lcm = (D1 / g) * D2;

            long low = 1;
            long high = 2000000000000000000L;
            long ans = high;

            while (low <= high) {
                long mid = (low + high) >> 1;

                long not_div_D1 = mid - mid / D1;
                long not_div_D2 = mid - mid / D2;
                long not_div_lcm = mid - mid / lcm;

                if (not_div_D1 >= C1 && not_div_D2 >= C2 && not_div_lcm >= (C1 + C2)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }

    static class FastScanner {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (head >= tail) {
                try { head = 0; tail = stream.read(buf, 0, buf.length); }
                catch (IOException e) { return -1; }
                if (tail <= 0) return -1;
            }
            return buf[head++];
        }

        public String next() {
            int c = read();
            while (c <= 32) { if (c == -1) return null; c = read(); }
            StringBuilder res = new StringBuilder();
            while (c > 32) { res.appendCodePoint(c); c = read(); }
            return res.toString();
        }

        public long nextLong() {
            int c = read();
            while (c <= 32) { if (c == -1) return -1; c = read(); }
            long res = 0;
            while (c > 32) {
                res = res * 10 + c - '0';
                c = read();
            }
            return res;
        }
    }
}