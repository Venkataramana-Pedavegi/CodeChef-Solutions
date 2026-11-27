import java.io.*;
import java.util.*;
import java.util.stream.*;

class Codechef
{
    static long[] processNumbers(IntStream numbers)
    {
        return numbers
            .filter(x -> x % 2 == 0)
            .mapToLong(x -> (long) x * x)
            .distinct()
            .sorted()
            .toArray();
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            arr[i] =
                Integer.parseInt(st.nextToken());
        }

        long[] result =
            processNumbers(Arrays.stream(arr));

        if (result.length == 0)
        {
            System.out.println("EMPTY");
        }
        else
        {
            for (int i = 0; i < result.length; i++)
            {
                if (i > 0)
                {
                    System.out.print(" ");
                }

                System.out.print(result[i]);
            }

            System.out.println();
        }
    }
}