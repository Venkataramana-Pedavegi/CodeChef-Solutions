import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
         Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            HashMap<String, Long> map = new HashMap<>();

            map.put("X", sc.nextLong());
            map.put("Y", sc.nextLong());
            map.put("N", sc.nextLong());
            map.put("R", sc.nextLong());

            long X = map.get("X");
            long Y = map.get("Y");
            long N = map.get("N");
            long R = map.get("R");

            long minCost = N * X;

            if (R < minCost)
            {
                System.out.println("-1");
                continue;
            }

            long extra = R - minCost;

            // Extra cost of one premium burger
            long diff = Y - X;

            long premium = extra / diff;

            premium = Math.min(premium, N);

            long normal = N - premium;

            System.out.println(normal + " " + premium);
        }

        sc.close();
	}
}
