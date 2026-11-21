# EXCEPTION04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Expense Sharing Using Exception Handling

A group of friends wants to divide a restaurant bill equally among its members. You need to write a Java program that calculates the share per person while utilizing  **Exception Handling**  to gracefully manage cases where the number of members is zero.

Instead of checking whether the number of members is zero using a conditional statement (`if`), your code must rely on a `try-catch` block to handle the `ArithmeticException` thrown during division by zero.

- If the number of members is 0 (triggering a division by zero), catch the ArithmeticException
### Input Format
- The first line contains an integer representing the total bill amount.
- The second line contains an integer representing the number of members.
### Output Format

For valid input, print:

```
Each member pays: <amount>

```

If the number of members is zero, print:

```
Cannot divide expense among zero members

```

### Sample 1:
Input
Output

```
1200
4
```

```
Each member pays: 300

```

### Sample 2:
Input
Output

```
1500
0
```

```
Cannot divide expense among zero members

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:59:23.576Z  

```cpp

        Scanner scanner = new Scanner(System.in);

        int totalBill = scanner.nextInt();
        int members = scanner.nextInt();

        try {
            int share = totalBill / members;

            System.out.println("Each member pays: " + share);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide expense among zero members");
        }

        scanner.close();
    }
}
    public static void main(String[] args) {

public class Codechef {

import java.util.Scanner;
```

---

[View on CodeChef](https://www.codechef.com/problems/EXCEPTION04)