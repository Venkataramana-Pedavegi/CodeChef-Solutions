# DDMMORMMDD - Rating 935

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:30:58.119Z  

```py
# cook your dish here
# Function to solve each test case
def solve():
    X = int(input())
    S = input()
    
    carlsen_points = 0
    chef_points = 0
    
    # Calculate points for each game
    for char in S:
        if char == 'C':
            carlsen_points += 2
        elif char == 'N':
            chef_points += 2
        else:  # 'D' for draw
            carlsen_points += 1
            chef_points += 1
            
    # Determine prize money based on points
    if carlsen_points > chef_points:
        print(60 * X)
    elif carlsen_points == chef_points:
        print(55 * X)
    else:
        print(40 * X)

# Main function to handle multiple test cases
def main():
    t = int(input())
    for _ in range(t):
        solve()

if __name__ == '__main__':
    main()
```

---

[View on CodeChef](https://www.codechef.com/problems/DDMMORMMDD)