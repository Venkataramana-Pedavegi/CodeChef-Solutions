import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();

            int pos1 = -1;
            int posN = -1;

            for (int i = 0; i < N; i++) {

                int x = sc.nextInt();

                if (x == 1) {
                    pos1 = i;
                }

                if (x == N) {
                    posN = i;
                }
            }

            int answer = pos1 + (N - 1 - posN);

            if (pos1 > posN) {
                answer--;
            }

            System.out.println(answer);
        }

        sc.close();
    }
}