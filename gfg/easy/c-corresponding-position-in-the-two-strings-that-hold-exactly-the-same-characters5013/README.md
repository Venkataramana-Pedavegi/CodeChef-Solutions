# Same Characters and Same Order

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**, find whether the two strings contain the same characters that occur in the same order. For example string  **"Geeks"**  and string  **"Geks"**  contain the same characters in same order.

 **Examples :** 

```
Input: s1 = "Geeks", s2 = "Geks" 
Output: true
Explanation: Both strings follow the same character order: G, e, k, s. The first string has one extra repeated e, but the sequence of characters is still the same.
```

```
Input: s1 = "Arnab", s2 = "Andrew" 
Output: false
Explanation: The character order is not the same in both strings, so the strings do not match.
```

 **Constraints:** 
1 ≤ |s1|, |s2| ≤ 105
s contains only English letters.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:28:33.796Z  

```java
class Solution {
    public boolean sameSeq(String s1, String s2) {
      int i = 0, j = 0;

              while (i < s1.length() && j < s2.length()) {
                  if (s1.charAt(i) != s2.charAt(j)) {
                      return false;
                  }

                  char ch = s1.charAt(i);

                  while (i < s1.length() && s1.charAt(i) == ch) {
                      i++;
                  }

                  while (j < s2.length() && s2.charAt(j) == ch) {
                      j++;
                  }
              }

              return i == s1.length() && j == s2.length();
          
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/c-corresponding-position-in-the-two-strings-that-hold-exactly-the-same-characters5013/1)