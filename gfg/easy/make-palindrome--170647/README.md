# Make Palindrome

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array of strings arr[] of size n, where every string has the same length. Find if it is possible to rearrange the strings and concatenate them to form a palindrome.

 **Examples :** 

```
Input: arr = ["jfh", "adt", "hfj", "tda"]
Output: true
Explanation: Make the string "jfhadttdahfj", by concatenating the given strings which is a palindrome.

```

```
Input: arr = ["jhjdf", "sftas", "fgsdf"]
Output: false
Explanation: No permutation of the given strings results in a palindromic string after concatenation.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:43:00.437Z  

```java
class Solution {
    public static boolean makePalindrome(String[] arr) {
        // code here
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        int middle = 0;

        for (String str : map.keySet()) {
            String rev = new StringBuilder(str).reverse().toString();

            if (str.equals(rev)) {
                if (map.get(str) % 2 != 0) {
                    middle++;
                }
            } else {
                if (!map.containsKey(rev) ||
                    !map.get(str).equals(map.get(rev))) {
                    return false;
                }
            }
        }

        return middle <= 1;

    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/make-palindrome--170647/1)