# Alternate Lowercase and Uppercase

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s**, convert it into an alternating sequence of  **lowercase**  and  **uppercase**  characters while keeping the character at index  **0**  unchanged.

Return the modified string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: gEeKsFoRgEeKs
Explanation: The first character is lowercase, so characters at even indices remain lowercase and characters at odd indices are converted to uppercase.
```

```
Input: s = "Geeksforgeeks"
Output: GeEkSfOrGeEkS
Explanation: The first character is uppercase, so characters at even indices remain uppercase and characters at odd indices are converted to lowercase.
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T14:07:00.481Z  

```cpp
class Solution {
  public:
    string altCase(string& s) {
        bool firstLower = (s[0] >= 'a' && s[0] <= 'z');

                for (int i = 0; i < s.length(); i++) {
                    if (firstLower) {
                        if (i % 2 == 0)
                            s[i] = tolower(s[i]);
                        else
                            s[i] = toupper(s[i]);
                    } else {
                        if (i % 2 == 0)
                            s[i] = toupper(s[i]);
                        else
                            s[i] = tolower(s[i]);
                    }
                }

                return s;
        
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/crazy-string1157/1)