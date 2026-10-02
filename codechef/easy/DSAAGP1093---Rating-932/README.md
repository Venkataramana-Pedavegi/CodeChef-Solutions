# DSAAGP1093 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Binary Search

Complete the code for Binary Search to find the index of an element $K$ in the given array $A$. Output the index of the element of $K$, if $K$ is present in $A$, else output $-1$.

### Sample 1:
Input
Output

```
9 7 
1 3 6 7 10 13 20 25 27 

```

```
3
```

### Sample 2:
Input
Output

```
9 2
1 3 6 7 10 13 20 25 27 
```

```
-1
```

### Explanation:

$2$ does not exist in this array

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T15:44:11.593Z  

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

[View on CodeChef](https://www.codechef.com/problems/DSAAGP1093)