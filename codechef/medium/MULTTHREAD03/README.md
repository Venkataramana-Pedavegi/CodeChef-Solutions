# MULTTHREAD03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Concurrent Warehouse Update Processor

A warehouse stores the  **stock**  and  **price**  of $N$ products. Multiple threads may update or read these values at the same time.

Your task is to complete the `Warehouse` class so that all operations are thread-safe using Java locks.

For product $P$, the following operations may occur:

- updateStock(P, D) — Add $D$ to its stock.
- updatePrice(P, D) — Add $D$ to its price.
- getStock(P) — Return its current stock.
- getPrice(P) — Return its current price.

The updates are defined as:

$$ stock[P] = stock[P] + D $$
$$ price[P] = price[P] + D $$
### Task

Complete the constructor and methods of the `Warehouse` class:

- Warehouse(long[] stock, long[] price)
- void updateStock(int productId, long delta)
- void updatePrice(int productId, long delta)
- long getStock(int productId)
- long getPrice(int productId)
### Lock Requirements

You must use:

- Lock with ReentrantLock to protect stock operations.
- ReadWriteLock with ReentrantReadWriteLock to protect price operations.
- The read lock while reading prices.
- The write lock while modifying prices.
- A finally block to release every acquired lock.

The driver code will create multiple threads and call these methods concurrently.

### Input Format

The input is handled by the provided driver code.

It contains:

- The number of products.
- Initial stock values.
- Initial price values.
- A sequence of stock and price operations.
### Output Format

The driver code prints the final stock and price of every product after all worker threads have completed.

### Constraints
- $1 \le N \le 10^5$
- $1 \le \text{productId} \le N$
### Sample 1:
Input
Output

```
3 2 6
10 20 30
100 200 300
STOCK 1 5
PRICE 2 25
STOCK 3 -10
PRICE 1 -20
STOCK 2 7
PRICE 3 50
```

```
1 15 80
2 27 225
3 20 350
TOTAL_STOCK 62
TOTAL_PRICE 655
```

### Explanation:
### Explanation

After applying all updates:

- Final stock values: $15$, $27$, $20$
- Final price values: $80$, $225$, $350$

Therefore,

$$ TOTAL\ STOCK = 15 + 27 + 20 = 62 $$
$$ TOTAL\ PRICE = 80 + 225 + 350 = 655 $$

Locks ensure that concurrent updates are performed safely without losing any changes.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:06:49.424Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/MULTTHREAD03)