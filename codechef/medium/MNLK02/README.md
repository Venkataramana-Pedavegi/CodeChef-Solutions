# MNLK02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in u24a81a0643 24a81a0643@sves.org.in

You are given two strings, $S$ and $T$. Your task is to determine if it's possible to rearrange the characters of $S$ to form the string $T$. In other words, you need to check if $T$ is an anagram of $S$.

 **NOTE:**  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Input Format
- The first line of input contains the string $S$.
- The second line of input contains the string $T$.
### Output Format
- Print True if $T$ can be formed by rearranging the characters of $S$, otherwise print False.
### Constraints
- $1\leq |S|, |T| \leq 1000$
- The strings consist of lowercase English letters only.
### Sample 1:
Input
Output

```
listen
silent
```

```
true
```

### Sample 2:
Input
Output

```
hello
world
```

```
false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T09:33:38.091Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		if(s.length()!=t.length()){
		    System.out.println("false");
		    return;
		}
		int [] count=new int[26];
		for(int i=0;i<s.length();i++){
		    count[s.charAt(i)-'a']++;
		    count[t.charAt(i)-'a']--;
		}
		boolean flag=true;
		for(int i=0;i<26;i++){
		    if(count[i]!=0){
		        flag=false;
		        break;
		    }
		}
		System.out.println(flag);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MNLK02)