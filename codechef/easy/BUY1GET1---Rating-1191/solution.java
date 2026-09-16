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
            String s = sc.next();

            int[] count = new int[52];

            // Count each character
            for (char c : s.toCharArray())
            {
                if (c >= 'a' && c <= 'z')
                {
                    count[c - 'a']++;
                }
                else
                {
                    count[26 + c - 'A']++;
                }
            }

            int cost = 0;

            // Calculate m
            for (int i = 0; i < 52; i++)
            {
                cost += (count[i] + 1) / 2;
            }

            System.out.println(cost);
        }

        sc.close();

	}
}
