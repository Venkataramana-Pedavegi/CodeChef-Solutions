# Kth Boom Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

A Boom number is a positive integer whose decimal representation consists only of the digits  **2**  and  **3**.

Given an integer  **k**, return the kth  **smallest**  Boom number. Since the answer can be very large and may not fit in standard integer data types, return it as a string.

 **Examples:** 

```
Input: k = 5
Output: 32
Explanation: The Boom series is 2, 3, 22, 23, 32, 33, 222.... and, for K=5, answer = 32.
```

```
Input: k = 100
Output: 322323
Explanation: The 100th boom number is 322323.
```

 **Constraints:** 
1 ≤ k ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:56:43.665Z  

```java
class Solution {
    public String boomNumber(int k) {
        // code here
        StringBuilder result = new StringBuilder();

                k = k + 1;

                while (k > 1) {
                    if (k % 2 == 0) {
                        result.append('2');
                    } else {
                        result.append('3');
                    }

                    k = k / 2;
                }

                return result.reverse().toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/kth-boom-number5609/1)