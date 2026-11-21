# LIST07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### LinkedList Insert and Remove Elements

You are given a LinkedList containing $N$ integers and $Q$ operations.

Each operation is one of the following:

- ADD_FIRST X : insert $X$ at the beginning.
- ADD_LAST X : insert $X$ at the end.
- REMOVE_FIRST : remove the first element if the list is not empty.
- REMOVE_LAST : remove the last element if the list is not empty.

Process all operations and print the final contents of the list.

If the list is empty, print `Empty`.

### Input Format
- The first line contains an integer $N$.
- The second line contains $N$ integers. If $N = 0$, this line may be empty.
- The next line contains $Q$.
- The next $Q$ lines contain operations.
### Output Format
- Print the final elements separated by spaces.
- If no elements remain, print Empty.
### Sample 1:
Input
Output

```
3
10 20 30
4
ADD_FIRST 5
ADD_LAST 40
REMOVE_FIRST
REMOVE_LAST
```

```
10 20 30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:11:14.016Z  

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

[View on CodeChef](https://www.codechef.com/problems/LIST07)