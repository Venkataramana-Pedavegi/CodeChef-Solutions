# BSEX06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Garden

You are managing a garden with an $N$ X $N$ grid of flower pots. Each row and column of the grid is arranged in ascending order of flower heights. Your task is to find the $k$-th smallest flower height in the entire garden when all the heights are arranged in sorted order.

Note that the $k$-th smallest flower height refers to its position in the sorted order, not its uniqueness. Write a solution without taking any extra space.

### Input Format
- The first line contains two space separated integers $N$ and $k$, representing the size of the garden and the value of $k$.
- The next $N$ lines each contain $N$ space-separated integers, where each integer represents the height of the flower at that position in the garden grid.
### Output Format
- A single integer representing the $k$-th smallest flower height in the garden.
### Constraints
- $1 \leq N \leq 400$
- $1 \leq \text{flowers}[i][j] \leq 10^5$
### Sample 1:
Input
Output

```
3 8
1 5 9
10 11 13
12 13 15

```

```
13
```

### Explanation:
- The flower heights in the garden are: [1, 5, 9, 10, 11, 12, 13, 13, 15].
- The 8th smallest flower height is 13.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-13T17:44:59.219Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = sc.nextInt();
        int[][] garden = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                garden[i][j] = sc.nextInt();
            }
        }
        
        System.out.println(kthSmallest(garden, k));
        sc.close();
    }

    // Binary search on value range
    static int kthSmallest(int[][] matrix, int k) {
        int N = matrix.length;
        int low = matrix[0][0];
        int high = matrix[N-1][N-1];
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countLessEqual(matrix, mid);
            
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Count how many numbers are <= mid
    static int countLessEqual(int[][] matrix, int mid) {
        int N = matrix.length;
        int count = 0;
        int row = N - 1, col = 0;
        
        while (row >= 0 && col < N) {
            if (matrix[row][col] <= mid) {
                count += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return count;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX06)