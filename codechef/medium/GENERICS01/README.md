# GENERICS01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generic Maximum Finder

You are given two arrays:

- An array of $N$ integers.
- An array of $M$ double values.

Your task is to implement a generic Java method named `findMax` that can determine the maximum element of an array regardless of its data type.

The method should work with any type that supports comparison.

Use the generic method to determine:

- The maximum element in the integer array.
- The maximum element in the double array.

Print both maximum values on separate lines.

### Input Format
- The first line contains an integer $N$, representing the number of elements in the integer array.
- The second line contains $N$ space-separated integers.
- The third line contains an integer $M$, representing the number of elements in the double array.
- The fourth line contains $M$ space-separated double values.
### Output Format
- The first line contains the maximum element of the integer array.
- The second line contains the maximum element of the double array.
### Sample 1:
Input
Output

```
5
3 7 12 4 9
4
2.5 9.2 4.8 7.1
```

```
12
9.2
```

### Explanation:

For the integer array: `3 7 12 4 9`, the maximum element is $12$.

For the double array: `2.5 9.2 4.8 7.1`, the maximum element is $9.2$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:21:27.766Z  

```java
import java.io.*;
import java.util.*;

public class Main {

    public static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(max) > 0) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        Integer[] integers = new Integer[n];

        for (int i = 0; i < n; i++) {
            integers[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine().trim());

        st = new StringTokenizer(br.readLine());

        Double[] doubles = new Double[m];

        for (int i = 0; i < m; i++) {
            doubles[i] = Double.parseDouble(st.nextToken());
        }

        System.out.println(findMax(integers));
        System.out.println(findMax(doubles));
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GENERICS01)