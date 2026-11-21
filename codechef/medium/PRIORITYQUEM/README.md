# PRIORITYQUEM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Priority Queue in Java

What will be the output of the following Java code?

```
PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.offer(40);
pq.offer(10);
pq.offer(30);
pq.offer(20);

System.out.println(pq.poll());

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:17:21.604Z  

```cpp
import java.io.*;
import java.util.*;

class Codechef
{
    static long[] processPile(long[] stones)
    {
        Deque<Long> pile = new ArrayDeque<>();

        for (long stone : stones)
        {
            pile.addLast(stone);
        }

        boolean amanTurn = true;
        boolean lastPlayerAman = true;

        while (pile.size() > 1)
        {
            if (amanTurn)
            {
                // Move 1: top -> bottom
                pile.addLast(pile.removeFirst());

                // Move 2: throw top stone
                pile.removeFirst();
            }
            else
            {
                // Move 1 twice: top -> bottom
                pile.addLast(pile.removeFirst());
                pile.addLast(pile.removeFirst());

                // Move 2: throw top stone
                pile.removeFirst();
            }

            lastPlayerAman = amanTurn;
            amanTurn = !amanTurn;
        }

        long player =
            lastPlayerAman ? 1 : 0;

        long remainingStone =
            pile.removeFirst();

        return new long[]{
            player,
            remainingStone
        };
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0)
        {
            int n = Integer.parseInt(br.readLine().trim());

            long[] stones = new long[n];

            StringTokenizer st =
                new StringTokenizer(br.readLine());

            for (int i = 0; i < n; i++)
            {
                stones[i] =
                    Long.parseLong(st.nextToken());
            }

            long[] result =
                processPile(stones);

            System.out.println(
                result[0] + " " + result[1]
            );
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRIORITYQUEM)