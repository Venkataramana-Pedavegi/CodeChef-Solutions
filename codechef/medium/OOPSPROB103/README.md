# OOPSPROB103

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** default  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:03:52.762Z  

```default
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

[View on CodeChef](https://www.codechef.com/problems/OOPSPROB103)