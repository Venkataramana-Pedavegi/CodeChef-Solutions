# PRODCONS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bounded Producer-Consumer System

A processing system uses multiple producer threads to generate integer jobs and multiple consumer threads to process them. All threads communicate through a shared buffer with limited capacity.

Since producers and consumers execute concurrently, access to the shared buffer must be coordinated correctly. A producer may have to wait when the buffer is full, while a consumer may have to wait when no item is available.

Your task is to implement the shared buffer and thread coordination so that every input item is produced and consumed exactly once.

### Task

Complete the `SharedResource`, `Producer`, and `Consumer` classes to implement the  **Producer-Consumer problem**  using Java thread synchronization.

The program uses multiple producer and consumer threads that share a bounded queue.

### Requirements

Complete the following methods:

#### SharedResource
- getNextItem() Return the next unprocessed item from the input array. Return null when all items have been assigned. The method must be synchronized.
- produce() Wait while the buffer is full. Add the given item to the shared buffer. Update the produced item count and sum. Wake waiting threads using notifyAll().
- consume() Wait while the buffer is empty and producers are still active. Remove an item from the buffer. Update the consumed item count and sum. If all producers have finished and the buffer is empty, return null. Wake waiting threads using notifyAll().
- producerFinished() Decrease the number of active producers. Notify waiting consumer threads.
- Getter methods Return the produced count, consumed count, produced sum, and consumed sum safely.
### Producer

Complete the `run()` method so that each producer:

- Obtains the next available item using getNextItem().
- Stops when no item remains.
- Adds each item to the buffer using produce().
- Handles InterruptedException.
- Calls producerFinished() before terminating.
### Consumer

Complete the `run()` method so that each consumer:

- Repeatedly calls consume().
- Stops when consume() returns null.
- Handles InterruptedException correctly.
### Synchronization Requirements

Your implementation must use:

- synchronized
- wait()
- notifyAll()
- Multiple producer and consumer threads

The shared queue must never exceed its specified capacity.

### Input Format
- The first line contains three integers $B$, $P$, and $C$: $B$ — maximum capacity of the shared buffer $P$ — number of producer threads $C$ — number of consumer threads
- The second line contains an integer $N$, representing the number of items.
- The third line contains $N$ space-separated integers representing the items to be produced.
### Output Format

After all producer and consumer threads terminate, print:

```
Produced Count: <count>
Consumed Count: <count>
Produced Sum: <sum>
Consumed Sum: <sum>
Buffer Empty: <true/false>

```

### Sample 1:
Input
Output

```
2 3 2
8
10 20 30 40 50 60 70 80
```

```
Produced Count: 8
Consumed Count: 8
Produced Sum: 360
Consumed Sum: 360
Buffer Empty: true
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:03:19.502Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/PRODCONS)