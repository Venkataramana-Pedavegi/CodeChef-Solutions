# JAVAMCQ71 - Rating 650

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Exception Hierarchy

Which of the following is the superclass of all exception classes in Java?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:06:58.196Z  

```cpp
import java.io.*;
import java.util.*;
import java.util.concurrent.locks.*;

class Operation
{
    String type;
    int productId;
    long delta;

    Operation(String type, int productId, long delta)
    {
        this.type = type;
        this.productId = productId;
        this.delta = delta;
    }
}

class Warehouse
{
    private final long[] stock;
    private final long[] price;

    private final Lock stockLock;

    private final ReadWriteLock priceLock;
    private final Lock priceReadLock;
    private final Lock priceWriteLock;

    Warehouse(long[] stock, long[] price)
    {
        this.stock = stock;
        this.price = price;

        stockLock = new ReentrantLock();

        priceLock = new ReentrantReadWriteLock();
        priceReadLock = priceLock.readLock();
        priceWriteLock = priceLock.writeLock();
    }

    void updateStock(int productId, long delta)
    {
        stockLock.lock();

        try
        {
            stock[productId - 1] += delta;
        }
        finally
        {
            stockLock.unlock();
        }
    }

    void updatePrice(int productId, long delta)
    {
        priceWriteLock.lock();

        try
        {
            price[productId - 1] += delta;
        }
        finally
        {
            priceWriteLock.unlock();
        }
    }

    long getStock(int productId)
    {
        stockLock.lock();

        try
        {
            return stock[productId - 1];
        }
        finally
        {
            stockLock.unlock();
        }
    }

    long getPrice(int productId)
    {
        priceReadLock.lock();

        try
        {
            return price[productId - 1];
        }
        finally
        {
            priceReadLock.unlock();
        }
    }
}


class Worker extends Thread
{
    private final int workerId;
    private final int totalWorkers;
    private final Operation[] operations;
    private final Warehouse warehouse;

    Worker(
        int workerId,
        int totalWorkers,
        Operation[] operations,
        Warehouse warehouse
    )
    {
        this.workerId = workerId;
        this.totalWorkers = totalWorkers;
        this.operations = operations;
        this.warehouse = warehouse;
    }

    @Override
    public void run()
    {
        for (
            int i = workerId;
            i < operations.length;
            i += totalWorkers
        )
        {
            Operation operation = operations[i];

            if (operation.type.equals("STOCK"))
            {
                warehouse.updateStock(
                    operation.productId,
                    operation.delta
                );
            }
            else if (operation.type.equals("PRICE"))
            {
                warehouse.updatePrice(
                    operation.productId,
                    operation.delta
                );
            }
        }
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        long[] stock = new long[n];
        long[] price = new long[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            stock[i] = Long.parseLong(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            price[i] = Long.parseLong(st.nextToken());
        }

        Operation[] operations = new Operation[q];

        for (int i = 0; i < q; i++)
        {
            st = new StringTokenizer(br.readLine());

            String type = st.nextToken();
            int productId = Integer.parseInt(st.nextToken());
            long delta = Long.parseLong(st.nextToken());

            operations[i] =
                new Operation(type, productId, delta);
        }

        Warehouse warehouse =
            new Warehouse(stock, price);

        Worker[] workers = new Worker[t];

        for (int i = 0; i < t; i++)
        {
            workers[i] =
                new Worker(
                    i,
                    t,
                    operations,
                    warehouse
                );

            workers[i].start();
        }

        for (int i = 0; i < t; i++)
        {
            workers[i].join();
        }

        long totalStock = 0;
        long totalPrice = 0;

        for (int i = 1; i <= n; i++)
        {
            long currentStock =
                warehouse.getStock(i);

            long currentPrice =
                warehouse.getPrice(i);

            totalStock += currentStock;
            totalPrice += currentPrice;

            System.out.println(
                i + " " +
                currentStock + " " +
                currentPrice
            );
        }

        System.out.println(
            "TOTAL_STOCK " + totalStock
        );

        System.out.println(
            "TOTAL_PRICE " + totalPrice
        );
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAMCQ71)