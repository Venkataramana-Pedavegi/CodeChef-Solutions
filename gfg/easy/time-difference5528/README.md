# Time Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the start time  **st**  and end time  **et**  of a race in the format  **hh:mm:ss**. Return the time taken to complete the race.

 **Examples:** 

```
Input: st = "13:50:45", et = "14:55:50"
Output: "01:05:05"
Explanation: The time gap is 1 hour 5 minutes and 5 seconds.
```

```
Input: st = "12:00:00", et = "24:00:00"
Output: "12:00:00"
Explanation: The time gap is of 12 hours.
```

 **Constraints:** 
0 ≤ hh ≤ 24
0 ≤ mm ≤ 59
0 ≤ ss ≤ 59
|st| = |et| = 8

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:59:01.590Z  

```java
class Solution {
    public String timeGap(String st, String et) {
        // code here
        String[] start = st.split(":");
                String[] end = et.split(":");

                int startSeconds = Integer.parseInt(start[0]) * 3600
                                 + Integer.parseInt(start[1]) * 60
                                 + Integer.parseInt(start[2]);

                int endSeconds = Integer.parseInt(end[0]) * 3600
                               + Integer.parseInt(end[1]) * 60
                               + Integer.parseInt(end[2]);

                int diff = endSeconds - startSeconds;

                int hours = diff / 3600;
                diff %= 3600;

                int minutes = diff / 60;
                int seconds = diff % 60;

                return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/time-difference5528/1)