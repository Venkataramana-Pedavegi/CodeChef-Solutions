# Repeated Removal of 3 Consecutive Duplicates

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, repeatedly remove any group of exactly three consecutive identical characters. After each removal, concatenate the remaining parts of the string and continue removing such groups until no more removals are possible. Return the final string after all possible removals. If the resulting string is empty, return  **"-1"**.

 **Examples:** 

```
Input: s = "aabbbaccddddc"
Output: ccdc
Explanation: First remove "aaa" to obtain "bbbaccdddddc". Next remove "bbb" to obtain "accdddddc". Finally, remove "ddd" to obtain "ccddc". No more groups of three consecutive identical characters remain, so the reduced string is "ccddc".
```

```
Input: s = "aaabbbccc"
Output: -1
Explanation: Remove "aaa" to obtain "bbbccc". Next remove "bbb" to obtain "ccc". Finally, remove "ccc" to obtain an empty string. Since no characters remain, return "-1".

```

**Constraints:
**1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:54:28.510Z  

```java
class Solution {
    public String reducedString(String s) {
        // code here
        StringBuilder stack = new StringBuilder();

                for (char ch : s.toCharArray()) {
                    stack.append(ch);

                    int n = stack.length();

                    if (n >= 3 &&
                        stack.charAt(n - 1) == stack.charAt(n - 2) &&
                        stack.charAt(n - 2) == stack.charAt(n - 3)) {

                        stack.delete(n - 3, n);
                    }
                }

                return stack.length() == 0 ? "-1" : stack.toString();
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/three-consecutive-duplicates2434/1)