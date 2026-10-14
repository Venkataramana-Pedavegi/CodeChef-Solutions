import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] P = new int[N+1]; // 1-indexed
            for (int i = 1; i <= N; i++) P[i] = sc.nextInt();

            // Count current fixed points
            int base = 0;
            for (int i = 1; i <= N; i++) if (P[i] == i) base++;

            int maxGain = 0;

            // Check for mutual pair (+2)
            for (int i = 1; i <= N; i++) {
                int j = P[i];
                if (j > i && P[j] == i) {
                    maxGain = Math.max(maxGain, 2);
                }
            }

            // Check for reversed runs (can give >2)
            int L = 1;
            while (L <= N) {
                int R = L;
                while (R <= N && P[R] == L + R - L) R++; // normal increasing run
                // Now check reversed run
                int RR = L;
                while (RR <= N && P[RR] == L + (R - RR)) RR++;
                if (RR > L) {
                    maxGain = Math.max(maxGain, RR - L);
                }
                L = R + 1;
            }

            // If nothing else, at least +1 if not already perfect
            if (maxGain == 0) {
                for (int i = 1; i <= N; i++) {
                    if (P[i] != i) {
                        maxGain = 1;
                        break;
                    }
                }
            }

            System.out.println(base + maxGain);
        }
    }
}
