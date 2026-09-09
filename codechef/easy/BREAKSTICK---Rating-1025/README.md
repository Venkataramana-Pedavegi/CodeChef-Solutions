# BREAKSTICK - Rating 1025

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-09T17:43:27.400Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int protein = 0;
            boolean possible = true;

            for (int i = 1; i <= N; i++) {
                int A = sc.nextInt();

                protein += A;

                if (protein < K && possible) {
                    System.out.println("NO " + i);
                    possible = false;
                }

                if (protein >= K) {
                    protein -= K;
                }
            }

            if (possible) {
                 System.out.println("YES");
            }
        }

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/BREAKSTICK)