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

            int rem = n % 8;
            int partner;
            String type;

            if (rem == 1)
            {
                partner = n + 3;
                type = "LB";
            }
            else if (rem == 2)
            {
                partner = n + 3;
                type = "MB";
            }
            else if (rem == 3)
            {
                partner = n + 3;
                type = "UB";
            }
            else if (rem == 4)
            {
                partner = n - 3;
                type = "LB";
            }
            else if (rem == 5)
            {
                partner = n - 3;
                type = "MB";
            }
            else if (rem == 6)
            {
                partner = n - 3;
                type = "UB";
            }
            else if (rem == 7)
            {
                partner = n + 1;
                type = "SU";
            }
            else
            {
                // rem == 0 means berth position 8
                partner = n - 1;
                type = "SL";
            }

            System.out.println(partner + type);
        }

        sc.close();
	}
}
