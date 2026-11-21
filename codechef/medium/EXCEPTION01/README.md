# EXCEPTION01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Age

A registration system must validate the age entered by a user before storing the user's details.

An age is considered valid only if it lies between $0$ and $120$, inclusive. If the entered age is less than $0$ or greater than $120$, the program must reject it using a custom unchecked exception.

 **Task** 
Complete the following:

- InvalidAgeException class
- setAge(int age) method of the Person class : It validates the given age: If $age < 0$ or $age > 120$, the method must use throw to throw an InvalidAgeException with the message: Invalid Age Otherwise, store the age.
- getAge() method of the Person class : It returns the stored age.

 **The provided driver code will:** 

- Read the age from input.
- Create a Person object.
- Call setAge() inside a try-catch block.
- If the age is valid, print: Age Accepted: <age>
- catch InvalidAgeException and print its message if the age is invalid
### Sample 1:
Input
Output

```
25
```

```
Age Accepted: 25
```

### Explanation:

The age 25 lies within the valid range 0 to 120, so it is stored successfully.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:56:35.301Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        int validCount = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) break;
            String token = sc.next();

            // Strip leading '+' sign if present for standard parsing
            String parseableToken = token;
            if (token.startsWith("+") && token.length() > 1 && token.charAt(1) != '+') {
                parseableToken = token.substring(1);
            }

            try {
                long val = Long.parseLong(parseableToken);
                validCount++;
                sum += val;
            } catch (NumberFormatException e) {
                // Skips strings that are invalid
            }
        }

        System.out.println(validCount + " " + sum);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EXCEPTION01)