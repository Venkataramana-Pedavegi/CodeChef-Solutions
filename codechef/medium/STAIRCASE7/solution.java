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

            for (int i = 0; i < N; i++)
            {
                A[i] = sc.nextInt();
            }

            HashMap<Integer, Integer> map = new HashMap<>();

            int maxFrequency = 0;

            for (int i = 0; i < N; i++)
            {
                int value = A[i] - i;

                map.put(value, map.getOrDefault(value, 0) + 1);

                maxFrequency = Math.max(
                    maxFrequency,
                    map.get(value)
                );
            }

            int answer = N - maxFrequency;

            System.out.println(answer);
        }

        sc.close();
    }
}