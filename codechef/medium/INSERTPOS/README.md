# INSERTPOS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the insert position

You are given a  **sorted array of unique integers**  and a  **target number**. Your task is to return the index of the target if it exists in the array. If the target is not present, return the index where it should be inserted so that the array remains sorted.

Your solution must run in  **O(log n)**  time complexity.

## Function Declaration
### Function Name

$searchInsertPosition$ – This function returns the index of a target element in a sorted array. If the element is not present, it returns the position where it should be inserted to maintain sorted order.

### Parameters
- $arr$ : A reference to a sorted array of unique integers.
- $target$ : The integer value to be searched or inserted.
### Return Value
- Returns the index of $target$ if it exists.
- Returns the index where $target$ should be inserted if it does not exist.
## Constraints
- $1 \leq T \leq 10$
- $1 \leq n \leq 10^4$
- $-10^4 \leq arr[i] \leq 10^4$
- Elements in $arr$ are unique and sorted in non-decreasing order
- $-10^4 \leq target \leq 10^4$
### Input Format
- The first line contains an integer $T$ — number of test cases.
- For each test case: One line containing two integers: $n$ and $target$ One line containing $n$ space-separated integers — the sorted array
### Output Format
- For each test case, print a single integer — the insert position.
### Sample 1:
Input
Output

```
3
4 8
2 4 8 10
4 5
2 4 8 10
4 12
2 4 8 10

```

```
2
2
4
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T14:07:19.702Z  

```java
class Solution {
    public int searchInsertPosition(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (arr[mid] < target) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return low;
    }   
}
```

---

[View on CodeChef](https://www.codechef.com/problems/INSERTPOS)