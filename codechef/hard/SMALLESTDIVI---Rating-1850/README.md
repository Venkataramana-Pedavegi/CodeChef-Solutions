# SMALLESTDIVI - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T14:48:22.024Z  

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

[View on CodeChef](https://www.codechef.com/problems/SMALLESTDIVI)