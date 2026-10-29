# SPLITARRAY - Rating 1850

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Split Array with Minimum Largest Sum

You are given an array of integers $nums$ of size $N$ and an integer $K$. Your task is to split the array into  **exactly K non-empty contiguous subarrays**  such that the  **largest sum**  among these subarrays is minimized.

Return the minimized largest sum.

## Function Declaration
### Function Name

$splitArray$ – This function splits an array into $K$ contiguous subarrays and minimizes the maximum subarray sum.

### Parameters
- $nums$ : An array of non-negative integers
- $K$ : The number of non-empty contiguous subarrays to split the array into
### Return Value

Returns a single integer — the  **minimum possible value of the largest subarray sum**  after splitting

## Constraints
- $1 \leq N \leq 1000$
- $0 \leq nums[i] \leq 10^6$
- $1 \leq K \leq min(50, N)$
- The array must be split into exactly K subarrays
- Each subarray must be non-empty

 *The input and output formats provided below are only for testing with custom inputs. You only need to complete the core logic function.* 

### Input Format
- The first line contains two integers $N$ and $K$ — the size of the array and the number of subarrays
- The second line contains $N$ space-separated integers $nums[0], nums[1],..., nums[N-1]$ — the elements of the array
### Output Format

Print a single integer: the  **minimum possible value of the largest sum**  among the $K$ subarrays

### Sample 1:
Input
Output

```
6 3
1 4 4 2 6 3
```

```
9

```

### Explanation:

One possible split: `[1,4,4]`, `[2,6]`, `[3]`.
The sums are `9`, `8`, `3`. The maximum sum is `9`, which is the minimized largest sum.

### Sample 2:
Input
Output

```
8 4
2 3 5 7 1 4 2 6
```

```
10
```

### Explanation:

One possible split: `[2,3,5]`, `[7]`, `[1,4,2]`, `[6]`.
The sums are `10`, `7`, `7`, `6`. The maximum sum is `10`, which is the minimized largest sum.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T17:06:29.171Z  

```java
class Solution {
    public long splitArray(int[] nums, int K) {
        long low = 0;
        long high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canSplit(nums, K, mid)) {
                ans = mid;
                high = mid - 1; // Try to minimize the maximum sum
            } else {
                low = mid + 1;  // Allowed sum is too small, increase it
            }
        }

        return ans;
    }

    private boolean canSplit(int[] nums, int K, long maxSum) {
        int count = 1;
        long currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSum) {
                count++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return count <= K;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SPLITARRAY)