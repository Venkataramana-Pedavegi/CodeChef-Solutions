# LJAAS70

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Increase or Decrease

Write a program that takes three numbers as input and prints " **Increasing** " if the numbers are in strictly increasing order, " **Decreasing** " if they are in strictly decreasing order, and " **Neither** " otherwise.

### Sample 1:
Input
Output

```
20 30 41
```

```
Increasing
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-26T17:40:41.380Z  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println("Increasing");
        } else if (a > b && b > c) {
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS70)