# CLRO

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:19:49.891Z  

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

        String[] matrix = new String[n];

        for (int i = 0; i < n; i++)
        {
            matrix[i] = sc.next();
        }

        // Find a possible celebrity
        int candidate = 0;

        for (int i = 1; i < n; i++)
        {
            if (matrix[candidate].charAt(i) == '1')
            {
                // Candidate knows i, so candidate cannot be celebrity
                candidate = i;
            }
        }

        // Verify the candidate
        for (int i = 0; i < n; i++)
        {
            if (i == candidate)
                continue;

            // Everyone must know candidate
            if (matrix[i].charAt(candidate) != '1')
            {
                System.out.println(-1);
                return;
            }

            // Candidate must not know anyone
            if (matrix[candidate].charAt(i) != '0')
            {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(candidate);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CLRO)