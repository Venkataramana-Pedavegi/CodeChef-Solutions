# BSMCQ3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### The Middle Index

If the array is A = $[2, 5, 8, 9, 10]$, what would be A[mid]?

Note: We are using 0-based indexing.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:07:02.085Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static int binarySearch(int[] arr, int n, int k) {
        int left = 0, right = n - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] ==k) {
                return middle;
            } else if (arr[middle] > k) {
                right=middle-1;
            } else {
                left=middle+1;
            }
        }
        return -1; // k not found
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(binarySearch(arr, n, k));
	}
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BSMCQ3)