# DSCPPAS276

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check Palindrome

You are given a string $(S)$. Your task is to determine if the string can be a palindrome after deleting at most one character from it.

### Input Format
- The first line contains one integer $n$, the size of the string - Next line contains string $S$.
### Output Format
- Print whether $S$ can be made palindrome after deleting at most one character.
### Constraints
- $1 \leq |S| \leq 10^5$
### Sample 1:
Input
Output

```
4
abca
```

```
true
```

### Explanation:

We can delete b or c to make it palindrome. after deleting b the S will be aca which is palindrome.

### Sample 2:
Input
Output

```
4
batr
```

```
false
```

### Explanation:

There is no way to make S palindrome after deleting at most 1 character.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T16:52:00.846Z  

```java
import java.util.Scanner;

public class Main {

    static boolean validPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                return isPalindrome(s, left + 1, right)
                    || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    static boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String s = scanner.next();

        System.out.println(validPalindrome(s) ? "true" : "false");

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSCPPAS276)