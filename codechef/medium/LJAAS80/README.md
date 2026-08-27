# LJAAS80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Arithmetic operation

Write a program that takes two numbers and an operator (+, -, *, /) as input. Use a  **switch**  statement to perform the corresponding arithmetic operation and print the result.

### Sample 1:
Input
Output

```
5 2 +
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T13:57:43.986Z  

```java
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        char op = scanner.next().charAt(0); 

        switch(op) 
        {
            case '+': 
                System.out.println(num1 + num2); 
                break;
            case '-': 
                System.out.println(num1 - num2); 
                break;
            case '*': 
                System.out.println(num1 * num2); 
                break;
            case '/': 
                System.out.println(num1 / num2); 
                break;
            default: 
                System.out.println("Invalid operator");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS80)