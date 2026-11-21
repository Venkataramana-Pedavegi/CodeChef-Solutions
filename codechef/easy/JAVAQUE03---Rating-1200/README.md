# JAVAQUE03 - Rating 1200

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Stone Pile

Aman and Akshat are trying to solve a task given to them by their teacher. They are given a pile of stones containing $N$ stones with an integer written on each of them. There are two different kinds of moves that can be performed on the pile :

- Player will remove a stone from the $top$ of the pile and put it back on the $bottom$ of the pile
- Player will remove a stone from the $top$ of the pile and $throw$ it away.

Aman in his turn will perform move $1$ once and then move $2$ once. Akshat in his turn will perform move $1$ twice and then move $2$ once.
They will stop making moves when there is only $1$ stone left in the pile.
Both of them gets turn alternatively with Aman going first. Find the person performing the last move and the number written on the last stone left in the pile.
The stones at index $i'th$ is located higher than the stones at index $j'th$, such that $(i \lt j)$

### Input Format
- The first line contains an integer $T$, representing $T$ Testcases.
- The first line of each test case contains an integer $N$, representing the size of Array $A$.
- The second line of each test case contains $N$ integer, representing array $A$
### Output Format
- For each test case, Print $2$ space-separated integer representing the person making the last move ($1$ for Aman and $0$ for Akshat) and the number written on the stone remaining.
### Sample 1:
Input
Output

```
3
3
-5 0 5
4 
-1 -3 2 4
6
-100000 0 0 100000 -1000000 1000000

```

```
0 -5
1 2
1 0
```

### Explanation:

In the first test case,
Aman removes the stone $-5$ and put it at the bottom making the pile $\{0,5,-5\}$.
Aman then removes the stone $0$ and throw it away making the pile $\{5,-5\}$.
Akshat then removes $5$ from the top and put it at the bottom of the pile making the pile $\{-5,5\}$.
Akshat then removes $-5$ from the top and put it at the bottom of the pile making the pile $\{5,-5\}$.
Akshat then removes the stone $5$ and throw it away making the pile $\{-5\}$.
The last stone remaining has $-5$ written on it.

In the second test case, Aman removes the second last stone, and the last stone remaining has $2$ written on it.
In the third test case, Aman removes the second last stone, and the last stone remaining has $0$ written on it.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:17:01.256Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/JAVAQUE03)