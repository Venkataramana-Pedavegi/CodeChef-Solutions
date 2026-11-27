import java.io.*;
import java.util.*;
import java.util.function.LongUnaryOperator;

class Codechef
{
    static LongUnaryOperator getOperation(String operation)
    {
        switch (operation)
        {
            case "DOUBLE":
                return x -> x * 2;

            case "SQUARE":
                return x -> x * x;

            case "NEGATE":
                return x -> -x;

            case "INCREMENT":
                return x -> x + 1;

            default:
                throw new IllegalArgumentException(
                    "Invalid operation"
                );
        }
    }

    static long[] transformArray(
        long[] arr,
        LongUnaryOperator operation)
    {
        long[] result = new long[arr.length];

        for (int i = 0; i < arr.length; i++)
        {
            result[i] =
                operation.applyAsLong(arr[i]);
        }

        return result;
    }

    public static void main(String[] args)
        throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        int t = Integer.parseInt(br.readLine());

        while (t-- > 0)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            int n =
                Integer.parseInt(st.nextToken());

            String operationName =
                st.nextToken();

            long[] arr = new long[n];

            st =
                new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++)
            {
                arr[i] =
                    Long.parseLong(st.nextToken());
            }

            LongUnaryOperator operation =
                getOperation(operationName);

            long[] result =
                transformArray(arr, operation);

            for (int i = 0; i < n; i++)
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