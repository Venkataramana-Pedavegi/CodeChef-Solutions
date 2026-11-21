# JAVAQUE06 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Traverse a Queue

You are given $N$ integers that are inserted into a queue in the given order.

Traverse the queue in two different ways:

- Using an enhanced for loop.
- Using an Iterator.

The queue must not be modified during traversal.

### Input Format
- The first line contains an integer $N$.
- The second line contains $N$ space-separated integers.
### Output Format

Print two lines:

- First line: elements traversed using the enhanced for loop.
- Second line: elements traversed using an Iterator.
### Sample 1:
Input
Output

```
5
10 20 30 40 50
```

```
10 20 30 40 50
10 20 30 40 50
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:15:22.334Z  

```java
import java.util.*;

class Codechef
{
    static void traverseUsingForEach(
        Queue<Integer> queue)
    {

        boolean first = true;
        for (int value : queue)
        {
            if (!first)
            {
                System.out.print(" ");
            }

            System.out.print(value);
            first = false;
        }
        System.out.println();

    }

    static void traverseUsingIterator(Queue<Integer> queue)
    {
        Iterator<Integer> iterator =
            queue.iterator();

        boolean first = true;

        while (iterator.hasNext())
        {
            if (!first)
            {
                System.out.print(" ");
            }

            System.out.print(iterator.next());
            first = false;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Queue<Integer> queue =
            new ArrayDeque<>();

        for (int i = 0; i < n; i++)
        {
            queue.offer(sc.nextInt());
        }

        traverseUsingForEach(queue);
        traverseUsingIterator(queue);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAQUE06)