# Check for 0 Between 1's in Binary String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a binary string  **s**  consisting of '0' and '1', determine whether it is valid such that no '0' appears between two '1's.

Return  **true**  if valid, otherwise return  **false**.

 **Examples:** 

```
Input: s = "100"
Output: true
Explanation: The string contains only one '1', so no `'0' appears between two '1's', hence it is valid.

```

```
Input: s = "1110001"
Output: false
Explanation: The string has '0' occurring between '1's, so it is not valid.

```

 **Constraints:** 
1 ≤ s.size() ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:20:51.399Z  

```java
class Solution {
    public boolean checkBinary(String s) {
        // code here
        boolean seenOne = false;
                boolean seenZero = false;

                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);

                    if (ch == '1') {
                        if (seenOne && seenZero) {
                            return false;
                        }
                        seenOne = true;
                    } else {
                        if (seenOne) {
                            seenZero = true;
                        }
                    }
                }

                return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/check-binary-string0402/1)