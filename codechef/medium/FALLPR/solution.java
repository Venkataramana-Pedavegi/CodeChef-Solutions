import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int N = sc.nextInt();

            int[] A = new int[N];

            for (int i = 0; i < N; i++)
            {
                A[i] = sc.nextInt();
            }

            long prefixSum = 0;
            long minPrefix = 0;

            for (int i = 0; i < N; i++)
            {
                prefixSum += A[i];
                minPrefix = Math.min(minPrefix, prefixSum);
            }

            if (minPrefix >= 0)
            {
                System.out.println("YES");
                continue;
            }

            boolean possible = false;

            for (int remove = 0; remove < N; remove++)
            {
                long sum = 0;
                boolean good = true;

                for (int i = 0; i < N; i++)
                {
                    if (i == remove)
                    {
                        continue;
                    }

                    sum += A[i];

                    if (sum < 0)
                    {
                        good = false;
                        break;
                    }
                }

                if (good)
                {
                    possible = true;
                    break;
                }
            }

            if (possible)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

        sc.close();
    }
}