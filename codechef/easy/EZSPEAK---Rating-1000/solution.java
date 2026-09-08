import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int count = 0;
            boolean easy = true;

            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);

                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    count = 0;
                } else {
                    count++;

                    if (count >= 4) {
                        easy = false;
                        break;
                    }
                }
            }
            System.out.println(easy ? "YES" : "NO");
        }

        sc.close();
		

	}
}
