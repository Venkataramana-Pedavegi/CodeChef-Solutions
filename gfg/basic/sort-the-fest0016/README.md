# Any Common Word in Two Lists

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given two arrays of strings  **s[ ]**  and  **t[ ]**  of sizes  **n**  and  **m** , respectively, determine whether they share at least one common string. Return true if there exists a string that appears in both arrays; otherwise, return false.

 **Examples:** 

```
Input: s[] = ["cake", "pastry", "fish", "candy"], t[] = ["burger", "ham", "fish", "cake", "sauce"]
Output: true
Explanation: The word "fish" is present in both arrays.
```

```
Input: s[] = ["pizza", "chicken", "cake", "chilli", "candy"], t[] = ["choco", "coco"]
Output: false
Explanation: There is no common word in the two arrays.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:17:03.919Z  

```java
class Solution {
    public boolean commonString(String[] s, String[] t) {
        // code here
        HashSet<String> set = new HashSet<>();

               for (String str : s) {
                   set.add(str);
               }

               for (String str : t) {
                   if (set.contains(str)) {
                       return true;
                   }
               }

               return false;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sort-the-fest0016/1)