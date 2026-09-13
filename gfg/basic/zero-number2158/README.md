# Duck Number

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

A  **Duck**  number is a positive number which has zeroes present in it, For example, 3210, 8050896, 70709 are all Duck numbers. A number with only leading 0s is not considered as Duck Number. For example, numbers like 035 or 0012 are not considered as Duck Numbers.
The task is to check whether the given number  **num**  is a  **Duck**  number or not.

 **Examples:** 

```
Input: num = 707069
Output: YES
Explanation: 707069 contains a non-leading 0.
```

```
Input: num = 02364
Output: NO
Explanation: Contains leading 0.
```

 **Constraints :** 
1 ≤ Length of num ≤ 104

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:34:29.058Z  

```java
class Solution {
    static boolean check_duck(String num) {
        int i = 0;

               while (i < num.length() && num.charAt(i) == '0') {
                   i++;
               }

               while (i < num.length()) {
                   if (num.charAt(i) == '0') {
                       return true;
                   }
                   i++;
               }

               return false;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/zero-number2158/1)