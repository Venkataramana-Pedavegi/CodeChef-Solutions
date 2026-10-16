# Maximum Number of Vowels in a Substring of Given Length

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string `s` and an integer `k`, return  *the maximum number of vowel letters in any substring of* `s` *with length* `k`.

 **Vowel letters**  in English are `'a'`, `'e'`, `'i'`, `'o'`, and `'u'`.

 

 **Example 1:** 

```
Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.

```

 **Example 2:** 

```
Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.

```

 **Example 3:** 

```
Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s consists of lowercase English letters.
- 1 <= k <= s.length

## Solution

**Language:** Java  
**Runtime:** 13 ms (beats 73.47%)  
**Memory:** 45.7 MB (beats 99.05%)  
**Submitted:** 2026-10-16T15:47:30.545Z  

```java
class Solution {
    public int maxVowels(String s, int k) {

        int windowLeft = 0;
        int windowVowelsCount = 0;
        int maxVowelsCount = 0;//1

    //    a b c i i i d e f 

    for(int windowRight = 0; windowRight < s.length(); windowRight++)
    {
        char recievedChar = s.charAt(windowRight);

        if(recievedChar == 'a' || recievedChar == 'e' || recievedChar == 'i' 
        || recievedChar == 'o' || recievedChar == 'u'  )
        {
            windowVowelsCount++;
        }
    

   if(windowRight - windowLeft + 1 == k )
   {
       maxVowelsCount = Math.max(windowVowelsCount,maxVowelsCount );

        char left = s.charAt(windowLeft);
        
        if(left == 'a' ||left == 'e' ||left == 'i' ||left == 'o' ||
        left == 'u')
        {
            windowVowelsCount--;
        }

       windowLeft++;

      
   }
    }
    return maxVowelsCount;

        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/)