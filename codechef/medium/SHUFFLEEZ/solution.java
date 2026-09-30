import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static final long MOD = 998244353;

    static long power(long a, long b)
    {
        long result = 1;

        while (b > 0)
        {
            if (b % 2 == 1)
            {
                result = (result * a) % MOD;
            }

            a = (a * a) % MOD;
            b /= 2;
        }

        return result;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int N = sc.nextInt();
            int K = sc.nextInt();
            for (int i = 0; i < N; i++)
            {
                sc.nextInt();
            }

            // Calculate K!
            long factorial = 1;

            for (int i = 1; i <= K; i++)
            {
                factorial = (factorial * i) % MOD;
            }
            long ways = power(K, N - K);
            long answer = (factorial * ways) % MOD;

            System.out.println(answer);
        }

        sc.close();
    }
}