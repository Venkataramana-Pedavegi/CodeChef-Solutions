import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();

            long layers = (long) ((Math.sqrt(8 * N + 1) - 1) / 2);

            System.out.println(layers);
        }

        sc.close();
    }
}