# BOLI

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Border Lights

Chef has arranged lights in a square grid of size $N \times N$. The brightness of each light is given in a matrix $A$, where $A[i][j]$ represents the brightness at row $i$ and column $j$.

Chef wants to calculate the total brightness of the lights placed on the  **border**  of the board.

However, any border light that lies on either the  **main diagonal**  or the  **secondary diagonal**  must not be included.

The main diagonal contains the cells $(i,i)$, and the secondary diagonal contains the cells $(i,N-i+1)$.

Find the sum of all border elements that do not belong to either diagonal.

### Input Format
- The first line contains an integer $N$ — the size of the square board.
- Each of the next $N$ lines contains $N$ space-separated integers representing a row of the matrix $A$.
### Output Format

Print a single integer — the sum of all border elements that do not lie on the main diagonal or the secondary diagonal.

### Constraints
- $2 \le N \le 100$
- $-10^6 \le A[i][j] \le 10^6$
### Sample 1:
Input
Output

```
5
1 2 3 4 3
4 5 6 7 8
7 8 9 1 2
3 4 5 6 1
2 4 6 8 9
```

```
52
```

### Explanation:

The border elements that do not lie on either diagonal are:

$$ 2,3,4,4,8,7,2,3,4,6,8,1 $$

Their sum is:

$$ 2+3+4+4+8+7+2+3+4+6+8+1=52 $$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:15:53.481Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // Border element
                boolean border = (i == 0 || i == n - 1 ||
                                  j == 0 || j == n - 1);

                // Main or secondary diagonal
                boolean diagonal = (i == j || i + j == n - 1);

                if (border && !diagonal)
                {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BOLI)