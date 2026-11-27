# MUSICSTREAM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Music Streaming Group Deal

A newly launched music streaming platform,  **Melody**, allows up to $4$ users to share a single subscription.

A group of $M$ friends wants to obtain access to the platform for every member in the group. If the price of one subscription is $Y$ dollars, determine the  **minimum total cost**  required to ensure that all $M$ friends have access to the platform.

### Task

Complete only the `calculateTotalCost()` method using the  **Java Stream API**.

### Input Format
- The first and only line of input contains two space-separated integers $M$ and $Y$ — the number of friends in the group and the cost of a single subscription, respectively.
### Output Format
- Output a single integer representing the minimum total cost incurred by the group.
### Sample 1:
Input
Output

```
1 45
```

```
45
```

### Explanation:

For $M = 1$, only $1$ subscription is required. Total cost = $1 \times 45 = 45$.

### Sample 2:
Input
Output

```
7 67
```

```
134
```

### Explanation:

For $M = 7$, $2$ subscriptions are required since $\lceil 7 / 4 \rceil = 2$. Total cost = $2 \times 67 = 134$.

### Sample 3:
Input
Output

```
13 50
```

```
200
```

### Explanation:

For $M = 13$, $4$ subscriptions are required since $\lceil 13 / 4 \rceil = 4$. Total cost = $4 \times 50 = 200$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:45:12.422Z  

```java
import java.util.*;
import java.util.stream.*;

class Codechef
{
    static int calculateTotalCost(Stream<int[]> data)
    {
        return data
            .mapToInt(values ->
            {
                int m = values[0];
                int y = values[1];

                return ((m + 3) / 4) * y;
            })
            .findFirst()
            .orElse(0);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int y = sc.nextInt();

        Stream<int[]> data =
            Stream.of(new int[]{m, y});

        System.out.println(
            calculateTotalCost(data)
        );

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MUSICSTREAM)