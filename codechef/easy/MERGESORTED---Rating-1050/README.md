# MERGESORTED - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Merge two sorted arrays

You are given two sorted arrays $A$ and $B$ of size $N$ and $M$ respectively. You need to merge these two arrays and keep the final array sorted.

### Input Format
- The first line contains two integers $N$ and $M$ — the size of array $A$ and $B$
- The second line contains all the elements of array $A$
- The third line contains all the elements of array $B$
### Output Format

Output the merged array elements on a single line.

### Constraints
- $1 \leq N, M \leq 10^5$
- $1 \leq A_i, B_i \leq 10^5$
### Sample 1:
Input
Output

```
5 4
1 4 8 9 10
2 3 5 6
```

```
1 2 3 4 5 6 8 9 10
```

### Sample 2:
Input
Output

```
1 2
10
1 2
```

```
1 2 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-19T16:14:59.758Z  

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
        int m = sc.nextInt();

        int[] A = new int[n];
        int[] B = new int[m];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int i = 0;
        int j = 0;

        StringBuilder result = new StringBuilder();

        while (i < n && j < m) {

            if (A[i] <= B[j]) {
                result.append(A[i]).append(" ");
                i++;
            } else {
                result.append(B[j]).append(" ");
                j++;
            }
        }

        // Remaining elements of A
        while (i < n) {
            result.append(A[i]).append(" ");
            i++;
        }

        // Remaining elements of B
        while (j < m) {
            result.append(B[j]).append(" ");
            j++;
        }

        System.out.println(result.toString().trim());

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MERGESORTED)