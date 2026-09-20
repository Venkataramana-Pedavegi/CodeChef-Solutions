# Reverse Only Letters

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string `s`, reverse the string according to the following rules:

- All the characters that are not English letters remain in the same position.
- All the English letters (lowercase or uppercase) should be reversed.

Return `s` *after reversing it*.

 

 **Example 1:** 

```
Input: s = "ab-cd"
Output: "dc-ba"

```

 **Example 2:** 

```
Input: s = "a-bC-dEf-ghIj"
Output: "j-Ih-gfE-dCba"

```

 **Example 3:** 

```
Input: s = "Test1ng-Leet=code-Q!"
Output: "Qedo1ct-eeLg=ntse-T!"

```

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists of characters with ASCII values in the range [33, 122].
- s does not contain '\"' or '\\'.

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 42.6 MB (beats 90.82%)  
**Submitted:** 2026-09-20T13:56:48.906Z  

```java
class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            while (left < right &&
                   !((arr[left] >= 'A' && arr[left] <= 'Z') ||
                     (arr[left] >= 'a' && arr[left] <= 'z'))) {
                left++;
            }

            while (left < right &&
                   !((arr[right] >= 'A' && arr[right] <= 'Z') ||
                     (arr[right] >= 'a' && arr[right] <= 'z'))) {
                right--;
            }

            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-only-letters/)