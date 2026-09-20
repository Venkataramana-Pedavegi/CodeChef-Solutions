# SORTARRAYS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Color Sorting Challenge

Chef has an array $nums$ of `N` balls, where each ball is painted  **red**,  **white**, or  **blue**. The balls are represented by integers:

- 0 → Red
- 1 → White
- 2 → Blue Chef wants to arrange the balls so that balls of the same color are together in the order: Red, White, then Blue.

Help Chef sort the array  **in-place**, without using any built-in sorting functions.

## Function Declaration
### Function Name

$sortColors$ – This function rearranges an array of balls painted Red $0$, White $1$, or Blue $2$ so that all balls of the same colour are grouped together in the order  **Red → White → Blue**.

### Parameters
- $N$ : The number of balls in the array.
- $nums$ : A reference to an array of $N$ integers, where each integer represents the color of a ball.
### Return Value
- The function does not return anything.
- It modifies the array in-place, rearranging the balls so that: All $0$s appear first Followed by all $1$s Followed by all $2$s
## Constraints
- $1 \leq T \leq 10$
- $1 \leq N \leq 300$
- $nums[i] \in {0, 1, 2}$
### Input Format
- The first line contains a single integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $N$ — the number of balls. The next line contains $N$ space-separated integers representing the ball colors.
### Output Format
- For each test case, print the sorted array on a new line, where all $0$s come first, followed by all $1$s, then all $2$s.
### Sample 1:
Input
Output

```
7
0 2 1 2 0 1 0
```

```
0 0 0 1 1 2 2
```

### Explanation:

All red (0) balls come first, followed by white (1), then blue (2).

### Sample 2:
Input
Output

```
5
1 1 2 0 2

```

```
0 1 1 2 2
```

### Explanation:

Array is rearranged so that `0`’s come first, followed by 1’s, then 2’s.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T14:12:46.175Z  

```java
public static void sortColors(int[] nums) {

    int low = 0;
    int mid = 0;
    int high = nums.length - 1;

    while (mid <= high) {

        if (nums[mid] == 0) {

            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;

            low++;
            mid++;
        }

        else if (nums[mid] == 1) {
            mid++;
        }

        else { // nums[mid] == 2

            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;

            high--;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SORTARRAYS)