# LARGODDSTRIN - Rating 992

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:32:43.098Z  

```py
t = int(input())

while t > 0:
    s = input()
    x = int(s[0:2])
    y = int(s[3:5])
    
    if x <= 12 and y <= 12:
        print("BOTH")
    elif y <= 12:
        print("DD/MM/YYYY")
    else:
        print("MM/DD/YYYY")
    t -= 1

```

---

[View on CodeChef](https://www.codechef.com/problems/LARGODDSTRIN)