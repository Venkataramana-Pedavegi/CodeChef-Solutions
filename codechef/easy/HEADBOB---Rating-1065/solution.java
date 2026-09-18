import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            int oddCount = 0;

            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();

                if (x % 2 != 0) {
                    oddCount++;
                }
            }

            if (oddCount >= 2 && oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}