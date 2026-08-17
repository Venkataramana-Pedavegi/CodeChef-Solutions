import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();
                        int x = (s.charAt(0) - '0') * 10 + (s.charAt(1) - '0');
            int y = (s.charAt(3) - '0') * 10 + (s.charAt(4) - '0');
            if (x <= 12 && y <= 12) {
                System.out.println("BOTH");
            } else if (y <= 12) {
                System.out.println("DD/MM/YYYY");
            } else {
                System.out.println("MM/DD/YYYY");
            }

        }
    }
}
