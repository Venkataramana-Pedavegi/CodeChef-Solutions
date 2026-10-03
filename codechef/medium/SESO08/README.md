# SESO08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Smallest Absolute Difference

Write a program to find the element in an array with the  **smallest absolute difference**  from a given integer  **k**. If there are multiple elements with the same minimum difference, print the smallest of these elements.

### Input Format
- The first line contains two integers n and k, where n is the number of elements in the array and k is the integer against which to compare.
- The second line contains $n$ integers separated by spaces, representing the elements of the array.
### Output Format
- Print the element in the array with the smallest difference from k. If multiple elements have the same minimum difference, print the smallest of these elements.
### Sample 1:
Input
Output

```
5 10
1 5 9 12 14

```

```
9

```

### Sample 2:
Input
Output

```
6 7
3 8 6 5 10 15

```

```
6

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:17:18.650Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        int min_diff = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - k);
            
            if (diff < min_diff || (diff == min_diff && arr[i] < result)) {
                min_diff = diff;
                result = arr[i];
            }
        }
        
        System.out.println(result);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO08)