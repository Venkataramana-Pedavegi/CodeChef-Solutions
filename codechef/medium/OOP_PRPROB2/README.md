# OOP_PRPROB2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ordered Thread Execution Using Runnable

Create a Java program that uses the `Runnable` interface to execute three separate tasks using three threads.

The threads must perform the following work:

- Thread 3: Print all integers from $L$ to $R$ that are divisible by $D$, in increasing order.
- Thread 2: Print Thread 2 Done.
- Thread 1: Print Thread 1 Done.

Although the three threads are created independently, they must execute in the following strict order:

$$ \text{Thread 3} \rightarrow \text{Thread 2} \rightarrow \text{Thread 1} $$
### Task

Complete the `run()` methods of:

- NumberTask
- MessageTask

Also complete the thread execution logic inside `main()` so that:

- Thread 3 starts first.
- The program waits for Thread 3 to finish.
- Thread 2 starts next.
- The program waits for Thread 2 to finish.
- Thread 1 starts last.

All output must appear on the same line with a single space between values and messages.

### Sample 1:
Input
Output

```
166 205 10
```

```
170 180 190 200 Thread 2 Done Thread 1 Done
```

### Explanation:

The numbers divisible by $10$ in the range $[166,205]$ are:

$$ 170,\ 180,\ 190,\ 200 $$

Thread 3 prints these numbers first.

After Thread 3 completes, Thread 2 prints `Thread 2 Done`.

Finally, Thread 1 prints `Thread 1 Done`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:02:21.336Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class NumberTask implements Runnable
{
    private final int left;
    private final int right;
    private final int divisor;

    NumberTask(int left, int right, int divisor)
    {
        this.left = left;
        this.right = right;
        this.divisor = divisor;
    }

    @Override
    public void run()
    {
        StringBuilder result = new StringBuilder();

        for (int number = left; number <= right; number++) {
            if (number % divisor == 0) {
                result.append(number).append(' ');
            }
        }

        System.out.print(result);
    }
}

class MessageTask implements Runnable
{
    private final int threadNumber;

    MessageTask(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        System.out.print("Thread " + threadNumber + " Done");

        if (threadNumber == 2) {
            System.out.print(' ');
        }
    }
}

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer =
            new StringTokenizer(reader.readLine());

        int left =
            Integer.parseInt(tokenizer.nextToken());

        int right =
            Integer.parseInt(tokenizer.nextToken());

        int divisor =
            Integer.parseInt(tokenizer.nextToken());

        Thread thread1 =
            new Thread(new MessageTask(1));

        Thread thread2 =
            new Thread(new MessageTask(2));

        Thread thread3 =
            new Thread(
                new NumberTask(left, right, divisor)
            );

        // Required execution order: Thread 3 -> Thread 2 -> Thread 1
        thread3.start();
        thread3.join();

        thread2.start();
        thread2.join();

        thread1.start();
        thread1.join();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OOP_PRPROB2)