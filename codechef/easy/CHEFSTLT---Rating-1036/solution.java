import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s1 = sc.next();
            String s2 = sc.next();

            int min = 0;
            int max = 0;

            for (int i = 0; i < s1.length(); i++) {

                char a = s1.charAt(i);
                char b = s2.charAt(i);

                // Maximum difference
                if (a == '?' || b == '?' || a != b) {
                    max++;
                }

                // Minimum difference
                if (a != '?' && b != '?' && a != b) {
                    min++;
                }
            }

            System.out.println(min + " " + max);
        }

        sc.close();
    }
}