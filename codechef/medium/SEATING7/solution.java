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
            int M = sc.nextInt();
            int K = sc.nextInt();

            boolean[] occupied = new boolean[N + 1];
            for (int i = 0; i < M; i++)
            {
                int seat = sc.nextInt();
                occupied[seat] = true;
            }
            int count = 0;

            for (int seat = 1; seat <= N && count < K; seat++)
            {
                if (!occupied[seat])
                {
                    System.out.print(seat + " ");
                    occupied[seat] = true;
                    count++;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}