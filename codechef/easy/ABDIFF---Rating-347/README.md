# ABDIFF - Rating 347

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### AB Difference

Chef is taking his baby steps into the world of programming.

The very first program he's tasked to write is as follows:
"Given two integers $A$ and $B$, print $A+B$."

Unfortunately, Chef makes a typo: his program outputs $A\times B$ instead of $A+B$.

Given the values of $A$ and $B$, can you help Chef find the  *absolute difference*  between the correct answer and the value his program prints?

### Input Format

The only line of input will contain two space-separated integers, $A$ and $B$.

### Output Format

Print a single integer: the difference between the correct answer and Chef's output.

### Constraints

$1 \leq A, B \leq 10$

### Sample 1:
Input
Output

```
4 7
```

```
17
```

### Explanation:

The correct answer is $4+7 = 11$, but Chef's program prints $4\times 7 = 28$.
The difference between them is $|28 - 11| = 17$.

### Sample 2:
Input
Output

```
1 6
```

```
1
```

### Explanation:

The correct answer is $1+6 = 7$, but Chef's program prints $1\times 6 = 6$.
The difference between these values is $1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-31T10:14:57.509Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
                int sum = a + b;
        int product = a * b;

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ABDIFF)