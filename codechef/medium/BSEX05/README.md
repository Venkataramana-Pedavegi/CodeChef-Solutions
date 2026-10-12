# BSEX05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Wildfire

A wildfire is approaching, and you need to set up emergency water sprinklers to protect all houses along a straight road. Each sprinkler has a fixed coverage radius, meaning it can cover houses within a certain distance from its position. Your task is to determine the minimum radius required for the sprinklers so that every house on the road is within the coverage of at least one sprinkler.

Given the positions of the houses and sprinklers on a horizontal line, calculate the smallest coverage radius that ensures all houses are protected. Note that all sprinklers must use the same coverage radius.

### Input Format
- The first line contains an integer $n$, the number of houses.
- The second line contains $n$ space-separated integers, where each integer $houses[i]$ represents the position of the $i$-th house on the road.
- The third line contains an integer $m$, the number of sprinklers.
- The fourth line contains $m$ space-separated integers, where each integer $sprinklers[i]$ represents the position of the $i$-th sprinkler on the road.
### Output Format
- A single integer representing the minimum radius required for the sprinklers to ensure all houses are protected.
### Constraints
- $1 \leq \text{houses.length}, \text{sprinklers.length} \leq 10^5$
- $1 \leq \text{houses}[i], \text{sprinklers}[i] \leq 10^9$
### Sample 1:
Input
Output

```
4
1 2 3 4
2
1 4

```

```
1
```

### Explanation:
- The two sprinklers are placed at positions 1 and 4.
- The first sprinkler at position 1 covers houses at positions 1 and 2.
- The second sprinkler at position 4 covers houses at positions 3 and 4.
- A radius of 1 ensures that every house is protected.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-12T16:50:29.626Z  

```java

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] houses = new int[n];

        for (int i = 0; i < n; i++) {
            houses[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] sprinklers = new int[m];

        for (int i = 0; i < m; i++) {
            sprinklers[i] = sc.nextInt();
        }

        Arrays.sort(houses);
        Arrays.sort(sprinklers);

        int maxRadius = 0;

        for (int house : houses) {
            int low = 0;
            int high = m - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (sprinklers[mid] < house) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            int rightDistance = Math.abs(sprinklers[low] - house);
            int leftDistance = Integer.MAX_VALUE;

            if (low > 0) {
                leftDistance = Math.abs(sprinklers[low - 1] - house);
            }

            int distance = Math.min(leftDistance, rightDistance);
            maxRadius = Math.max(maxRadius, distance);
        }

        System.out.println(maxRadius);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX05)