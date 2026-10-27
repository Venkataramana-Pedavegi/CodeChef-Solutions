# SMALLESTDIVI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### The Divisor Game

In a faraway land, the mathematicians of Numeria discovered a way to control the growth of numbers by choosing a special divisor.

You are given an array $A$ of size $N$, and an integer $T$ called the  **threshold**.

Your task is to choose the  **smallest positive integer divisor**  $D$ such that:

$$ \sum_{i=1}^{N} \left\lceil \frac{A_i}{D} \right\rceil \le T $$

Here, $⌈x⌉$ denotes the  **ceiling function**, i.e., rounding $x$ up to the nearest integer.

## Function Declaration
### Function Name

$findSmallestDivisor$ – This function finds the smallest divisor that satisfies the threshold condition.

### Parameters
- $A$ : A list of positive integers.
- $T$ : An integer representing the threshold value.
### Return Value
- Returns a single integer — the smallest positive divisor $D$ such that the sum of ceilings is less than or equal to $T$.
## Constraints
- $1 ≤ N ≤ 5 × 10^4$
- $1 ≤ A[i] ≤ 10^6$
- $N ≤ T ≤ 10^6$
- It is guaranteed that a valid divisor exists
### Input Format
- The first line contains two space-separated integers $N$ and $T$ — the size of the array and the threshold.
- The second line contains $N$ space-separated integers representing the elements of the array $A$.
### Output Format
- Print a single integer — the smallest divisor $D$ that satisfies the condition.
### Sample 1:
Input
Output

```
3 8
3 7 10

```

```
3
```

### Explanation:

For D = 3 -> ceil(3/3) + ceil(7/3) + ceil(10/3) = 1 + 3 + 4 = 8 -> 8
Smaller divisors give sums > 8, so the smallest valid D is 3.

### Sample 2:
Input
Output

```
6 12
8 16 24 4 2 6

```

```
6
```

### Explanation:

For D = 6 -> ceil(8/6)+ceil(16/6)+ceil(24/6)+ceil(4/6)+ceil(2/6)+ceil(6/6)
= 2 + 3 + 4 + 1 + 1 + 1 = 12 -> 12
Smaller D gives sum > 12, so the smallest valid D is 6.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-27T14:49:02.817Z  

```java
public static int findSmallestDivisor(int[] A, int T) {
    int low = 1;
    int high = 1;
    for (int num : A) {
        if (num > high) {
            high = num;
        }
    }

    int ans = high;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        long sum = 0;
        for (int num : A) {
            sum += (num + mid - 1) / mid;
        }

        if (sum <= T) {
            ans = mid;         // mid is a valid divisor; try finding a smaller one
            high = mid - 1;
        } else {
            low = mid + 1;     // sum is too large; increase the divisor
        }
    }

    return ans;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SMALLESTDIVI)