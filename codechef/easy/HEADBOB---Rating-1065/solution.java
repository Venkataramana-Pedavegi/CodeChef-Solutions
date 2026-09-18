import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String s = sc.next();

            if (s.contains("I")) {
                System.out.println("INDIAN");
            } 
            else if (s.contains("Y")) {
                System.out.println("NOT INDIAN");
            } 
            else {
                System.out.println("NOT SURE");
            }
        }

        sc.close();
    }
}