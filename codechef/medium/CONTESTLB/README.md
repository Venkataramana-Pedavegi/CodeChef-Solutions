# CONTESTLB

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Contest Leaderboard

You are given $N$ contestants in a contest along with their scores. Each contestant has:

- A unique $\text{name}$
- The number of $\text{solved}$ problems
- A $\text{penalty}$ time

Sort the contestants according to the following ranking rules:

- More solved problems come first.
- If the number of solved problems is equal, lower penalty comes first.
- If both solved problems and penalty are equal, sort their names lexicographically.

Assign ranks using standard competition ranking:

- Contestants with identical solved counts and penalties receive the same rank.
- The rank of the next contestant after a tie is incremented by the total number of tied contestants preceding them (e.g., ranks may be $1, 2, 2, 4$).

Print the rank and name of each contestant in the sorted order.

### Input Format
- The first line contains an integer $N$, representing the number of contestants.
- The next $N$ lines each contain: $\text{name}$ $\text{solved}$ $\text{penalty}$
### Output Format
- Print $N$ lines, each containing the rank and name of a contestant separated by a space in the sorted order: $\text{rank } \text{name}$
### Constraints
- $0 \le \text{penalty} \le 10^9$
- Names consist only of uppercase and lowercase English letters and are distinct.
### Sample 1:
Input
Output

```
5
Alice 4 300
Bob 5 500
Carol 5 400
David 4 300
Eve 3 100
```

```
1 Carol
2 Bob
3 Alice
3 David
5 Eve
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:42:44.045Z  

```java
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

class Contestant
{
    String name;
    int solved;
    long penalty;

    Contestant(String name, int solved, long penalty)
    {
        this.name = name;
        this.solved = solved;
        this.penalty = penalty;
    }
}

class Codechef
{
    static List<String> rankContestants(
        Stream<Contestant> contestants)
    {
            List<Contestant> sorted =
            contestants
                .sorted(
                    Comparator
                        .comparingInt(
                            (Contestant c) -> c.solved
                        )
                        .reversed()
                        .thenComparingLong(
                            c -> c.penalty
                        )
                        .thenComparing(
                            c -> c.name
                        )
                )
                .collect(Collectors.toList());

        AtomicInteger position =
            new AtomicInteger(0);

        AtomicInteger currentRank =
            new AtomicInteger(0);

        int[] previousSolved =
            {Integer.MIN_VALUE};

        long[] previousPenalty =
            {Long.MIN_VALUE};

        return sorted.stream()
            .map(c ->
            {
                int pos =
                    position.incrementAndGet();

                if (pos == 1 ||
                    c.solved != previousSolved[0] ||
                    c.penalty != previousPenalty[0])
                {
                    currentRank.set(pos);
                }

                previousSolved[0] = c.solved;
                previousPenalty[0] = c.penalty;

                return currentRank.get()
                    + " " + c.name;
            })
            .collect(Collectors.toList());

    }

    public static void main(String[] args)
        throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        int n = Integer.parseInt(br.readLine());

        List<Contestant> contestants =
            new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int solved =
                Integer.parseInt(st.nextToken());
            long penalty =
                Long.parseLong(st.nextToken());

            contestants.add(
                new Contestant(
                    name,
                    solved,
                    penalty
                )
            );
        }

        List<String> result =
            rankContestants(
                contestants.stream()
            );

        result.forEach(System.out::println);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CONTESTLB)