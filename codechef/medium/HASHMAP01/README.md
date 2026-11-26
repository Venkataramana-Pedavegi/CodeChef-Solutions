# HASHMAP01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inventory Management System

A store maintains its inventory using a `HashMap<String, Integer>`, where the key represents the item name and the value represents its current quantity.

You are given $Q$ inventory operations. Process each operation in the order given.

### Operations

Each operation is one of the following:

- ADD item quantity If the item does not exist, add it with the given quantity. If it already exists, increase its current quantity by the given amount.
- SELL item quantity If the item exists and has enough stock, decrease its quantity. Otherwise, print: Insufficient stock
- CHECK item If the item exists, print: item quantity Otherwise, print: item not available
- REMOVE item Remove the item from the inventory if its quantity is 0. If its quantity is greater than 0, do nothing.

After processing all operations, print the total quantity of all items currently stored in the inventory.

### Input Format
- The first line contains an integer $Q$, the number of operations.
- Each of the next $Q$ lines contains one inventory operation.
### Output Format
- Print the required result for every CHECK operation.
- Print Insufficient stock whenever a SELL operation cannot be completed.
- Finally, print:

```
Total Items: X

```

where $X$ is the sum of the quantities of all items remaining in the inventory.

### Sample 1:
Input
Output

```
9
ADD Apples 50
ADD Bananas 30
ADD Oranges 40
ADD Apples 20
SELL Bananas 10
CHECK Apples
SELL Oranges 50
CHECK Bananas
REMOVE Oranges
```

```
Apples 70
Insufficient stock
Bananas 20
Total Items: 130
```

### Explanation:
- Apples becomes $50 + 20 = 70$.
- Bananas becomes $30 - 10 = 20$.
- Selling $50$ Oranges fails because only $40$ are available.
- Oranges is not removed because its quantity is still greater than $0$.

Therefore,

$$ Total = 70 + 20 + 40 = 130 $$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:13:32.953Z  

```java
import java.io.*;
import java.util.*;

class InventoryManager
{
    private final HashMap<String, Integer> inventory;

    InventoryManager()
    {
        inventory = new HashMap<>();
    }

    void addItem(String item, int quantity)
    {
        inventory.put(
            item,
            inventory.getOrDefault(item, 0) + quantity
        );
    }

    void sellItem(String item, int quantity)
    {
        if (inventory.containsKey(item) &&
            inventory.get(item) >= quantity)
        {
            inventory.put(
                item,
                inventory.get(item) - quantity
            );
        }
        else
        {
            System.out.println("Insufficient stock");
        }
    }

    void checkItem(String item)
    {
        if (inventory.containsKey(item))
        {
            System.out.println(
                item + " " + inventory.get(item)
            );
        }
        else
        {
            System.out.println(
                item + " not available"
            );
        }
    }

    void removeItem(String item)
    {
        if (inventory.containsKey(item) &&
            inventory.get(item) == 0)
        {
            inventory.remove(item);
        }
    }

    int getTotalItems()
    {
        int total = 0;

        for (int quantity : inventory.values())
        {
            total += quantity;
        }

        return total;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        InventoryManager manager =
            new InventoryManager();

        while (q-- > 0)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();
            String item = st.nextToken();

            if (operation.equals("ADD"))
            {
                int quantity =
                    Integer.parseInt(st.nextToken());

                manager.addItem(item, quantity);
            }
            else if (operation.equals("SELL"))
            {
                int quantity =
                    Integer.parseInt(st.nextToken());

                manager.sellItem(item, quantity);
            }
            else if (operation.equals("CHECK"))
            {
                manager.checkItem(item);
            }
            else if (operation.equals("REMOVE"))
            {
                manager.removeItem(item);
            }
        }

        System.out.println(
            "Total Items: " +
            manager.getTotalItems()
        );
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP01)