# Convert CamelCase to Sentence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  containing multiple words concatenated together, where each new word starts with an uppercase letter, insert spaces between the words and convert all characters to lowercase.

 **Examples:** 

```
Input: s = "geeksForGeeks"
Output: "geeks for geeks"
Explanation: The words in the string are "geeks", "For", "Geeks". After inserting spaces before each word and converting all characters to lowercase, the resulting sentence is "geeks for geeks".
```

```
Input: s = "You"
Output: "you"
Explanation: The only word in the string is "You". After inserting spaces before each word and converting all characters to lowercase, the resulting sentence is "you".

```

 **Constraints:** 
1 ≤ s.size() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:22:58.978Z  

```java
class Solution {
    public String amendSentence(String s) {
        StringBuilder result = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (Character.isUpperCase(ch)) {
                        if (i != 0) {
                            result.append(' ');
                        }
                        result.append(Character.toLowerCase(ch));
                    } else {
                        result.append(ch);
                    }
                }

                return result.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/amend-the-sentence3235/1)