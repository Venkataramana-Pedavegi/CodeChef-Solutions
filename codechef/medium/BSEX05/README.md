# BSEX05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Peak Element

A  **peak element**  in an array is an element that is  **strictly greater**  than its adjacent elements.

You are provided with a  **0-based index integer array**  $nums$ of size $N$. Your task is to identify the index of  **any one peak element**  in the array and return it. If multiple peak elements exist, returning the index of any one of them is acceptable.

For simplicity, assume that the elements just outside the boundaries of the array are considered to be negative infinity. That is:

- $arr[-1] = -∞$
- $arr[arr.length] = -∞$

Your solution  **must have a time complexity of O(log N).** 

## Function Declaration
### Function Name

$findPeakElement$ – This function finds the index of a peak element in the array.

### Parameters
- $nums$ : A 0-based indexed array of integers where adjacent elements are not equal.
### Return Value
- Returns a single integer — the index of any peak element.
## Constraints
- $1 \leq T \leq 1000$
- $1 \leq N \leq 1000$
- $−2^\text{31} \leq nums[i] \leq 2^\text{31} − 1$
- $nums[i] ≠ nums[i + 1]$ for all valid indices $i$
- Time complexity must be O(log n)
### Input Format
- The first line contains the number of test cases $T$ Each test case contains: The first line contains a single integer $N$ — the size of the array. The second line contains $N$ space-separated integers representing the array elements.
### Output Format
- Print a single integer — the index of a peak element.
### Sample 1:
Input
Output

```
2
5
5 10 7 3 8
5
2 4 3 6 1

```

```
1
3

```

### Explanation:
- In the first test case element 10 at index 1 is a peak because 10 > 5 and 10 > 7.
- In the second test case element 6 at index 3 is a peak as 6 > 3 and 6 > 1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:37:45.418Z  

```java
class Solution {
    public int findPeakElement(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // Increasing slope → peak is on the right
                low = mid + 1;
            } 
            else {
                // Decreasing slope → peak is at mid or on the left
                high = mid;
            }
        }

        return low;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX05)