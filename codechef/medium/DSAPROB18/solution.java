import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long sum = 0;

        for (int i = 0; i < N; i++) {
            sum += sc.nextLong();
        }

        long root = (long) Math.sqrt(sum);

        if (root * root == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}