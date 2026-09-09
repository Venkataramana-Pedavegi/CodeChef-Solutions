import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            char[] arr = S.toCharArray();

            // Step 1: Swap adjacent characters
            for (int i = 0; i < N - 1; i += 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }

            // Step 2: Replace a->z, b->y, ..., z->a
            for (int i = 0; i < N; i++) {
                arr[i] = (char)('z' - (arr[i] - 'a'));
            }

            System.out.println(new String(arr));
        }

        sc.close();

	}
}
