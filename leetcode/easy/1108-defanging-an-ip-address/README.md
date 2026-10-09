# Defanging an IP Address

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a valid (IPv4) IP `address`, return a defanged version of that IP address.

A  *defanged IP address*  replaces every period `"."` with `"[.]"`.

 

 **Example 1:** 

```
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

```

 **Example 2:** 

```
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

```

 

 **Constraints:** 

- The given address is a valid IPv4 address.

## Solution

**Language:** Java  
**Runtime:** 4 ms (beats 2.21%)  
**Memory:** 43 MB (beats 10.70%)  
**Submitted:** 2026-10-09T06:23:19.577Z  

```java
class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch=='.'){
                ans=ans+"[.]";
            }else{
                ans=ans+ch;
            }
        }
        return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/defanging-an-ip-address/)