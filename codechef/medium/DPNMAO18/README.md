# DPNMAO18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Array Rotation

Given an integer array $A$, rotate the array to the right by $K$ steps, where $K$ is non negative.

### Input Format
- The first line contains two space separated integers, $N$, the size of the array, and $K$, the number of rotations.
- The second line contains $N$ space separated integers representing the elements of the array $A$.
### Output Format
- Print the elements of the rotated array, separated by spaces, on a single line.
### Sample 1:
Input
Output

```
7 3
1 2 3 4 5 6 7
```

```
5 6 7 1 2 3 4
```

### Explanation:
- Rotate $1$ step to the right: $[7, 1, 2, 3, 4, 5, 6]$
- Rotate $2$ steps to the right: $[6, 7, 1, 2, 3, 4, 5]$
- Rotate $3$ steps to the right: $[5, 6, 7, 1, 2, 3, 4]$
### Sample 2:
Input
Output

```
4 2
-1 -100 3 99
```

```
3 99 -1 -100
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:38:07.038Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        k = k % n;

        reverse(arr, 0, n - 1);      
        reverse(arr, 0, k - 1);      
        reverse(arr, k, n - 1);      

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO18)