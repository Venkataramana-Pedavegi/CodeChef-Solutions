# Smallest Number In One Swap

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a non-negative integer represented as a string  **s**, find the smallest possible number that can be obtained by performing at most one swap of two digits. The output should not contain leading zeros.

 **Examples:** 

```
Input: s = "9625635"
Output: "2695635"
Explanation: Swapped the digits 9 and 2.
```

```
Input: s = "1205763"
Output: "1025763"
Explanation: Swapped the digits 0 and 2.
```

```
Input: s = "123"
Output: "123"
Explanation: No swapping required
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:39:29.069Z  

```java
class Solution {
    public String smallestNumber(String s) {
        // code here
        char[] arr = s.toCharArray();
               int n = arr.length;

               // Store the last position of each digit
               int[] last = new int[10];

               for (int i = 0; i < n; i++) {
                   last[arr[i] - '0'] = i;
               }

               for (int i = 0; i < n; i++) {
                   int current = arr[i] - '0';

                   // Try smaller digits from 0 to current-1
                   for (int d = 0; d < current; d++) {
                       if (last[d] > i) {

                           // Don't create a leading zero
                           if (i == 0 && d == 0) {
                               continue;
                           }

                           int j = last[d];

                           char temp = arr[i];
                           arr[i] = arr[j];
                           arr[j] = temp;

                           return new String(arr);
                       }
                   }
               }

               return s;
               
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/smallest-number-in-one-swap0010/1)