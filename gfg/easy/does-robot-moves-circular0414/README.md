# Does Robot Move Circular

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** representing a sequence of robot moves, determine whether the robot follows a  **circular**  path. A path is considered circular if the robot ends at the same position from which it started.

The possible moves are:

- 'G' - Move one unit forward.
- 'L' - Turn left.
- 'R' - Turn right.

 **Examples:** 

```
Input: s = "GLGLGLG"
Output: true
Explanation: If we start form (0,0) in a plane then we will back to (0,0) by the end of the sequence.

```

```
Input: s = "GGGGL"
Output: false
Explanation: We can't return to same place at the end of the path.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:20:27.948Z  

```java
class Solution {
    public boolean isCircular(String s) {
        // code here
        int x = 0, y = 0;
                int dir = 0;

                for (char ch : s.toCharArray()) {
                    if (ch == 'G') {
                        if (dir == 0) y++;
                        else if (dir == 1) x++;
                        else if (dir == 2) y--;
                        else x--;
                    } 
                    else if (ch == 'L') {
                        dir = (dir + 3) % 4;
                    } 
                    else if (ch == 'R') {
                        dir = (dir + 1) % 4;
                    }
                }

                return x == 0 && y == 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/does-robot-moves-circular0414/1)