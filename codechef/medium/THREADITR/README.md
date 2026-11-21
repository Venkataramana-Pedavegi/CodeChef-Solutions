# THREADITR

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worker Thread Interruption and Coordination

A worker thread processes integers from $1$ to $N$ in increasing order and maintains:

- the running sum of processed values;
- the number of values processed.

The worker has a checkpoint at position $K$.

When the worker processes the $K$-th value, it must signal that the checkpoint has been reached and enter the sleeping state. The main coordination logic (coordinator) must detect this checkpoint, interrupt the sleeping worker, and wait for it to terminate.

A `volatile` variable for reporting the checkpoint state is already provided in the `Worker` class.

 **Task** 
Complete:

- The run() method of the Worker class.
- The execute() method of the ThreadCoordinator class.

The remaining code is provided as driver code and must not be modified.

 **Worker Behaviour** 
The `run()` method must:

- process integers from $1$ to $N$.
- update sum and processed for every processed value.
- mark the checkpoint as reached after processing value $K$.
- At the checkpoint, put the worker thread to sleep for 60000 milliseconds (60 seconds), so it remains sleeping until interrupted by the coordinator.
- terminate when the sleeping thread is interrupted.
- record that the interruption occurred.
- use Thread.yield() while processing values before the checkpoint.

 **Thread Coordination** 
`ThreadCoordinator.execute()` must:

- start the worker.
- wait until the worker reports that the checkpoint has been reached.
- use Thread.yield() while waiting.
- interrupt the worker.
- wait for the worker to terminate before returning.
### Output Format

Print three lines:

```
<sum>
<processed_count>
INTERRUPTED

```

Here:

- sum is the sum of all values processed before interruption.
- processed_count is the number of processed values.
### Sample 1:
Input
Output

```
10 4
```

```
10
4
INTERRUPTED
```

### Explanation:

The worker processes: [ 1,2,3,4 ]

Therefore, [ sum = 1+2+3+4 = 10 ] and: [ processed = 4 ] After reaching the checkpoint at $K=4$, the worker enters the sleeping state. The coordinator interrupts it and waits for its termination.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:01:26.663Z  

```cpp
import java.util.*;

class MyRunnable implements Runnable
{
    private final int n;
    private final StringBuilder output;

    MyRunnable(int n)
    {
        this.n = n;
        this.output = new StringBuilder();
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= n; i++)
        {
            output.append("RunnableTask - Count: ")
                  .append(i)
                  .append("\n");
        }
    }

    String getOutput()
    {
        return output.toString();
    }
}

class MyThread extends Thread
{
    private final int n;
    private final StringBuilder output;

    MyThread(int n)
    {
        this.n = n;
        this.output = new StringBuilder();
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= n; i++)
        {
            output.append("ThreadTask - Count: ")
                  .append(i)
                  .append("\n");
        }
    }

    String getOutput()
    {
        return output.toString();
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MyRunnable runnableTask =
            new MyRunnable(n);

        Thread runnableThread =
            new Thread(runnableTask);

        MyThread threadTask =
            new MyThread(n);

        runnableThread.start();
        threadTask.start();

        runnableThread.join();
        threadTask.join();

        System.out.print(runnableTask.getOutput());
        System.out.print(threadTask.getOutput());

        System.out.println("Both threads completed.");

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/THREADITR)