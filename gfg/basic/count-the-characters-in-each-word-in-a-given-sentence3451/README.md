# Word Lengths

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a sentence **s**  consisting of words formed using English letters and separated by a single space, return an array containing the length of each word in the order they appear in the sentence.

 **Examples:** 

```
Input: s = "the quick brown fox"
Output: 3 5 5 3
Explanation: The words are "the", "quick", "brown", and "fox", whose lengths are 3, 5, 5, and 3 respectively.

```

```
Input: s = "geeks for geeks"
Output: 5 3 5
Explanation: The words are "geeks", "for", and "geeks", whose lengths are 5, 3, and 5 respectively.

```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:22:49.035Z  

```cpp
class Solution {
  public:
    vector<int> wordLengths(string &s) {
        // code here
        vector<int> ans;
                int count = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s[i] == ' ') {
                        ans.push_back(count);
                        count = 0;
                    } else {
                        count++;
                    }
                }

                ans.push_back(count);

                return ans;
        
    }
};
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-the-characters-in-each-word-in-a-given-sentence3451/1)