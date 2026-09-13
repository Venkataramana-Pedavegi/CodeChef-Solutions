# Missing Characters in Panagram

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string s, find the missing characters required to make it a pangram (a sentence containing every letter of the English alphabet at least once).

Return all missing characters in lowercase and in lexicographical order. If the given string is already a pangram, return -1.

 **Examples:** 

```
Input: s = Abcdefghijklmnopqrstuvwxy
Output: z
Explanation: All alphabets except "z" are present in the string.

```

```
Input: s = Abc
Output: defghijklmnopqrstuvwxyz
```

 **Constraints:** 
1 <= |s| <= 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:36:27.821Z  

```java
class Solution {
    public static String missingPanagram(String s) {
        // code here
        boolean[] seen = new boolean[26];

               for (char ch : s.toCharArray()) {
                   if (ch >= 'A' && ch <= 'Z') {
                       ch = Character.toLowerCase(ch);
                   }

                   seen[ch - 'a'] = true;
               }

               StringBuilder ans = new StringBuilder();

               for (int i = 0; i < 26; i++) {
                   if (!seen[i]) {
                       ans.append((char) ('a' + i));
                   }
               }

               if (ans.length() == 0) {
                   return "-1";
               }

               return ans.toString();
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/missing-characters-in-panagram/1)