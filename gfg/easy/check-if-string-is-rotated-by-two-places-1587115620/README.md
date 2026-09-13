# String Rotated by 2 Places

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1** and  **s2**. Return true if the string  **s2**  can be obtained by rotating (**in any direction**) string  **s1**  by  **exactly 2**  places, otherwise, false.

 **Note:**  Both rotations should be performed in same direction chosen initially.

 **Examples:** 

```
Input: s1 = "amazon", s2 = "azonam"
Output: true
Explanation: "amazon" can be rotated anti-clockwise by two places, which will make it as "azonam".

```

```
Input: s1 = "geeksforgeeks", s2 = "geeksgeeksfor"
Output: false
Explanation: If we rotate "geeksforgeeks" by two place in any direction, we won't get "geeksgeeksfor".

```

```
Input: s1 = "ab", s2 = "ab"
Output: true
Explanation: If we rotate "ab" by two place in any direction, we always get "ab".
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T06:02:43.555Z  

```java
class Solution {
    public static boolean isRotated(String s1, String s2) {
        // code here
        int n = s1.length();

               if (n != s2.length()) {
                   return false;
               }

               if (n <= 2) {
                   return s1.equals(s2);
               }

               // Anti-clockwise by 2
               String left = s1.substring(2) + s1.substring(0, 2);

               // Clockwise by 2
               String right = s1.substring(n - 2) + s1.substring(0, n - 2);

               return s2.equals(left) || s2.equals(right);
           
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1)