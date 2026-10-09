# Score of a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s`. The  **score**  of a string is defined as the sum of the absolute difference between the  **ASCII**  values of adjacent characters.

Return the  **score**  of `s`.

 

 **Example 1:** 

 **Input:**  s = "hello"

 **Output:**  13

 **Explanation:** 

The  **ASCII**  values of the characters in `s` are: `'h' = 104`, `'e' = 101`, `'l' = 108`, `'o' = 111`. So, the score of `s` would be `|104 - 101| + |101 - 108| + |108 - 108| + |108 - 111| = 3 + 7 + 0 + 3 = 13`.

 **Example 2:** 

 **Input:**  s = "zaz"

 **Output:**  50

 **Explanation:** 

The  **ASCII**  values of the characters in `s` are: `'z' = 122`, `'a' = 97`. So, the score of `s` would be `|122 - 97| + |97 - 122| = 25 + 25 = 50`.

 

 **Constraints:** 

- 2 <= s.length <= 100
- s consists only of lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 97.55%)  
**Memory:** 43 MB (beats 96.69%)  
**Submitted:** 2026-10-09T05:13:40.724Z  

```java
class Solution {
    public int scoreOfString(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            char first=s.charAt(a);
            char second=s.charAt(b);
            int asc1=first;
            int asc2=second;
            int temp=Math.abs(asc1-asc2);
            ans=ans+temp;
        }
        return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/score-of-a-string/)