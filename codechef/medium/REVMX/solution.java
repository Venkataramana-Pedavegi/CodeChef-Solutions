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
            for (int i = 1; i <= N; i++) {
                if (P[i] == i) base++;
            }

            int maxGain = 0;

            // Check for mutual pair (+2)
            for (int i = 1; i <= N; i++) {
                int j = P[i];
                if (j > i && P[j] == i) {
                    maxGain = 2;
                    break;
                }
            }

            // If no mutual pair, check if any element is misplaced (+1)
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
