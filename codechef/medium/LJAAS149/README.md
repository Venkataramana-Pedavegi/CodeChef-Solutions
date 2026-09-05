# LJAAS149

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Increase the integer

Write a program that takes t test cases as input, then for each test case, reads an integer N, and prints N + 1.

### Sample 1:
Input
Output

```
3
4
2
-1
```

```
5
3
0
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T17:03:13.435Z  

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int N = scanner.nextInt();
            System.out.println(N + 1);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS149)