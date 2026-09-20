# MAJORELEM

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the majority element

You are given an array $arr$ containing $n$ integers. Your task is to return the  **majority element**.

A majority element is defined as the element that occurs  **more than $⌊n / 2⌋$ times**. It is guaranteed that such an element always exists.

$⌊n / 2⌋$ => The floor value means if 5 divided by 2 equals 2.5, we’ll choose 2 as the output because of the floor function. 

### Follow-up:

Can you solve this problem in  **O(n)**  time complexity while using only  **O(1) extra space** ?

## Function Declaration
### Function Name

$majorityElement$ – Finds the element that appears more than $⌊n / 2⌋$ times in the array.

### Parameters
- $arr$ : A list/array of integers of size $n$.
### Return Value
- Returns an integer — the majority element that appears more than half the time in the array.
## Constraints:
- $1 \leq T \leq 50,000$
- $n == arr.length$
- $1 \leq n \leq 50,000$
- $-10^9 \leq arr[i] \leq 10^9$
### Input Format
- $T$ → number of test cases
- For each test case: Line 1 → $n$ (array size) Line 2 → n integers representing the array
### Output Format

One value per test case.

### Sample 1:
Input
Output

```
2
6
7 1 7 7 3 7
3
5 5 2

```

```
7
5

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T14:06:59.647Z  

```java
class Solution {
    public int majorityElement(int[] arr) {
        
        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MAJORELEM)