# SESO10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Valid Pair

Write a program that reads an integer  **n**  followed by  **n pairs**  of integers. Given two additional integers  **left**  and  **right**, the program should print all pairs whose sum and product fall within the inclusive range  **[left, right]**.

### Input Format
- The first line contains an integer n, representing the number of pairs.
- The next n lines each contain two integers, representing a pair of elements.
- The next line contains two integers left and right, defining the inclusive range for the sum and product of the pairs.
### Output Format
- Print each pair of integers (a, b) on a new line if both the sum and the product of a and b are within the range [left, right].
### Sample 1:
Input
Output

```
3
1 2
2 3
4 5
3 15

```

```
2 3

```

### Explanation:

Evaluating each pair:

Pair (1, 2):

Sum: 1 + 2 = 3 (within range)

Product: 1 * 2 = 2 (not within range)

Pair (2, 3):

Sum: 2 + 3 = 5 (within range)

Product: 2 * 3 = 6 (within range)

Output: 2 3

Pair (4, 5):

Sum: 4 + 5 = 9 (within range)

Product: 4 * 5 = 20 (not within range)

### Sample 2:
Input
Output

```
4
1 1
2 2
3 3
4 4
2 10

```

```
2 2
3 3
```

### Explanation:

Evaluating each pair:

Pair (1, 1):

Sum: 1 + 1 = 2 (within range)

Product: 1 * 1 = 1 (not within range)

Pair (2, 2):

Sum: 2 + 2 = 4 (within range)

Product: 2 * 2 = 4 (within range)

Pair (3, 3):

Sum: 3 + 3 = 6 (within range)

Product: 3 * 3 = 9 (within range)

Pair (4, 4):

Sum: 4 + 4 = 8 (within range)

Product: 4 * 4 = 16 (not within range)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:19:15.579Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        
        int n = scanner.nextInt();
        int[][] pairs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pairs[i][0] = scanner.nextInt();
            pairs[i][1] = scanner.nextInt();
        }
        
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int sum = pairs[i][0] + pairs[i][1];
            int product = pairs[i][0] * pairs[i][1];
            
            if (sum >= left && sum <= right && product >= left && product <= right) {
                System.out.println(pairs[i][0] + " " + pairs[i][1]);
            }
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO10)