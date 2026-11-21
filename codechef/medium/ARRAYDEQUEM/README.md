# ARRAYDEQUEM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### ArrayDeque - MCQ

Which of the following statements about ArrayDeque is correct?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:15:39.940Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/ARRAYDEQUEM)