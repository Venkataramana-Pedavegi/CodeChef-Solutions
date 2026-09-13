# Time to Words

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a time in hh:mm 12-hour format, convert it into words. The conversion follows standard time-telling rules:

- At the top of the hour (mm = 0), say the hour followed by o' clock.
- For minutes between 1 and 30, say the number of minutes past the current hour.
- For minutes between 31 and 59, say the number of minutes to the next hour.
- 15 minutes is said as quarter, and 30 minutes is said as half, instead of spelling out the number.

```
6:15 quarter past six
6:30 half past six
6:45 quarter to seven
6:47 thirteen minutes to seven
```

 **Examples:** 

```
Input: h = 6, m = 0
Output: six o' clock
Explanation: 6H:0M is read as "six o' clock".
```

```
Input: h = 6, m = 10
Output: ten minutes past six
Explanation: 6H:10M is read as "ten minutes past six".
```

 **Constraints:** 
0 < h < 12
0 ≤ m < 60

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T12:28:34.203Z  

```java
class Solution {
    public String timeToWords(int h, int m) {
        String[] words = {
                    "", "one", "two", "three", "four", "five",
                    "six", "seven", "eight", "nine", "ten",
                    "eleven", "twelve", "thirteen", "fourteen",
                    "fifteen", "sixteen", "seventeen", "eighteen",
                    "nineteen", "twenty", "twenty one", "twenty two",
                    "twenty three", "twenty four", "twenty five",
                    "twenty six", "twenty seven", "twenty eight",
                    "twenty nine", "thirty"
                };

                if (m == 0) {
                    return words[h] + " o' clock";
                }

                if (m == 15) {
                    return "quarter past " + words[h];
                }

                if (m == 30) {
                    return "half past " + words[h];
                }

                if (m < 30) {
                    return words[m] + " minutes past " + words[h];
                }

                int nextHour = (h == 12) ? 1 : h + 1;
                int remaining = 60 - m;

                if (remaining == 15) {
                    return "quarter to " + words[nextHour];
                }

                return words[remaining] + " minutes to " + words[nextHour];
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/time-to-words3728/1)