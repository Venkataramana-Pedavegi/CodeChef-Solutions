# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **`s`**, and your task is to reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

 **Constraints:** 
1 <= s.size() <= 106
s contains only alphabetic characters (both uppercase and lowercase).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T16:10:13.920Z  

```java
class Solution {
    public static String reverseString(String s) {
    
        StringBuilder result = new StringBuilder();

                for (int i = s.length() - 1; i >= 0; i--) {
                    result.append(s.charAt(i));
                }

                return result.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)