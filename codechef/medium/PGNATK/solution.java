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

            int answer = N + (N - 1) / (K - 1);

            System.out.println(answer);
        }

        sc.close();
    }
}