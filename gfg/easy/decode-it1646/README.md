# Kth Character in an Encoded String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an encoded string  **s**  consisting of lowercase English letters and digits from  **1**  to  **9**, where the string always starts with a lowercase letter and ends with a digit, decode it using the following rules:

- Consecutive lowercase letters form the current string.
- Whenever a digit d is encountered, the current string is repeated d times.
- The resulting string becomes the new current string.

Given an integer  **k**, return the character at the kth position (1-based indexing) in the decoded string. It is guaranteed that k is a valid position in the decoded string.

 **Examples:** 

```
Input: s = "jon2snow3", k = 8
Output: n
Explanation: The decoded string is "jonjonsnowjonjonsnowjonjonsnow". The 8th character is 'n'.
```

```
Input: s = "ab2c2", k = 9
Output: b
Explanation: The decoded string is "ababcababc". The 9th character is 'b'.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:30:01.280Z  

```java
class Solution {
    public char decodeIt(String s, long k) {
        // code here
        long len = 0;

               for (char ch : s.toCharArray()) {
                   if (Character.isLetter(ch)) {
                       len++;
                   } else {
                       len *= (ch - '0');
                   }
               }

               for (int i = s.length() - 1; i >= 0; i--) {
                   char ch = s.charAt(i);

                   if (Character.isDigit(ch)) {
                       int d = ch - '0';

                       len /= d;
                       k = (k - 1) % len + 1;
                   } else {
                       if (k == len) {
                           return ch;
                       }

                       len--;
                   }
               }

               return '\0';
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/decode-it1646/1)