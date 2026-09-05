# LJAAS150

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Even odd

Write a program that first accepts the number of test cases  **t**. For each test case, read an integer  **num**. Check if  **num**  is even using the  **isEven**  function. If  **num**  is even, output  **"Even"** ; otherwise, output  **"Odd"**.

### Sample 1:
Input
Output

```
3
2
6
5
```

```
Even
Even
Odd
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:02:51.319Z  

```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()) {
            int t = scanner.nextInt();
            // System.out.println("Number of test cases: " + t); // Debug line
            while (t-- > 0) {
                if(scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    if (isEven(num))
                        System.out.println("Even");
                    else
                        System.out.println("Odd");
                } else {
                    System.out.println("Expected more numbers as input");
                }
            }
        } else {
            System.out.println("Expected an integer for number of test cases");
        }
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS150)