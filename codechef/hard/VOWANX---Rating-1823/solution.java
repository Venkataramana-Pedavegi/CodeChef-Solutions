import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            String S = sc.next();

            Deque<Character> deque = new ArrayDeque<>();

            // false = normal direction
            // true  = reversed direction
            boolean reverse = false;

            for (int i = 0; i < N; i++) {

                char ch = S.charAt(i);

                if (isVowel(ch)) {

                    // Reverse everything before the vowel
                    reverse = !reverse;

                }

                // Add current character at the logical end
                if (reverse) {
                    deque.addFirst(ch);
                } else {
                    deque.addLast(ch);
                }
            }

            StringBuilder ans = new StringBuilder();

            // Convert deque into the actual string
            if (reverse) {

                while (!deque.isEmpty()) {
                    ans.append(deque.removeLast());
                }

            } else {

                while (!deque.isEmpty()) {
                    ans.append(deque.removeFirst());
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }

    static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}