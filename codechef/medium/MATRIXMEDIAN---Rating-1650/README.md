# MATRIXMEDIAN - Rating 1650

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Kth Element of Two Sorted Arrays

Chef is given two sorted arrays  **$A$**  and  **$B$**  of sizes  **$M$**  and  **$N$**. Chef wants to know the  **$K$th element**  in the array obtained after merging  **$A$**  and  **$B$**  into a single sorted array.

Chef does  **not**  want to build the merged array explicitly. He only needs the value of the  **$K$th element**  in the merged sorted order.

Your task is to help Chef find this element.

### Function Declaration
- Function Name: $findKthElement$
- Parameters: $a$ A sorted array of size $M$ in non-decreasing order. $b$ A sorted array of size $N$ in non-decreasing order. $k$ The 1-based position of the element to be found in the merged sorted order.
- Return Value: Returns a number representing the $K$th element in the merged sorted array.
## Constraints
- $1 \le M, N \le 10^4$
- $0 \le a[i], b[i] \le 10^9$
- $1 \le K \le M + N$
- Both arrays are sorted in non-decreasing order.
### Input Format
- The first line contains two space-separated integers $M$ and $N$.
- The second line contains $M$ space-separated integers representing array $A$.
- The third line contains $N$ space-separated integers representing array $B$.
- The fourth line contains an integer $K$.
### Output Format
- Print a single integer — the Kth element of the merged sorted array.
### Sample 1:
Input
Output

```
3 5
5 10 15
2 6 12 20 25
4

```

```
10

```

### Explanation:

Merged array = `[2, 5, 6, 10, 12, 15, 20, 25]`. The 4th element is `10`.

### Sample 2:
Input
Output

```
4 3
1 3 5 7
2 4 6
5

```

```
5
```

### Explanation:

Merged array = `[1, 2, 3, 4, 5, 6, 7]`. The 5th element is `5`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-31T14:03:07.754Z  

```java
static class Solution {
    public long kthElement(int[] a, int[] b, int k) {
        int m = a.length;
        int n = b.length;

        // Ensure binary search is performed on the smaller array for O(log(min(M, N)))
        if (m > n) {
            return kthElement(b, a, k);
        }

        // low: minimum elements we can take from array `a`
        // high: maximum elements we can take from array `a`
        int low = Math.max(0, k - n);
        int high = Math.min(k, m);

        while (low <= high) {
            int cutA = low + (high - low) / 2;
            int cutB = k - cutA;

            long leftA = (cutA == 0) ? Long.MIN_VALUE : a[cutA - 1];
            long leftB = (cutB == 0) ? Long.MIN_VALUE : b[cutB - 1];

            long rightA = (cutA == m) ? Long.MAX_VALUE : a[cutA];
            long rightB = (cutB == n) ? Long.MAX_VALUE : b[cutB];

            if (leftA <= rightB && leftB <= rightA) {
                return Math.max(leftA, leftB);
            } else if (leftA > rightB) {
                high = cutA - 1;
            } else {
                low = cutA + 1;
            }
        }

        return -1;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MATRIXMEDIAN)