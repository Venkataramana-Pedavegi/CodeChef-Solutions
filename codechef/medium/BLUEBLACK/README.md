# BLUEBLACK

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Blue and Black Pens

Chef is particular about the colour of the pens he uses to write in any exam.

He needs either:

- $3$ blue pens, or
- $1$ blue pen and $1$ black pen.

One blue pen costs $A$ rupees, and one black pen costs $B$ rupees. Find the minimum cost Chef has to pay.

### Input Format
- The first and only line contains $2$ integers - $A$ and $B$.
### Output Format

Output the minimum cost Chef has to pay to buy pens satisfying his requirement.

### Constraints
- $10 \le A, B \le 50$
### Sample 1:
Input
Output

```
10 10

```

```
20
```

### Explanation:

Chef can buy one blue and one black pen for a cost of $20$.

### Sample 2:
Input
Output

```
10 50

```

```
30

```

### Explanation:

Chef can buy $3$ blue pens for a cost of $30$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T15:04:46.954Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt(); // cost of blue pen
        int B = sc.nextInt(); // cost of black pen
        
        // Option 1: 3 blue pens
        int option1 = 3 * A;
        
        // Option 2: 1 blue + 1 black
        int option2 = A + B;
        
        // Minimum cost
        int result = Math.min(option1, option2);
        
        System.out.println(result);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BLUEBLACK)