# Intersection of Two Arrays II

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two integer arrays `nums1` and `nums2`, return  *an array of their intersection*. Each element in the result must appear as many times as it shows in both arrays and you may return the result in  **any order**.

 

 **Example 1:** 

```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

```

 **Example 2:** 

```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

```

 

 **Constraints:** 

- 1 <= nums1.length, nums2.length <= 1000
- 0 <= nums1[i], nums2[i] <= 1000

 

 **Follow up:** 

- What if the given array is already sorted? How would you optimize your algorithm?
- What if nums1's size is small compared to nums2's size? Which algorithm is better?
- What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 93.75%)  
**Memory:** 44.8 MB (beats 76.84%)  
**Submitted:** 2026-09-29T16:36:28.749Z  

```java
import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int x : nums1) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (int x : nums2) {
            if (map.getOrDefault(x, 0) > 0) {
                list.add(x);
                map.put(x, map.get(x) - 1);
            }
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/intersection-of-two-arrays-ii/)