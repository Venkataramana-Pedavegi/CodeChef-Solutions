# DPNMAO05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Peak Elevation

A hiker is trekking through a mountain range. During the trek, they record their elevation at various points. The sequence of recorded elevations first increases and then may decrease, forming a shape similar to a mountain.
Your task is to find the highest elevation point the hiker reached. This highest point is called the "elevation point" or the peak of the trek.

Given a sequence of elevations, find the maximum elevation.

### Input Format
- The first line contains an integer $N$, representing the number of elevation recordings.
- The second line contains $N$ space separated integers, $A_0, A_1,..., A_\text{N-1}$, representing the elevations.
### Output Format
- Print a single integer which is the maximum elevation in the given sequence.
### Constraints
- $1 \leq N \leq 10^5$
- $1 \leq A_i \leq 10^9$
### Sample 1:
Input
Output

```
7
1 2 3 4 3 2 1
```

```
4
```

### Explanation:

4 is the highest elevation point.

### Sample 2:
Input
Output

```
2
5 3
```

```
5
```

### Explanation:

The highest elevation is 5.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T06:03:35.776Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int low = 0;
        int high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // If the slope is rising, the peak must be to the right
            if (arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            } else {
                // Otherwise, we are on the falling slope or at the peak
                high = mid;
            }
        }
        
        System.out.println(arr[low]);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO05)