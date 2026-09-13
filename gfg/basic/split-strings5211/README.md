# Segregate Different Types of Characters

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**  containing letters, digits, and special characters, return an array of three strings [s1, s2, s3] such that:  **s1**  contains all the letters,  **s2**  contains all the digits, and  **s3**  contains all the special characters.

- The relative order of the characters in each string must be exactly as they appear in s.
- If any type of character is not present, then return "-1" in the corresponding string.

 **Examples:** 

```
Input: s = "geeks01for02geeks03!!!"
Output: ["geeksforgeeks", "010203", "!!!"]
Explanation: s1 contains all the letters ("geeksforgeeks"), s2 contains all the digits ("010203"), and s3 contains the remaining special characters ("!!!") 
```

```
Input: s = "**Docoding123456789everyday##"
Output: ["Docodingeveryday", "123456789", "**##"]
Explanation: s1 contains all the letters ("Docodingeveryday"), s2 contains all the digits ("123456789"), and s3 contains all the special characters ("**##") 
```

```
Input: s = "ab##c"
Output: ["abc", "-1", "##"]
```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:38:47.837Z  

```java
class Solution {
    public String[] splitString(String s) {
        // code here
        StringBuilder letters = new StringBuilder();
               StringBuilder digits = new StringBuilder();
               StringBuilder special = new StringBuilder();

               for (int i = 0; i < s.length(); i++) {
                   char ch = s.charAt(i);

                   if (Character.isLetter(ch)) {
                       letters.append(ch);
                   } else if (Character.isDigit(ch)) {
                       digits.append(ch);
                   } else {
                       special.append(ch);
                   }
               }

               String s1 = letters.length() == 0 ? "-1" : letters.toString();
               String s2 = digits.length() == 0 ? "-1" : digits.toString();
               String s3 = special.length() == 0 ? "-1" : special.toString();

               return new String[]{s1, s2, s3};
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/split-strings5211/1)