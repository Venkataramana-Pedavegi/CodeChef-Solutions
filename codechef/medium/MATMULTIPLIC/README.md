# MATMULTIPLIC

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T05:44:14.359Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int i = 0;
        int j = M - 1;
        int count = 0;

        while (i < N && j >= 0) {

            if (matrix[i][j] < 0) {
                count += N - i;
                j--;
            } else {
                i++;
            }
        }

        System.out.println(count);

        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MATMULTIPLIC)