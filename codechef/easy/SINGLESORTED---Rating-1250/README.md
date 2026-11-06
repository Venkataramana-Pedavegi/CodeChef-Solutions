# SINGLESORTED - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Lonely Element in Array

You are given a  **sorted array of integers**  $A$ of size $N$. In this array,  **every element occurs exactly twice**, except for  **one element which occurs only once**.

Find and print the element that occurs  **only once**.

Your solution should run in $O(log N)$ time and use $O(1)$ extra memory.

## Function Declaration
### Function Name

$findSingle$ – This function finds the unique element that appears only once in a sorted array.

### Parameters
- $nums$ : A sorted array of integers where every element appears exactly twice except one.
### Return Value
- Returns a single integer — the element that occurs only once.
## Constraints
- $1 \leq N \leq 10^5$
- $0 \leq nums[i] \leq 10^5$
- Array is sorted in non-decreasing order
- Exactly one element appears once; all others appear exactly twice
### Input Format
- The first line contains a single integer $N$ — the size of the array.
- The second line contains $N$ space-separated integers representing the array elements.
### Output Format
- Print a single integer — the element that occurs only once.
### Sample 1:
Input
Output

```
5
2 2 5 7 7

```

```
5
```

### Explanation:

All elements appear twice except `5`, which appears only once.

### Sample 2:
Input
Output

```
11
1 1 3 3 4 4 6 6 8 9 9
```

```
8
```

### Explanation:

The element `8` appears only once, while all others appear exactly twice.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:37:56.238Z  

```java
public static int solve(int[] nums) {
    int low = 0;
    int high = nums.length - 1;

    while (low < high) {
        int mid = low + (high - low) / 2;

        // Ensure mid is even to test the start of a pair
        if (mid % 2 != 0) {
            mid--;
        }

        // Check if the pair is intact
        if (nums[mid] == nums[mid + 1]) {
            // Unique element is in the right half
            low = mid + 2;
        } else {
            // Unique element is at mid or in the left half
            high = mid;
        }
    }

    return nums[low];
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SINGLESORTED)