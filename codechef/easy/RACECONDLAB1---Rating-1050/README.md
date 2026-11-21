# RACECONDLAB1 - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Concurrent Account Ledger

A banking application processes account transactions using multiple threads.

Each worker thread performs a fixed transaction several times on the same shared `Account` object. Since all threads access and modify the same `balance` and `transactionCount`, concurrent execution can cause  **race conditions**  and produce incorrect results.

Your task is to make the `Account` class thread-safe using Java synchronization.

### Tasks

In `Codechef.java`, complete the following:

 **1. Make `TransactionWorker` a thread** 

Complete this class declaration:

```
class TransactionWorker ___________

```

so that `TransactionWorker`  **extends the Java `Thread` class**.

 **2. Complete `Account.processTransaction(long amount)`** 

Make the method `synchronized`.

For every transaction:

- add amount to balance
- increment transactionCount by 1

A positive `amount` represents a deposit and a negative `amount` represents a withdrawal.

 **3. Complete `Account.getBalance()`** 

Make the method `synchronized` and return the current value of `balance`.

 **4. Complete `Account.getTransactionCount()`** 

Make the method `synchronized` and return the current value of `transactionCount`.

### Input Format
- The first line contains two integers $B$ and $N$: $B$ — initial account balance $N$ — number of worker threads
- The next $N$ lines contain two integers $A_i$ and $R_i$: $A_i$ — amount added to or deducted from the balance $R_i$ — number of times the transaction is performed

 *A positive amount represents a deposit, while a negative amount represents a withdrawal.* 

### Output Format

Print:

```
Final Balance: <balance>
Transactions Processed: <count>

```

### Sample 1:
Input
Output

```
1000 4
10 1000
-5 2000
20 500
-2 2500
```

```
Final Balance: 6000
Transactions Processed: 6000
```

### Explanation:

The final balance is calculated as: $1000 + (10 \times 1000) + (-5 \times 2000) + (20 \times 500) + (-2 \times 2500) = 6000$

The total number of transactions processed is: $1000 + 2000 + 500 + 2500 = 6000$

All four worker threads operate concurrently on the same `Account` instance. The shared state (balance and transaction count) must be protected using synchronization mechanisms to prevent race conditions.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:05:01.207Z  

```cpp
import java.util.*;

class SharedResource
{
    private final Queue<Integer> buffer;
    private final int capacity;

    private int nextIndex = 0;
    private int activeProducers;

    private int producedCount = 0;
    private int consumedCount = 0;

    private long producedSum = 0;
    private long consumedSum = 0;

    SharedResource(int capacity, int producerCount)
    {
        this.capacity = capacity;
        this.activeProducers = producerCount;
        this.buffer = new LinkedList<>();
    }

    public synchronized Integer getNextItem(int[] items)
    {
        if (nextIndex >= items.length)
        {
            return null;
        }

        return items[nextIndex++];
    }

    public synchronized void produce(int item) throws InterruptedException
    {
        while (buffer.size() == capacity)
        {
            wait();
        }

        buffer.offer(item);

        producedCount++;
        producedSum += item;

        notifyAll();
    }

    public synchronized Integer consume() throws InterruptedException
    {
        while (buffer.isEmpty())
        {
            if (activeProducers == 0)
            {
                return null;
            }

            wait();
        }

        int item = buffer.poll();

        consumedCount++;
        consumedSum += item;

        notifyAll();

        return item;
    }


    public synchronized void producerFinished()
    {
        activeProducers--;
        notifyAll();
    }

    public synchronized int getProducedCount()
    {
        return producedCount;
    }

    public synchronized int getConsumedCount()
    {
        return consumedCount;
    }

    public synchronized long getProducedSum()
    {
        return producedSum;
    }

    public synchronized long getConsumedSum()
    {
        return consumedSum;
    }

    public synchronized boolean isEmpty()
    {
        return buffer.isEmpty();
    }

}

class Producer extends Thread
{
    private final SharedResource resource;
    private final int[] items;

    Producer(SharedResource resource, int[] items)
    {
        this.resource = resource;
        this.items = items;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Integer item = resource.getNextItem(items);

                if (item == null)
                {
                    break;
                }

                resource.produce(item);
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        finally
        {
            resource.producerFinished();
        }
    }
}

class Consumer extends Thread
{
    private final SharedResource resource;

    Consumer(SharedResource resource)
    {
        this.resource = resource;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                Integer item = resource.consume();

                if (item == null)
                {
                    break;
                }
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

}

class Codechef
{
    public static void main(String[] args)
            throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        int capacity = sc.nextInt();
        int producerCount = sc.nextInt();
        int consumerCount = sc.nextInt();

        int n = sc.nextInt();

        int[] items = new int[n];

        for (int i = 0; i < n; i++)
        {
            items[i] = sc.nextInt();
        }

        SharedResource resource =
                new SharedResource(
                        capacity,
                        producerCount
                );

        Producer[] producers =
                new Producer[producerCount];

        Consumer[] consumers =
                new Consumer[consumerCount];

        for (int i = 0; i < producerCount; i++)
        {
            producers[i] =
                    new Producer(resource, items);

            producers[i].start();
        }

        for (int i = 0; i < consumerCount; i++)
        {
            consumers[i] =
                    new Consumer(resource);

            consumers[i].start();
        }

        for (Producer producer : producers)
        {
            producer.join();
        }

        for (Consumer consumer : consumers)
        {
            consumer.join();
        }

        System.out.println(
                "Produced Count: " +
                resource.getProducedCount()
        );

        System.out.println(
                "Consumed Count: " +
                resource.getConsumedCount()
        );

        System.out.println(
                "Produced Sum: " +
                resource.getProducedSum()
        );

        System.out.println(
                "Consumed Sum: " +
                resource.getConsumedSum()
        );

        System.out.println(
                "Buffer Empty: " +
                resource.isEmpty()
        );

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RACECONDLAB1)