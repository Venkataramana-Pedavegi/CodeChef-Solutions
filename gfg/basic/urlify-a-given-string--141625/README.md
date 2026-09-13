# URLify a given string

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, replace all the spaces in the string with '%20'.

 **Examples:** 

```
Input: s = "i love programming"
Output: "i%20love%20programming"
Explanation: The 2 spaces are replaced by '%20'

```

```
Input: s = "Mr Benedict Cumberbatch"
Output: "Mr%20Benedict%20Cumberbatch"
Explanation: The 2 spaces are replaced by '%20'
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T06:22:06.550Z  

```java
class Solution {
    static String URLify(String s) {
        // code here
       StringBuilder ans = new StringBuilder();

              for (int i = 0; i < s.length(); i++) {
                  char ch = s.charAt(i);

                  if (ch == ' ') {
                      ans.append("%20");
                  } else {
                      ans.append(ch);
                  }
              }

              return ans.toString(); 
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/urlify-a-given-string--141625/1)