import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String s = sc.next();

            int ans = 0;
            int i = 0;

            while (i < s.length()) {

                if (s.charAt(i) == '*') {
                    i++;
                    continue;
                }

                int pairs = 0;

                while (i + 1 < s.length()
                        && s.charAt(i) == '>'
                        && s.charAt(i + 1) == '<') {

                    pairs++;
                    i += 2;
                }

                if (pairs > 0) {
                    ans += pairs - 1;
                } else {
                    i++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}