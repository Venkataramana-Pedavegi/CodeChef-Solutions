# SQUATS - Rating 249

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Squats

Somu went to the gym today. He decided to do $X$ sets of squats. Each set consists of $15$ squats. Determine the total number of squats that he did today.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first and only line of each test case contains an integer $X$ — the total number of sets of squats that Somu did.
### Output Format

For each test case, output the total number of squats done by Somu.

### Constraints
- $1 \leq T \leq 1000$
- $1 \leq X \leq 10^5$
### Sample 1:
Input
Output

```
3
1
4
99

```

```
15
60
1485

```

### Explanation:

 **Test Case 1:**  Since, he does only $1$ set of squats, the total number of squats done by him is $15$.

 **Test Case 2:**  Since, he does $4$ sets of squats, the total number of squats is $15 + 15 + 15 + 15 = 60$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T00:13:16.871Z  

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
    		System.out.println(x*15);
		}
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SQUATS)