# TRICOIN - Rating 1075

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Coins And Triangle

Chef belongs to a very rich family which owns many gold mines. Today, he brought  **N**  gold coins and decided to form a triangle using these coins. Isn't it strange?

Chef has a unusual way of forming a triangle using gold coins, which is described as follows:

- He puts 1 coin in the 1st row.
- then puts 2 coins in the 2nd row.
- then puts 3 coins in the 3rd row.
- and so on as shown in the given figure.

Chef is interested in forming a triangle with maximum possible height using at most  **N**  coins. Can you tell him the maximum possible height of the triangle?

### Input

The first line of input contains a single integer  **T**  denoting the number of test cases.

The first and the only line of each test case contains an integer  **N**  denoting the number of gold coins Chef has.

### Output

For each test case, output a single line containing an integer corresponding to the maximum possible height of the triangle that Chef can get.

### Constraints
- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 109
### Subtasks
- Subtask 1 (48 points) : 1 ≤ N ≤ 105
- Subtask 2 (52 points) : 1 ≤ N ≤ 109
### Sample 1:
Input
Output

```
3
3
5
7
```

```
2
2
3
```

### Explanation:

 **Test 1:**  Chef can't form a triangle with height > 2 as it requires atleast 6 gold coins.  **Test 2:**  Chef can't form a triangle with height > 2 as it requires atleast 6 gold coins.  **Test 3:**  Chef can't form a triangle with height > 3 as it requires atleast 10 gold coins.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-04T14:09:23.744Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(java.lang.String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextLong()) return;
        long t = sc.nextLong();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            
            // Binary search range for the height h
            long low = 1;
            long high = 2000000000L; // Safe upper bound since N <= 10^9
            long ans = 1;
            
            while (low <= high) {
                long mid = low + (high - low) / 2;
                
                // Calculate coins needed for height 'mid' using formula: mid * (mid + 1) / 2
                // Use long to prevent integer overflow during multiplication
                long coinsNeeded = mid * (mid + 1) / 2;
                
                if (coinsNeeded <= n) {
                    ans = mid;         // 'mid' is a valid height, try to find a larger one
                    low = mid + 1;
                } else {
                    high = mid - 1;    // Too many coins required, try a smaller height
                }
            }
            
            System.out.println(ans);
        }
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TRICOIN)