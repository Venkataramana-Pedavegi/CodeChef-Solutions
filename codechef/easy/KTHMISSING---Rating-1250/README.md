# KTHMISSING - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Kth missing positive

You are given a sorted array $nums$ of distinct positive integers in  **strictly increasing order**  and a number $k$.

Your task is to determine the $k^\text{th}$  **smallest positive integer**  that does  **not appear**  in the array.

## Function Declaration
### Function Name

$findKthPositive$ – This function finds the $k^\text{th}$ missing positive integer from a sorted array.

### Parameters
- $nums$ : A sorted array of distinct positive integers.
- $k$ : An integer representing the position of the missing positive number to find.
### Return Value
- Returns a single integer — the $k^\text{th}$ missing positive number.
## Constraints
- $1 \leq T \leq 100$
- $1 \leq nums.length \leq 1000$
- $1 \leq nums[i] \leq 10000$
- $1 \leq k \leq 10000$
- $nums[i] < nums[j]$ for all $i < j$
- Array is strictly increasing
### Input Format
- The first line contains the number of test case $T$ Each test case contains: The first line contains two integers $N$ and $k$ — the size of the array and the missing index. The second line contains $N$ space-separated integers representing the array $nums$.
### Output Format
- Print a single integer — the $k^\text{th}$ missing positive number.
### Sample 1:
Input
Output

```
2
4 4
3 5 6 10
4 6
1 4 5 8

```

```
7
10

```

### Explanation:

For the first test case the missing positive numbers are: 1,2,4,7,8,9....
4th missing number is `7`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-29T17:05:36.035Z  

```java
class Solution {
    public int findKthPositive(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missing = nums[mid] - (mid + 1);

            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/KTHMISSING)