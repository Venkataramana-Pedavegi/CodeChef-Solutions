# LISTITERTT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:11:15.176Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++)
        {
            list.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();

            if (operation.equals("ADD_FIRST"))
            {
                int value = sc.nextInt();
                list.addFirst(value);
            }
            else if (operation.equals("ADD_LAST"))
            {
                int value = sc.nextInt();
                list.addLast(value);
            }
            else if (operation.equals("REMOVE_FIRST"))
            {
                if (!list.isEmpty())
                {
                    list.removeFirst();
                }
            }
            else if (operation.equals("REMOVE_LAST"))
            {
                if (!list.isEmpty())
                {
                    list.removeLast();
                }
            }
        }

        if (list.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            for (int i = 0; i < list.size(); i++)
            {
                if (i > 0)
                {
                    System.out.print(" ");
                }

                System.out.print(list.get(i));
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LISTITERTT)