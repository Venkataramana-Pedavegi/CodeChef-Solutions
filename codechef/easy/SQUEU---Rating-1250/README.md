# SQUEU - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T16:20:55.730Z  

```java
class Solution {
    public int findKthPositive(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int missingBeforeMid = nums[mid] - (mid + 1);

            if (missingBeforeMid < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SQUEU)