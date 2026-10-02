# DSCPPAS139

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Number of 1s

You are given a sorted binary array containing 0's and 1's. Your task is to efficiently determine the total number of 1's in the array.

 **Note:** 

- Your implementation should have a time complexity of O(log n), where 'n' is the length of the binary array.
### Input Format
- First line contains n, representing the size of binaryArray.
- Second line contains n elements of binaryArray, where each element is either 0 or 1.
### Output Format
- Print an integer representing the total number of 1's in the given binary array.
### Sample 1:
Input
Output

```
7
0 0 1 1 1 1 1

```

```
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T15:58:57.036Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;
        int firstOne = n;  // If there are no 1s

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == 1) {
                firstOne = mid;
                high = mid - 1;   
            } else {
                low = mid + 1;   
            }
        }

        System.out.println(n - firstOne);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS139)