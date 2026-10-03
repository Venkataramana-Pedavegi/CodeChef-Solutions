# SESO09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Pairs Divisible Sum

Write a program to find and print all pairs of integers from a list of  **n**  pairs where the sum of each pair is divisible by  **k**.

The order of pairs in the output should be the same as the order in which they are provided in the input.

### Input Format
- The first line contains two integers n and k, where n is the number of pairs and k is the divisor.
- The next n lines each contain two integers, representing the pairs.
### Output Format
- Print each pair on a new line whose sum is divisible by k. Each pair should be printed in the format (a, b).
### Sample 1:
Input
Output

```
3 5
1 4
2 5
6 4
```

```
(1, 4)
(6, 4)
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:18:15.282Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            int[][] pairs = new int[n][2];
            
            for (int i = 0; i < n; i++) {
                pairs[i][0] = scanner.nextInt();
                pairs[i][1] = scanner.nextInt();
            }
            
            for (int i = 0; i < n; i++) {
                if ((pairs[i][0] + pairs[i][1]) % k == 0) {
                    System.out.println("(" + pairs[i][0] + ", " + pairs[i][1] + ")");
                }
            }
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO09)