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

            int[] A = new int[N];
            boolean[] present = new boolean[N + 2];

            for (int i = 0; i < N; i++)
            {
                A[i] = sc.nextInt();

                if (A[i] <= N + 1)
                {
                    present[A[i]] = true;
                }
            }
            int mex = 0;

            while (present[mex])
            {
                mex++;
            }

            long moves = 0;
            for (int i = 0; i < N; i++)
            {
                if (A[i] > mex + 1)
                {
                    moves += A[i] - mex - 1;
                }
            }
            int count = 0;

            for (int i = 0; i < N; i++)
            {
                if (A[i] == mex - 1)
                {
                    count++;
                }
            }

            if (count >= 2)
            {
                moves++;
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