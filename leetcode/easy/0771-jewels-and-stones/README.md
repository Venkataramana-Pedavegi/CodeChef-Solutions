# Jewels and Stones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You're given strings `jewels` representing the types of stones that are jewels, and `stones` representing the stones you have. Each character in `stones` is a type of stone you have. You want to know how many of the stones you have are also jewels.

Letters are case sensitive, so `"a"` is considered a different type of stone from `"A"`.

 

 **Example 1:** 

```
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3

```

 **Example 2:** 

```
Input: jewels = "z", stones = "ZZ"
Output: 0

```

 

 **Constraints:** 

- 1 <= jewels.length, stones.length <= 50
- jewels and stones consist of only English letters.
- All the characters of jewels are unique.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43 MB (beats 82.22%)  
**Submitted:** 2026-10-09T07:40:25.904Z  

```java
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            boolean found=false;
            for(int j=0;j<jewels.length();j++){
                char ch1=jewels.charAt(j);
                if(ch==ch1){
                     found=true;
                    break;
                }
            }
            if(found== true){
                ans =ans+1;
            }
        }
        return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/jewels-and-stones/)