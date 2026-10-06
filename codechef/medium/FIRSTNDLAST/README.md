# FIRSTNDLAST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### First and last occurrence of a given number

You are given a sorted array of integers called $arr$ in ascending order. Your task is to find the first and last positions of a given integer $key$.

- If $key$ is not present in the array, return $[-1, -1]$.
- Your solution must have a runtime complexity of O(log n).
## Function Declaration
### Function Name

$searchRange$ – This function finds the first and last occurrence of a given key in a sorted array.

### Parameters
- $arr$ : A reference to a sorted array of integers (may contain duplicates).
- $key$ : The integer value whose first and last positions are to be found.
### Return Value
- Returns a vector of two integers: First occurrence index of $key$ Last occurrence index of $key$
- Returns $[-1, -1]$ if $key$ is not present.
## Constraints
- $0 \leq arr.length \leq 10^5$
- $-10^9 \leq arr[i] \leq 10^9$
- $arr$ is sorted in non-decreasing order
- $-10^9 \leq key \leq 10^9$
### Input Format
- The first line contains an integer $T$ — number of test cases.
- For each test case: One line containing two integers: $n$ and $key$ One line containing $n$ space-separated integers — the sorted array
### Output Format
- For each test case, print two integers: first occurrence index and last occurrence index
### Sample 1:
Input
Output

```
3
7 5
1 3 3 5 5 5 7
5 7
2 4 6 8 10
0 1

```

```
3 5
-1 -1
-1 -1

```

### Explanation:
- For the first test case: 5 can be found at index 3 for the first time and at index 5 for the last time.
- For the second test case: 7 is not present in the array.
- For the third test case: there is no element in the array.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T23:56:43.913Z  

```java
class Solution {
    public int[] searchRange(int[] arr, int key) {
        int first = -1;
        int last = -1;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        low = 0;
        high = arr.length - 1;

        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FIRSTNDLAST)