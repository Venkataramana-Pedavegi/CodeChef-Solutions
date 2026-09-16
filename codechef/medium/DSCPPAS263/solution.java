import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if ((n * m) % 2 != 0) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print("1");
                    if (j < m - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        sc.close();
    }
}