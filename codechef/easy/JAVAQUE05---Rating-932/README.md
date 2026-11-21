# JAVAQUE05 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Deque Command Processor

You are given $Q$ operations on a double-ended queue.

A  **Deque**  allows insertion and deletion from both the front and rear.

Process the operations using Java `Deque<Integer>`.

### Operations
- ADD_FRONT X — Insert $X$ at the front.
- ADD_REAR X — Insert $X$ at the rear.
- REMOVE_FRONT — Remove and print the front element. Print EMPTY if the deque is empty.
- REMOVE_REAR — Remove and print the rear element. Print EMPTY if the deque is empty.
### Input Format
- The first line contains an integer $Q$.
- The next $Q$ lines contain one operation each.
### Output Format

Print the removed value for every removal operation.

### Sample 1:
Input
Output

```
8
ADD_FRONT 10
ADD_REAR 20
ADD_FRONT 5
REMOVE_REAR
ADD_REAR 30
REMOVE_FRONT
REMOVE_FRONT
REMOVE_REAR
```

```
20
5
10
30
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:16:36.470Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Deque<Integer> deque =
            new ArrayDeque<>();

        while (q-- > 0)
        {
            String operation = sc.next();

            switch (operation)
            {
                case "ADD_FRONT":
                {
                    int x = sc.nextInt();
                    deque.addFirst(x);
                    break;
                }

                case "ADD_REAR":
                {
                    int x = sc.nextInt();
                    deque.addLast(x);
                    break;
                }

                case "REMOVE_FRONT":
                {
                    Integer value =
                        deque.pollFirst();

                    if (value == null)
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(value);
                    }

                    break;
                }

                case "REMOVE_REAR":
                {
                    Integer value =
                        deque.pollLast();

                    if (value == null)
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(value);
                    }

                    break;
                }
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAQUE05)