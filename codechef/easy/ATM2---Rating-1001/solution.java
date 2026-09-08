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
            int K = sc.nextInt();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < N; i++) {
                int amount = sc.nextInt();

                if (K >= amount) {
                    K -= amount;
                    result.append('1');
                } else {
                    result.append('0');
                }
            }

            System.out.println(result);
        }

        sc.close();

	}
}
