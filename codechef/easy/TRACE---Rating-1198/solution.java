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
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    int value = sc.nextInt();

                    int key = i - j;

                    map.put(key, map.getOrDefault(key, 0) + value);
                }
            }

            int maxTrace = 0;

            for (int sum : map.values())
            {
                maxTrace = Math.max(maxTrace, sum);
            }

            System.out.println(maxTrace);
        }

        sc.close();

	}
}
