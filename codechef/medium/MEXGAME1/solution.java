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
            int N = sc.nextInt();

            int[] count = new int[102];

            for (int i = 0; i < N; i++)
            {
                int x = sc.nextInt();
                count[x]++;
            }
            int mex = 0;

            while (count[mex] > 0)
            {
                mex++;
            }

            long moves = 0;
            for (int x = 1; x < mex; x++)
            {
                if (count[x] > 1)
                {
                    moves += (long)(count[x] - 1) * x;
                }
            }
            for (int x = mex + 2; x <= 100; x++)
            {
                if (count[x] > 0)
                {
                    moves += (long)count[x] * (x - mex - 1);
                }
            }

            if (moves % 2 == 1)
            {
                System.out.println("Alice");
            }
            else
            {
                System.out.println("Bob");
            }
        }

        sc.close();
    }
}