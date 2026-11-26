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