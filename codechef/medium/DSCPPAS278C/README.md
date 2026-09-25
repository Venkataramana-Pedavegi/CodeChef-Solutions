# DSCPPAS278C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Square

Given a positive integer $c$, decide whether it can be represented as sum of two square numbers that is  **c = a2 + b2**  or not, where a and b are two non-negative integers and $a \leq b$.

### Input Format

First line contains positive integers $c$.

### Output Format

Print  **true**  if it can be represented, else print  **false**.

### Constraints
- $1 \leq c \leq 10^9$
### Sample 1:
Input
Output

```
25
```

```
true
```

### Explanation:

25 can be represented in form of 32 + 42 = 9+16=25.

### Sample 2:
Input
Output

```
15
```

```
false
```

### Explanation:

15 can not be represented as the sum of two square numbers.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:52:28.224Z  

```java
import java.util.Scanner;

public class Main {

    public static boolean checkSquareSum(long c) {

        long left = 0;
        long right = (long) Math.sqrt(c);

        while (left <= right) {

            long sum = left * left + right * right;

            if (sum == c) {
                return true;
            }

            if (sum < c) {
                left++;
            } else {
                right--;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long c = scanner.nextLong();

        if (checkSquareSum(c)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS278C)