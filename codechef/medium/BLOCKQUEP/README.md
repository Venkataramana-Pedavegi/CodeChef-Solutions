# BLOCKQUEP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Job Processing Using LinkedBlockingQueue

A system receives $N$ jobs. Each job has an integer processing value.

Use a `LinkedBlockingQueue` to store the jobs.

Create a  **Worker**  thread that:

- Removes jobs from the queue using take().
- Processes each job by calculating its square.
- Adds the squared value to a running total.

After all $N$ jobs are processed, print:

- The number of processed jobs.
- The sum of the squared values.

You must use `LinkedBlockingQueue` and the `take()` method.

### Input Format
- The first line contains an integer $N$.
- The second line contains $N$ integers representing the jobs.
### Output Format

Print:

```
Processed: count
Result: sum

```

### Sample 1:
Input
Output

```
4
2 3 4 5
```

```
Processed: 4
Result: 54
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:18:55.961Z  

```java
import java.util.*;
import java.util.concurrent.*;

class Worker extends Thread
{
    private BlockingQueue<Integer> queue;
    private int numberOfJobs;

    private int processed = 0;
    private long result = 0;

    Worker(BlockingQueue<Integer> queue, int numberOfJobs)
    {
        this.queue = queue;
        this.numberOfJobs = numberOfJobs;
    }

    public void run()
    {
        try
        {
            for (int i = 0; i < numberOfJobs; i++)
            {
                int value = queue.take();

                result += (long) value * value;
                processed++;
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    int getProcessed()
    {
        return processed;
    }

    long getResult()
    {
        return result;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BlockingQueue<Integer> queue =
                new LinkedBlockingQueue<>();

        for (int i = 0; i < n; i++)
        {
            queue.put(sc.nextInt());
        }

        Worker worker = new Worker(queue, n);

        worker.start();
        worker.join();

        System.out.println("Processed: " + worker.getProcessed());
        System.out.println("Result: " + worker.getResult());

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BLOCKQUEP)