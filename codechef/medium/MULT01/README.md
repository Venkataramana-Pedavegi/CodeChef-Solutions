# MULT01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:02:25.631Z  

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

[View on CodeChef](https://www.codechef.com/problems/MULT01)