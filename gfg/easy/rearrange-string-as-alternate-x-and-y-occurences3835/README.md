# Make x times 0's and y times 1's

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary string  **s**  and two integers  **x**  and  **y**. Arrange the given string in such a way so that '0' comes x-times then '1' comes y-times and so on until one of the '0' or '1' is finished. Then concatenate the rest of the string and find the final string.

 **Examples :** 

```
Input: x = 1, y = 1, s = "0011"
Output: "0101"
Explanation: we put 1 '0' and 1 '1' alternatively.

```

```
Input: x = 1, y = 1, s = "1011011"
Output: "0101111"
Explanation: We put '0' and '1' alternatively and in last we have to put all '1' as there is no '0' left.

```

 **Constraints:** 
1 ≤ x, y ≤ 103
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:52:09.350Z  

```java
class Solution {
    public String arrangeString(String s, int x, int y) {
        // code here
        int zeros = 0;
               int ones = 0;

               for (char ch : s.toCharArray()) {
                   if (ch == '0') {
                       zeros++;
                   } else {
                       ones++;
                   }
               }

               StringBuilder result = new StringBuilder();

               while (zeros > 0 || ones > 0) {

                   // Add x zeros
                   for (int i = 0; i < x && zeros > 0; i++) {
                       result.append('0');
                       zeros--;
                   }

                   // Add y ones
                   for (int i = 0; i < y && ones > 0; i++) {
                       result.append('1');
                       ones--;
                   }
               }

               return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rearrange-string-as-alternate-x-and-y-occurences3835/1)