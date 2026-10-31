# PAINTSHODOWN - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### The Great Painting Showdown

Chef has $A$ painters and $N$ wooden boards placed in a row.
The $i^\text{th}$ board has a length of C[i].

- Each painter takes B units of time to paint 1 unit length of a board.
- A painter can only paint consecutive boards (no skipping allowed).
- A board cannot be divided between two painters.

Chef’s goal is to  **distribute the boards among painters**  so that the  **slowest painter finishes as early as possible**.

You need to determine the  **minimum time**  in which all boards can be painted. Since the answer can be very large, output it modulo `10000003`.

## Function Declaration
### Function Name

$minTime$ – This function calculates the minimum time required to paint all boards when painters work under given constraints.

### Parameters
- $A$ : The number of painters available.
- $B$ : The time taken by a painter to paint one unit length of a board.
- $C$ : A vector of integers where C[i] represents the length of the i-th board.
### Return Value
- Returns a number representing the minimum time required to paint all boards.
- Since the result can be very large, the returned value should be taken modulo 10000003.
## Constraints
- $1 \le A \le 1000$
- $1 \le B \le 10^6$
- $1 \le N \le 10^5$ where $N = |C|$
- $1 \le C[i] \le 10^6$
- Each painter can paint only consecutive boards
- A board cannot be divided between painters
### Input Format
- The first line contains three integers: $A$ → number of painters, $B$ → time taken to paint one unit length, $N$ → number of boards.
- The second line contains $N$ integers, where the i-th integer denotes the length of the i-th board.
### Output Format

Print a single integer — the minimum time required to finish painting all the boards, modulo $10000003$.

### Sample 1:
Input
Output

```
2 3 4
10 10 10 10

```

```
60

```

### Explanation:

Painter 1 -> [10, 10] -> 20 units -> 60 time
Painter 2 -> [10, 10] -> 20 units -> 60 time
Maximum = 60 -> answer = 60

### Sample 2:
Input
Output

```
4 1 6
5 2 4 6 1 3

```

```
6
```

### Explanation:

Boards can be split as:

- Painter 1 -> [5]
- Painter 2 -> [2, 4] -> 6
- Painter 3 -> [6]
- Painter 4 -> [1, 3] -> 4 Maximum = 6

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T14:01:58.141Z  

```java
static long minTime(int A, int B, long[] C) {
    long mod = 10000003L;
    long low = 0;
    long high = 0;

    for (long len : C) {
        low = Math.max(low, len);
        high += len;
    }

    long minMaxLen = high;

    while (low <= high) {
        long mid = low + (high - low) / 2;

        if (canPaint(C, A, mid)) {
            minMaxLen = mid;
            high = mid - 1; // Try for a smaller maximum workload
        } else {
            low = mid + 1;  // Need higher capacity per painter
        }
    }

    return ((minMaxLen % mod) * (B % mod)) % mod;
}

private static boolean canPaint(long[] C, int maxPainters, long maxCapacity) {
    int paintersUsed = 1;
    long currentLoad = 0;

    for (long len : C) {
        if (currentLoad + len <= maxCapacity) {
            currentLoad += len;
        } else {
            paintersUsed++;
            currentLoad = len;

            if (paintersUsed > maxPainters) {
                return false;
            }
        }
    }

    return true;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PAINTSHODOWN)