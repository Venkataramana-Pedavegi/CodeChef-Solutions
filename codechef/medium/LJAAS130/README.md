# LJAAS130

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Square of numbers

Write a program that uses a for-each loop to print the square of each element in an array, but skips elements greater than 10. The elements of the array are  **{2, 10, 12, 6, 15}**.

### Sample 1:
Input
Output

```

```

```
4 100 36
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:11:56.236Z  

```java
class Codechef
{
	public static void main (String[] args) 
	{
		int[] values = {2, 10, 12, 6, 15};
        for (int x : values) 
        {
            if (x > 10) 
            {
                continue;
            }
            System.out.print(x * x + " ");
        }        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS130)