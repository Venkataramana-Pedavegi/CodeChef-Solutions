import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] F = new int[N];
            int[] C = new int[M];

            for (int i = 0; i < N; i++) {
                F[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                C[i] = sc.nextInt();
            }

            int i = 0;
            int j = 0;

            // 0 = Football, 1 = Cricket
            int currentChannel = 0;

            int switches = 0;

            while (i < N && j < M) {

                if (F[i] < C[j]) {

                    if (currentChannel != 0) {
                        switches++;
                        currentChannel = 0;
                    }

                    i++;

                } else {

                    if (currentChannel != 1) {
                        switches++;
                        currentChannel = 1;
                    }

                    j++;
                }
            }

            while (i < N) {

                if (currentChannel != 0) {
                    switches++;
                    currentChannel = 0;
                }

                i++;
            }

            while (j < M) {

                if (currentChannel != 1) {
                    switches++;
                    currentChannel = 1;
                }

                j++;
            }

            System.out.println(switches);
        }

        sc.close();
    }
}