# LJAAS110

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Print factorial

Write a program that uses a do-while loop to find the factorial of a given input number.

### Sample 1:
Input
Output

```
5
```

```
120
```

### Explanation:

1 x 2 x 3 x 4 x 5 = 120

### Sample 2:
Input
Output

```
6
```

```
720
```

### Explanation:

1 x 2 x 3 x 4 x 5 x 6 = 720

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-02T14:44:13.270Z  

```java
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num==0)
        {
            System.out.println(1);
        }
        else{
            int factorial = 1;
            do {
                factorial *= num;
                num--;
            } while (num > 0);
    
            System.out.println(factorial);
        }
        
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS110)