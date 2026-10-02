# DSAAGP1094 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T15:44:12.588Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/DSAAGP1094)