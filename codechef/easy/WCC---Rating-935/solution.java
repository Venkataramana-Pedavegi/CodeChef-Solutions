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
            int X = sc.nextInt();
            String S = sc.next();

            int carlsen = 0;
            int chef = 0;

            for (int i = 0; i < S.length(); i++)
            {
                char ch = S.charAt(i);

                if (ch == 'C')
                {
                    carlsen += 2;
                }
                else if (ch == 'N')
                {
                    chef += 2;
                }
                else if (ch == 'D')
                {
                    carlsen += 1;
                    chef += 1;
                }
            }

            if (carlsen > chef)
            {
                System.out.println(60 * X);
            }
            else if (carlsen == chef)
            {
                System.out.println(55 * X);
            }
            else
            {
                System.out.println(40 * X);
            }
        }

        sc.close();
    


	}
}
