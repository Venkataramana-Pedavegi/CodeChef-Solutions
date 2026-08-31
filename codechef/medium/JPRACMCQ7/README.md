# JPRACMCQ7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Multiple Choice Question

Given $X$ and $Y$, which of these statements outputs the absolute difference between them?

 **Option 1:** 

```
if (X >= Y) {
    System.out.print(X - Y);
}
else{
    System.out.print(Y - X);
}

```

 **Option 2:** 

```
if (X > Y){
    System.out.print(X - Y);
}
else{
    System.out.print(Y - X);
}

```

 **Option 3:** 

```
if (X > Y){
    System.out.print(X - Y);
}
System.out.print(Y - X);

```

 **Option 4:** 

```
if (X > Y{
    System.out.print(Y - X);
}
else{
    System.out.print(X - Y);
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:13:59.818Z  

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
				int blackCells = (n * n) / 2;
		System.out.println(blackCells);

		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JPRACMCQ7)