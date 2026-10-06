# FLOORCEIL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Floor and ceil in a sorted array

You are given a sorted list of integers `arr` and a target integer `k`. Your task is to determine two values:

- The floor of $k$: The largest number in $arr$ that is less than or equal to $k$.
- The ceiling of $k$: The smallest number in $arr$ that is greater than or equal to $k$.

If either the floor or the ceiling does not exist, return $-1$ for that value.

The solution should be in O(log(N)).

## Function Declaration
### Function Name

$findFloorCeil$ – This function finds the floor and ceiling of a given target value in a sorted array.

### Parameters
- $arr$ : A reference to a sorted array of strictly increasing integers.
- $k$ : The target integer whose floor and ceiling are to be found.
### Return Value
- Returns a pair $(floor, ceil)$: $floor$ – the largest value in $arr$ less than or equal to $k$ $ceil$ – the smallest value in $arr$ greater than or equal to $k$
- Returns $-1$ for floor or ceil if it does not exist.
## Constraints
- $1 \leq T \leq 10$
- $1 \leq arr.length \leq 10^5$
- $0 \leq arr[i], k \leq 10^5$
- $arr$ is sorted in strictly ascending order
### Input Format
- The first line contains an integer $T$ — number of test cases.
- For each test case: One line containing two integers: $n$ and $k$ One line containing $n$ space-separated integers — the sorted array
### Output Format
- For each test case, print two integers: floor value and ceil value separated by a space
### Sample 1:
Input
Output

```
3
6 6
1 3 5 7 9 11
5 10
2 4 6 8 10
4 3
5 10 15 20

```

```
5 7
10 10
-1 5

```

### Explanation:
- In the first test case: Array: [1, 3, 5, 7, 9, 11], target k = 6 Floor of 6 is 5, Ceiling of 6 is 7.
- In the second test case: Array: [2, 4, 6, 8, 10], target k = 10 Floor of 10 is 10, Ceiling of 10 is 10.
- In the third test case: Array: [5, 10, 15, 20], target k = 3 Floor of 3 is -1, Ceiling of 3 is 5.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T23:32:05.610Z  

```java
class Solution {
    public int[] findFloorCeil(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;

        int floor = -1;
        int ceil = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                floor = k;
                ceil = k;
                break;
            } 
            else if (arr[mid] < k) {
                floor = arr[mid];
                low = mid + 1;
            } 
            else {
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FLOORCEIL)