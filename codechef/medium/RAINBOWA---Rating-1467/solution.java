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

            int[] arr = new int[N];

            for (int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }

            boolean rainbow = true;

            int left = 0;
            int right = N - 1;

            // Check symmetry
            while (left <= right)
            {
                if (arr[left] != arr[right])
                {
                    rainbow = false;
                    break;
                }

                left++;
                right--;
            }

            // Check values and order
            if (rainbow)
            {
                for (int i = 0; i < N; i++)
                {
                    if (arr[i] < 1 || arr[i] > 7)
                    {
                        rainbow = false;
                        break;
                    }

                    if (i > 0 && Math.abs(arr[i] - arr[i - 1]) > 1)
                    {
                        rainbow = false;
                        break;
                    }
                }
            }

            // Must contain 7
            boolean hasSeven = false;

            if (rainbow)
            {
                for (int i = 0; i < N; i++)
                {
                    if (arr[i] == 7)
                    {
                        hasSeven = true;
                        break;
                    }
                }

                if (!hasSeven)
                {
                    rainbow = false;
                }
            }

            System.out.println(rainbow ? "yes" : "no");
        }

        sc.close();
    }
}