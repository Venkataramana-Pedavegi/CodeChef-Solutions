# LJAAS79

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create a program that takes a lowercase English alphabetic character as input and uses a  **switch**  statement to determine if it's a  **vowel**  or  **consonant**.

### Sample 1:
Input
Output

```
i
```

```
Vowel
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-28T14:45:16.968Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch (ch){
		    case 'a':
		    case 'e':
		    case 'i':
		    case 'o':
		    case 'u':
		        System.out.println("vowel");
		        break;
		  default:
		  System.out.println("Consonant");
		  break;
		}
		sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS79)