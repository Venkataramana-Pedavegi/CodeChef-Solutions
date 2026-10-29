# TRUCKDRIVER - Rating 1450

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Truck Driver Problem

A logistics company needs to deliver goods across several cities within $days$ days.

The $i^\text{th}$ container has a weight of $weights[i]$. Each day, a truck is loaded with containers  **in the given order**. The truck has a maximum load capacity, and it cannot carry more than that in one trip.

Your task is to determine the  **minimum truck capacity**  required so that  **all containers are delivered within $days$ days**.

## Function Declaration
### Function Name

$shipWithinDays$ – This function determines the minimum truck capacity required to deliver all containers within the given number of days.

### Parameters
- $weights$ : An array representing the weights of the containers, in delivery order.
- $days$ : The number of days within which all containers must be delivered.
### Return Value
- Returns a single integer — the minimum truck capacity needed.
## Constraints
- $1 \leq T \leq 100$
- $1 \leq days \leq weights.length \leq 5 × 10^4$
- $1 \leq weights[i] \leq 500$
- Containers must be shipped in order
- Each container must be shipped entirely in one day
### Input Format
- The first line contains the number of test cases T For each test case: The first line contains two integers — $N$ and $days$, where $N$ is the number of containers. The second line contains $N$ space-separated integers representing the container weights.
### Output Format
- Print a single integer — the minimum truck capacity required.
### Sample 1:
Input
Output

```
1
7 4
5 8 3 2 7 4 6

```

```
11
```

### Explanation:
- If the truck capacity is 11: Day 1: 5, 8 $\rightarrow$ cannot take both (sum is 13, which exceeds the capacity of 11), so only 5 goes. Day 2: 8, 3 $\rightarrow$ total 11 Day 3: 2, 7 $\rightarrow$ total 9 Day 4: 4, 6 $\rightarrow$ total 10 Thus, all containers are delivered in 4 days. If the capacity were smaller (like 10), it would require more than 4 days.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T17:04:32.213Z  

```java
class ShipCapacity {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                high = mid; // Try to find a smaller valid capacity
            } else {
                low = mid + 1; // Capacity too small, increase it
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentLoad = 0;

        for (int w : weights) {
            if (currentLoad + w > capacity) {
                daysNeeded++;
                currentLoad = 0;
            }
            currentLoad += w;
        }

        return daysNeeded <= days;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TRUCKDRIVER)