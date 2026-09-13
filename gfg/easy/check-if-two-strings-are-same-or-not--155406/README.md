# Check if two strings are same or not

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two strings  **s1**  and  **s2**, determine if they are  **exactly**  the same, considering case sensitivity.

 **Examples:** 

```
Input: s1 = "abc", s2 = "abc" 
Output: true
```

```
Input: s1 = " ", s2 = " "
Output: true
```

```
Input: s1 = "geeks", s2 = "Geeks"
Output: false
```

 **Constraints:** 
1 ≤ |s1|, |s2| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:17:30.762Z  

```java
class Solution {
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        return s1.equals(s2);

        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-if-two-strings-are-same-or-not--155406/1)