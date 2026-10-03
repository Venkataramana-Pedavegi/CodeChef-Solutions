# SESO07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find smallest and largest numbers

Write a program to find the  **smallest**  and  **largest**  elements in an array of integers.

### Input Format
- The first line contains an integer n, representing the number of elements in the array.
- The second line contains n integers separated by spaces, representing the elements of the array.
### Output Format
- Print the smallest and largest elements in the array on a single line, separated by a space.
### Sample 1:
Input
Output

```
10
4 3 53 13 2 44 55 35 56 34
```

```
2 56
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:16:00.198Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        
        System.out.println(smallest + " " + largest);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO07)