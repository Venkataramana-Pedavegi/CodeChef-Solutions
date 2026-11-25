# JAVASTACK03 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Valid Parenthesis

A string of parentheses is considered valid if each opening parenthesis has a matching closing parenthesis and the pairs are properly nested. In a valid parenthesis string, every opening bracket '(' must have a corresponding closing bracket ')' that occurs after the opening bracket, and there must not be any extra or unpaired brackets.

Here are the rules for a string of parentheses to be valid:

- Correct order: Each closing parenthesis must correspond to the latest unmatched opening parenthesis.
- Matching pairs: For every opening parenthesis, there must be a closing parenthesis.

Let's look at some examples:

- "()" - This is valid because the only pair of parentheses correctly matches and is in the right order.
- "()()" - This is also valid. There are two separate but correct matches.
- "(()())" - Valid as well, since the inner pair is nested within the outer pair and they all match up.
- "(())" - The inner pair is nested within the outer pair, with both pairs being correctly matched.
- ")(" or "(" or ")" - All invalid because they contain either unmatched or improperly ordered parentheses.

The goal is to determine if parentheses (and optionally other brackets like curly braces and square brackets) in an expression are properly balanced.

### Task
- Complete the isBalanced(String expression) method.
### Sample 1:
Input
Output

```
3
((()))
()()()
(((())
```

```
((())) : true
()()() : true
(((()) : false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:40:41.558Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean isBalanced(String expression) {
        Stack < Character > stack = new Stack < > ();

        for (char ch: expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop();
            }
        }

        return stack.isEmpty();
    }


    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String expression = sc.nextLine();

            boolean result = isBalanced(expression);

            System.out.println(expression + " : " + result);
        }

        sc.close();

    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASTACK03)