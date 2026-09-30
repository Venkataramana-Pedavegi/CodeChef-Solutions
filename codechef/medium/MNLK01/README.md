# MNLK01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in

A data analyst is studying a dataset of numerical values. They need a way to quickly find out how many data points are "close" to a specific target value. "Close" is defined as having an absolute difference less than or equal to a given tolerance.

You are given an array $A$, the absolute allowed difference $D$ and an integer $N$. Your task is to find and return the count of elements in the array $A$ that have an absolute difference of less than or equal to $D$ with the number $N$.
 **Note:**  If no such elements are found in the array, the function should return `-1`.

### Input Format
- The first line contains an integer $L$, representing the size of the array.
- The second line contains $L$ space separated integers, representing the elements of the array $A$.
- The third line contains two space separated integers, an integer $N$ and the absolute allowed difference $D$.
### Output Format
- A single integer representing the count of elements that satisfy the condition, or $-1$ if no such elements exist.
### Sample 1:
Input
Output

```
6
12 3 14 56 77 13
13 2
```

```
3
```

### Explanation:

The elements in the array $A$ that have an absolute difference of less than or equal to $2$ with $N$ (13) are:

- $|12 - 13| = 1 \leq 2$
- $|13 - 13| = 0 \leq 2$
- $|14 - 13| = 1 \leq 2$ Hence, the total count is 3.
### Sample 2:
Input
Output

```
5
100 200 300 400 500
50 10
```

```
-1
```

### Explanation:

No element in the array has an absolute difference of $10$ or less with the number $50$. Therefore, the output is $-1$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T09:09:43.973Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int L=sc.nextInt();
		int[] A =new int[L];
		for(int i=0;i<L;i++){
		    A[i]=sc.nextInt();
		}
		int N=sc.nextInt();
		int D=sc.nextInt();
		int count=0;
		for(int i=0;i<L;i++){
		    if (Math.abs(A[i]-N)<=D){
		        count++;
		    }
		}
		if(count==0){
		    System.out.println(-1);
		}else{
		    System.out.println(count);
		
		}
		sc.close();
		

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MNLK01)