import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int NA = sc.nextInt();
            int NB = sc.nextInt();
            int NC = sc.nextInt();

            long[] A = new long[NA];
            long[] B = new long[NB];
            long[] C = new long[NC];

            for (int i = 0; i < NA; i++) {
                A[i] = sc.nextLong();
            }

            for (int i = 0; i < NB; i++) {
                B[i] = sc.nextLong();
            }

            for (int i = 0; i < NC; i++) {
                C[i] = sc.nextLong();
            }

            int i = 0;
            int j = 0;
            int k = 0;

            long answer = Long.MAX_VALUE;

            while (i < NA && j < NB && k < NC) {

                long min = Math.min(A[i], Math.min(B[j], C[k]));

                long max = Math.max(A[i], Math.max(B[j], C[k]));

                long current = max - min;

                answer = Math.min(answer, current);

                // Move the pointer having the smallest value
                if (A[i] == min) {
                    i++;
                }
                else if (B[j] == min) {
                    j++;
                }
                else {
                    k++;
                }
            }

            System.out.println(answer);
        }

        sc.close();
    }
}