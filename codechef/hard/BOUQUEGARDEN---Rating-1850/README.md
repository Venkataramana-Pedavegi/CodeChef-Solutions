# BOUQUEGARDEN - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Bouquet Garden

You have a garden with $N$ flowers planted in a row. The $i^\text{th}$ flower will bloom on day $bloomDay[i]$. Once a flower blooms, it can be used to make a bouquet  **exactly once**.

You want to make  **m bouquets**, and each bouquet requires  **k adjacent flowers**  from the garden.

## Function Declaration
### Function Name

$minDays$ – This function calculates the minimum number of days needed to make the required bouquets.

### Parameters
- $bloomDay$ : An array where $bloomDay[i]$ represents the day the $i^\text{th}$ flower blooms.
- $m$ : The number of bouquets required.
- $k$ : The number of adjacent flowers needed per bouquet.
### Return Value
- Returns a single integer — the minimum number of days required to make $m$ bouquets.
- Returns $-1$ if it is impossible to make the bouquets.
## Constraints
- $1 ≤ N ≤ 10^5$
- $1 ≤ bloomDay[i] ≤ 10^9$
- $1 ≤ m ≤ 10^5$
- $1 ≤ k ≤ N$
- Each flower can be used only once
- Flowers used in a bouquet must be adjacent
### Input Format
- First line contains three integers: $N$, $m$, $k$ — the number of flowers, the number of bouquets, and the number of adjacent flowers needed per bouquet.
- Second line contains $N$ space-separated integers: $bloomDay[1], bloomDay[2],..., bloomDay[N]$ — the day each flower blooms.
### Output Format
- Print a single integer — the minimum number of days required.
- Print $-1$ if it is impossible to form $m$ bouquets.
### Sample 1:
Input
Output

```
5 3 1
1 10 3 10 2

```

```
3

```

### Explanation:

After 3 days, the flowers bloom as `[x, _, x, _, x]`. We can make 3 bouquets (each with 1 flower).

### Sample 2:
Input
Output

```
5 3 2
1 10 3 10 2
```

```
-1
```

### Explanation:

Each bouquet requires 2 flowers, so 3 bouquets need 6 flowers. There are only 5 flowers, so it's impossible.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T14:48:18.335Z  

```java
static int minDays(int[] bloomDay, int m, int k) {
    // If total flowers needed exceed available flowers, it is impossible
    if ((long) m * k > bloomDay.length) {
        return -1;
    }

    int low = Integer.MAX_VALUE;
    int high = Integer.MIN_VALUE;

    for (int day : bloomDay) {
        low = Math.min(low, day);
        high = Math.max(high, day);
    }

    int ans = -1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (canMakeBouquets(bloomDay, m, k, mid)) {
            ans = mid;
            high = mid - 1; // Try to find a smaller valid day
        } else {
            low = mid + 1;  // Need more days for flowers to bloom
        }
    }

    return ans;
}

private static boolean canMakeBouquets(int[] bloomDay, int m, int k, int currentDay) {
    int bouquets = 0;
    int flowers = 0;

    for (int day : bloomDay) {
        if (day <= currentDay) {
            flowers++;
            if (flowers == k) {
                bouquets++;
                flowers = 0; // Reset count for the next bouquet
            }
        } else {
            flowers = 0; // Adjacent sequence broken
        }
    }

    return bouquets >= m;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BOUQUEGARDEN)