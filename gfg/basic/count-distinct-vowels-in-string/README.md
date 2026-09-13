# Count Distinct Vowels in String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string  **s,**  count the total  **distinct** vowels in the string. The string s contains  **lowercase** letters only.

 **Examples:** 

```
Input: s = geeksforgeeks
Output: 2
Explanation: String "geeksforgeeks" has 2 distinct vowel "e" and "o".
```

```
Input: s = world
Output: 1
Explanation: It has only 1 distinct vowel "o".
```

 **Constraints:** 
1 ≤ |s| ≤ 104

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:24:28.048Z  

```cpp
class Solution {
  public:
    int countVowels(string &s) {
        set<char> vowels;

                for (char ch : s) {
                    if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u') {
                        vowels.insert(ch);
                    }
                }

                return vowels.size();
        
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-distinct-vowels-in-string/1)