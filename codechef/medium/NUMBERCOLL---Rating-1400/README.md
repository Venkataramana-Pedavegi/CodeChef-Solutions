# NUMBERCOLL - Rating 1400

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Valid Integer Strings

You are given $N$ strings. A string is considered valid if it can be parsed as a 64-bit signed integer (a standard long in Java).

A string $S$ is considered  **valid**  if and only if it meets all of the following criteria:

- It contains only decimal digits ('0' through '9'), optionally preceded by a single sign character ('+' or '-'). A standalone "+" or "-" without digits is invalid.
- The numerical value represented by $S$ lies within the inclusive 64-bit signed integer range: $\left[-2^{63}, 2^{63} - 1\right] = [-9223372036854775808, 9223372036854775807]$
- Floating-point representations (e.g., "12.34"), scientific notation (e.g., "1e5"), alphabetic characters, and special symbols are strictly invalid.
- Strings containing internal, leading, or trailing whitespace are invalid.

For example:

- "123" → valid
- "-456" → valid
- "abc" → invalid
- "12.34" → invalid
- "999999999999999999999999" → invalid because it exceeds the range of long

 **Task:** 
Process all `N` strings and calculate:

- The count of valid integers.
- The sum of all valid integers.

Invalid strings must be ignored.

### Input Format
- The first line contains an integer $N$, representing the number of strings.
- The second line contains $N$ space-separated strings $S_1, S_2, \dots, S_N$.
### Output Format
- Print two space-separated integers representing the count of valid integers and the sum of all valid integers, respectively.
### Sample 1:
Input
Output

```
6
12
abc
-5
20x
0
100
```

```
4 107
```

### Explanation:

The output `4 107` is produced by processing each of the 6 inputs in sequence:

- 12 $\rightarrow$ Valid. Added to count (1) and sum ($0 + 12 = 12$).
- abc $\rightarrow$ Invalid. Contains non-digit characters. Skipped.
- -5 $\rightarrow$ Valid. Added to count (2) and sum ($12 + (-5) = 7$).
- 20x $\rightarrow$ Invalid. Contains non-digit character 'x'. Skipped.
- 0 $\rightarrow$ Valid. Added to count (3) and sum ($7 + 0 = 7$).
- 100 $\rightarrow$ Valid. Added to count (4) and sum ($7 + 100 = 107$).

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:56:29.391Z  

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

[View on CodeChef](https://www.codechef.com/problems/NUMBERCOLL)