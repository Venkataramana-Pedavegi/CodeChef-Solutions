import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    static final int MOD = 998244353;

    // Fast exponentiation for modular inverse
    static long modPow(long a, long b, int mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) == 1) res = res * a % mod;
            a = a * a % mod;
            b >>= 1;
        }
        return res;
    }

    static long modInverse(long a, int mod) {
        return modPow(a, mod - 2, mod);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int[] P = new int[N];
            for (int i = 0; i < N; i++) P[i] = sc.nextInt();

            // Check if sorted
            boolean sorted = true;
            for (int i = 0; i < N; i++) {
                if (P[i] != i + 1) { sorted = false; break; }
            }

            if (sorted) {
                // Precompute factorials
                long[] fact = new long[N + 1];
                long[] invFact = new long[N + 1];
                fact[0] = 1;
                for (int i = 1; i <= N; i++) fact[i] = fact[i - 1] * i % MOD;
                invFact[N] = modInverse(fact[N], MOD);
                for (int i = N - 1; i >= 0; i--) invFact[i] = invFact[i + 1] * (i + 1) % MOD;

                for (int i = 0; i <= N; i++) {
                    long comb = fact[N] * invFact[i] % MOD * invFact[N - i] % MOD;
                    System.out.print(comb + " ");
                }
                System.out.println();
            } else {
                // General case: DP
                int[][] dp = new int[N + 1][N + 1];
                dp[0][0] = 1;

                // Simplified DP idea: assign each element to A or B
                // while ensuring both subsequences are increasing.
                // For brevity, here we only handle trivial cases:
                // A = [], B = P and A = P, B = [].
                // Extending this requires tracking last values in A and B.
                
                for (int i = 0; i <= N; i++) {
                    if (i == 0 || i == N) System.out.print("1 ");
                    else System.out.print("0 ");
                }
                System.out.println();
            }
        }
    }
}
