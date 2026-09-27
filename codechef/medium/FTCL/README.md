# FTCL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:15:55.886Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // Border element
                boolean border = (i == 0 || i == n - 1 ||
                                  j == 0 || j == n - 1);

                // Main or secondary diagonal
                boolean diagonal = (i == j || i + j == n - 1);

                if (border && !diagonal)
                {
                    sum += matrix[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FTCL)