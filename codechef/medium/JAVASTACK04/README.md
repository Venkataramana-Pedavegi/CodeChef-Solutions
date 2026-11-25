# JAVASTACK04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Deque MCQ

Consider the following Java code:

```
Deque<Integer> stack = new ArrayDeque<>();

stack.push(10);
stack.push(20);
stack.push(30);

int x = stack.pop();
stack.push(40);

System.out.println(stack.peek());
System.out.println(x);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:40:56.472Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/JAVASTACK04)