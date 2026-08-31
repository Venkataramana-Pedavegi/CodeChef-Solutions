# JPRACMCQ8 - Rating 284

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:12:10.477Z  

```java
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