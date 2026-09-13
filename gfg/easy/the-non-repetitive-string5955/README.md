# Non-Repetitive String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string **s**  consisting of uppercase English letters, determine whether it is a non-repetitive string. A string is called non-repetitive if every occurrence of the same character appears in a single contiguous block.

 **Examples:** 

```
Input: s = "AABBCCCCC"
Output: true
Explanation: Each character appears in a single contiguous block.

```

```
Input: s = "ABA"
Output: false
Explanation: The character 'A' appears again after a different character.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:27:47.966Z  

```java
class Solution {
    public boolean nonRepetitive(String s) {
        // code here
        boolean[] seen = new boolean[26];

               for (int i = 0; i < s.length(); i++) {
                   char ch = s.charAt(i);

                   if (i > 0 && ch != s.charAt(i - 1)) {
                       if (seen[ch - 'A']) {
                           return false;
                       }
                   }

                   seen[ch - 'A'] = true;
               }

               return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/the-non-repetitive-string5955/1)