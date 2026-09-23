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
            int K = sc.nextInt();

            int[] C = new int[N];

            for (int i = 0; i < N; i++)
            {
                C[i] = sc.nextInt();
            }

            int minCost = Integer.MAX_VALUE;
            for (int i = 0; i < N; i++)
            {
                for (int j = i + 1; j < N; j++)
                {
                    boolean allLit = true;
                    for (int x = 0; x < N; x++)
                    {
                        boolean light1 = Math.abs(i - x) <= K;
                        boolean light2 = Math.abs(j - x) <= K;

                        if (!light1 && !light2)
                        {
                            allLit = false;
                            break;
                        }
                    }

                    if (allLit)
                    {
                        int cost = C[i] + C[j];

                        if (cost < minCost)
                        {
                            minCost = cost;
                        }
                    }
                }
            }

            if (minCost == Integer.MAX_VALUE)
            {
                System.out.println(-1);
            }
            else
            {
                System.out.println(minCost);
            }
        }

        sc.close();
    }
}