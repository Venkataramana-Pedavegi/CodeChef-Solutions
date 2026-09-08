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

            HashMap<Long, Integer> freq = new HashMap<>();
            boolean valid = true;

            for (int i = 0; i < 2 * N; i++) {
                long x = sc.nextLong();

                freq.put(x, freq.getOrDefault(x, 0) + 1);

                if (freq.get(x) > 2) {
                    valid = false;
                }
            }

            System.out.println(valid ? "Yes" : "No");
        }

        sc.close();

	}
}
