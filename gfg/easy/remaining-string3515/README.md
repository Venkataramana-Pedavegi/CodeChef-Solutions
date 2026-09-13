# Remaining String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  without spaces (both lowercase and uppercase), a character  **ch** and an integer  **count.** Your task is to return the substring that remains after the character  **ch** has appeared  **count** number of times.
 **Note:**  Assume upper case and lower case alphabets are different. “”(**Empty string**) should be returned if it is not possible, or the remaining substring is empty.

 **Examples:** 

```
Input: s = "Thisisdemostring", ch = 'i', count = 3
Output: ng
Explanation: The remaining substring of s after the 3rd
occurrence of 'i' is "ng", hence the output is ng.
```

```
Input: s = "Thisisdemostri", ch = 'i', count = 3
Output: ""
Explanation: The 3rd occurence of 'i' is at the last index. In this case the remaining substring is empty, hence we return empty string.
```

```
Input: s = "abcd", ch = 'x', count = 2
Output: ""
Explanation: The character x is not present in the string, hence we return empty string.
```

 **Constraints:** 
1 ≤ s.length() ≤ 105
1 ≤ count ≤ s.length()

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:50:26.359Z  

```java
class Solution {
    public String printString(String s, char ch, int count) {
        int occurrences = 0;

                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == ch) {
                        occurrences++;

                        if (occurrences == count) {
                            return s.substring(i + 1);
                        }
                    }
                }

                return "";
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/remaining-string3515/1)