# JAVAQUE04 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Customer Service Queue

You are managing a customer service counter using a  **Queue**.

Customers arrive at the counter and are served in  **FIFO (First In, First Out)**  order.

You are given $Q$ operations. Process them using a Java `Queue<Integer>`.

### Operations

Each operation is one of the following:

- ADD X — Add customer ID $X$ to the rear of the queue.
- SERVE — Remove and print the customer at the front of the queue. If the queue is empty, print EMPTY.
- FRONT — Print the customer currently at the front without removing them. If the queue is empty, print EMPTY.
- SIZE — Print the current number of customers.
- EMPTY — Print true if the queue is empty, otherwise print false.
### Input Format
- The first line contains an integer $Q$.
- The next $Q$ lines contain one operation each.
### Output Format

Print the result for every `SERVE`, `FRONT`, `SIZE`, and `EMPTY` operation.

### Sample 1:
Input
Output

```
 9
ADD 101
ADD 102
FRONT
SIZE
SERVE
ADD 103
SERVE
SERVE
EMPTY
```

```
101
2
101
102
103
true
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:16:00.530Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Queue<Integer> queue =
            new ArrayDeque<>();

        while (q-- > 0)
        {
            String operation = sc.next();

            switch (operation)
            {
                case "ADD":
                {
                    int x = sc.nextInt();
                    queue.offer(x);
                    break;
                }

                case "SERVE":
                {
                    if (queue.isEmpty())
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(queue.poll());
                    }

                    break;
                }

                case "FRONT":
                {
                    if (queue.isEmpty())
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(queue.peek());
                    }

                    break;
                }

                case "SIZE":
                {
                    System.out.println(queue.size());
                    break;
                }

                case "EMPTY":
                {
                    System.out.println(queue.isEmpty());
                    break;
                }
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAQUE04)