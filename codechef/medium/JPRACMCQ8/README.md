# JPRACMCQ8

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Determine the number of  **black cells**  in an $6 \times 6$ chessboard.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:12:25.652Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int ratedusers = n-a;
		int highRatedUsers =n-a-b;
		System.out.println(ratedusers + " "+highRatedUsers);
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ8)