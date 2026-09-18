import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();

            int uninfected = N - A;

            System.out.println(Math.min(A, uninfected));
        }

        sc.close();
    }
}