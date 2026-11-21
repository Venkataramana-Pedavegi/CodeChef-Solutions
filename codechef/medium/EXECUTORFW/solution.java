import java.io.*;
import java.util.*;
import java.util.concurrent.*;

class ArrayProcessor
{
    private final long[] arr;
    private final int threadCount;

    ArrayProcessor(long[] arr, int threadCount)
    {
        this.arr = arr;
        this.threadCount = threadCount;
    }

    public long[] process() throws Exception
    {
        ExecutorService executor =
                Executors.newFixedThreadPool(
                        threadCount
                );

        List<Future<long[]>> futures =
                new ArrayList<>();

        for (long value : arr)
        {
            Callable<long[]> task = () ->
            {
                return new long[]{
                        value,
                        value * value
                };
            };

            Future<long[]> future =
                    executor.submit(task);

            futures.add(future);
        }

        executor.shutdown();

        long sum = 0;
        long squareSum = 0;

        for (Future<long[]> future : futures)
        {
            long[] result = future.get();

            sum += result[0];
            squareSum += result[1];
        }

        executor.awaitTermination(
                1,
                TimeUnit.MINUTES
        );

        return new long[]{
                sum,
                squareSum
        };
    }
}


public class Main
{
    public static void main(String[] args)
            throws Exception
    {
        BufferedReader br =
                new BufferedReader(
                        new InputStreamReader(System.in)
                );

        StringTokenizer st =
                new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        long[] arr = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            arr[i] =
                    Long.parseLong(st.nextToken());
        }

        ArrayProcessor processor =
                new ArrayProcessor(arr, k);

        long[] result = processor.process();

        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}