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
            int countOnes = 0;

            for (int i = 0; i < N; i++) {
                int b = sc.nextInt();

                if (b == 1) {
                    countOnes++;
                }
            }

            if (countOnes % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();


	}
}
