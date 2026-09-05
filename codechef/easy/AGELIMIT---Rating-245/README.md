# AGELIMIT - Rating 245

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Age Limit

Chef wants to appear in a competitive exam. To take the exam, there are following requirements:

- Minimum age limit is $X$ (i.e. Age should be greater than or equal to $X$).
- Age should be strictly less than $Y$.

Chef's current Age is $A$. Find whether he is currently eligible to take the exam or not.

### Input Format
- First line will contain $T$, number of test cases. Then the test cases follow.
- Each test case consists of a single line of input, containing three integers $X, Y,$ and $A$ as mentioned in the statement.
### Output Format

For each test case, output `YES` if Chef is eligible to give the exam, `NO` otherwise.

You may print each character of the string in uppercase or lowercase (for example, the strings `YES`, `yEs`, `yes`, and `yeS` will all be treated as identical).

### Constraints
- $1 \leq T \leq 1000$
- $20 \leq X \lt Y \leq 40$
- $10 \leq A \leq 50$
### Sample 1:
Input
Output

```
5
21 34 30
25 31 31
22 29 25
20 40 15
28 29 28

```

```
YES
NO
YES
NO
YES

```

### Explanation:

 **Test case $1$:**  The age of Chef is $30$. His age satisfies the minimum age limit as $30 \ge 21$. Also, it is less than the upper limit as $30 \lt 34$. Thus, Chef is eligible to take the exam.

 **Test case $2$:**  The age of Chef is $31$. His age satisfies the minimum age limit as $31 \ge 25$. But, it is not less than the upper limit as $31 \nless 31$. Thus, Chef is not eligible to take the exam.

 **Test case $3$:**  The age of Chef is $25$. His age satisfies the minimum age limit as $25 \ge 22$. Also, it is less than the upper limit as $25 \lt 29$. Thus, Chef is eligible to take the exam.

 **Test case $4$:**  The age of Chef is $15$. His age does not satisfy the minimum age limit as $15 \lt 20$. Thus, Chef is not eligible to take the exam.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T00:11:59.145Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
    		int x = sc.nextInt();
    		int y = sc.nextInt();
    		int a = sc.nextInt();
    		if(a>=x && a<y){
    		    System.out.println("yes");
    		}else{
    		    System.out.println("no");
    		}
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/AGELIMIT)