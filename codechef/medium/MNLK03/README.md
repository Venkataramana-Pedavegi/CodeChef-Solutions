# MNLK03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in

There is an array $A$ of $N$ light bulbs in a row, indexed from $0$ to $N-1$. Each bulb is initially either on (represented by $1$) or off (represented by $0$).

Each bulb $i$ has a switch. However, due to faulty wiring, pressing the switch for bulb $i$ toggles the state of bulb $i$ and all the bulbs to its right (i.e., bulbs $i, i+1,..., N-1$). Toggling means changing $0$ to $1$ and $1$ to $0$.

Your task is to find the minimum number of switch presses required to turn all the bulbs on.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- The first line of each test case contains an integer $N$, the number of bulbs.
- The second line of each test case contains $N$ space separated integers, representing the initial state of the bulbs.
### Output Format
- For each test case, print a single integer on a new line representing the minimum number of switches you have to press.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
### Sample 1:
Input
Output

```
2
4
0 1 0 1
5
1 0 0 0 0
```

```
4
1
```

### Explanation:

For the first test case $[0, 1, 0, 1]$:

- Press switch 0: State becomes $[1, 0, 1, 0]$
- Press switch 1: State becomes $[1, 1, 0, 1]$
- Press switch 2: State becomes $[1, 1, 1, 0]$
- Press switch 3: State becomes $[1, 1, 1, 1]$ A total of $4$ presses are required.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T09:21:41.827Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		    int N=sc.nextInt();
		    int flip=0;
		    int count=0;
		    for(int i=0;i<N;i++){
		        int bulb=sc.nextInt();
		        if(flip == 1){
		            bulb=1-bulb;
		        }
		        if(bulb==0){
		            count++;
		            flip =1-flip;
		        }
		    }
		    System.out.println(count);
		}
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MNLK03)