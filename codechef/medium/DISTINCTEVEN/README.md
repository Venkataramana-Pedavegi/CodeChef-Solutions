# DISTINCTEVEN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Distinct Even Squares

Given an array of $N$ integers, process the elements through the following pipeline:

- Filter: Keep only the even numbers.
- Transform: Square every remaining number.
- Deduplicate: Remove duplicate values.
- Sort: Sort the resulting values in ascending order.

If no even numbers exist in the original array, print `EMPTY`. Otherwise, print the sorted unique squares separated by spaces.

### Task

Implement the `processNumbers()` method using the  **Java Stream API**.

### Input Format
- The first line contains a single integer $N$, representing the number of elements in the array.
- The second line contains $N$ space-separated integers $A_1, A_2, \dots, A_N$.
### Output Format
- Print the resulting unique squared values separated by spaces in ascending order.
- If no even numbers exist, print EMPTY.
### Sample 1:
Input
Output

```
8
2 -2 3 4 6 3 4 0
```

```
0 4 16 36
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:41:33.321Z  

```java
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Codechef
{
    static long[] processNumbers(IntStream numbers)
    {
        return numbers
            .filter(x -> x % 2 == 0)
            .mapToLong(x -> (long) x * x)
            .distinct()
            .sorted()
            .toArray();
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++)
        {
            arr[i] =
                Integer.parseInt(st.nextToken());
        }

        long[] result =
            processNumbers(Arrays.stream(arr));

        if (result.length == 0)
        {
            System.out.println("EMPTY");
        }
        else
        {
            for (int i = 0; i < result.length; i++)
            {
                if (i > 0)
                {
                    System.out.print(" ");
                }

                System.out.print(result[i]);
            }

            System.out.println();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DISTINCTEVEN)