# Second Most Frequent Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a sequence of strings  **arr[]**, find and return the second highest frequency (count of occurrences) among all strings in the array.

 **Note:** 

- If all strings have the same frequency, return -1.
- If there is only one unique string in the array, return -1.
- If the array is empty, return -1.

 **Examples:** 

```
Input: arr[] = ["aaa", "bbb", "ccc", "bbb", "aaa", "aaa"]
Output: 2
Explanation: "bbb" is the second most occurring string with frequency 2. So the answer for this test case is 2.

```

```
Input: arr[] = ["aaa", "aaa", "aaa", "aaa", "aaa", "aaa"]
Output: -1
Explanation: There is only one unique string with frequency 6. So answer for this test case is -1.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T16:01:36.517Z  

```java
class Solution {
    public int secFrequent(String[] arr) {
        if (arr == null || arr.length == 0) {
                    return -1;
                }

                HashMap<String, Integer> freq = new HashMap<>();
                for (String str : arr) {
                    freq.put(str, freq.getOrDefault(str, 0) + 1);
                }
                if (freq.size() < 2) {
                    return -1;
                }

                int highest = 0;
                int secondHighest = 0;
                for (int count : freq.values()) {

                    if (count > highest) {
                        secondHighest = highest;
                        highest = count;
                    } 
                    else if (count > secondHighest && count < highest) {
                        secondHighest = count;
                    }
                }
                if (secondHighest == 0) {
                    return -1;
                }

                return secondHighest;
            
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence0534/1)