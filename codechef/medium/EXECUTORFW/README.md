# EXECUTORFW

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Executor Framework in Java

You are given an array of $N$ integers and an integer $K$ representing the number of worker threads.

Each array element $x$ must be processed as an independent task. For every element, the task must determine:

- $x$
- $x^2$

After all tasks finish, calculate:

- the sum of all array elements;
- the sum of the squares of all array elements.

The processing must be performed using Java's Executor Framework with a fixed-size thread pool of $K$ worker threads.

### Task

Complete the `ArrayProcessor` class by implementing the `process()` method.

Your implementation must use Java's  **Executor Framework**  to process the array elements concurrently.

For each array element $x$:

- Create an independent Callable task.
- The task must return: $x$ $x^2$

The `process()` method must:

- Create a fixed thread pool containing exactly $K$ worker threads.
- Submit one Callable task for each array element.
- Store the returned Future objects.
- Use Future.get() to collect the results after task completion.
- Compute:
$$ \text{sum} = \sum_{i=1}^{N} A_i $$

and

$$ \text{squareSum} = \sum_{i=1}^{N} A_i^2 $$
- Properly shut down the ExecutorService.
- Wait for submitted tasks to complete before returning.
- Return the results as a long[] in the following order: Index 0: Sum of all elements in the array (sum) Index 1: Sum of the squares of all elements in the array (squareSum)
### Driver Code Responsibility

The provided driver code:

- Reads $N$, $K$, and the array elements.
- Creates an ArrayProcessor object.
- Calls the process() method.
- Prints the returned sum and sum of squares.

You only need to complete the `process()` method inside `ArrayProcessor`.

### Sample 1:
Input
Output

```
6 3
2 4 6 8 10 12
```

```
42
364
```

### Explanation:

A fixed thread pool containing $3$ threads is created. The elements are processed as independent tasks.

- Sum: $2 + 4 + 6 + 8 + 10 + 12 = 42$
- Sum of squares: $2^2 + 4^2 + 6^2 + 8^2 + 10^2 + 12^2 = 4 + 16 + 36 + 64 + 100 + 144 = 364$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:06:24.958Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/EXECUTORFW)