import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            String S = sc.next();

            int[] freq = new int[26];

            // Count characters
            for (char ch : S.toCharArray()) {
                freq[ch - 'a']++;
            }

            boolean possible = true;

            // Check whether every frequency is even
            for (int i = 0; i < 26; i++) {
                if (freq[i] % 2 != 0) {
                    possible = false;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}