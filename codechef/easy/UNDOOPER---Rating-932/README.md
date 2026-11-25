# UNDOOPER - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Undo Operations Using Stack with Deque

A text editor stores the history of values entered by the user.

You are given $Q$ operations. Use a `Deque<Integer>` as a  **stack**  to process them.

Each operation is one of the following:

- PUSH X — Add $X$ to the top of the stack.
- POP — Remove the top element if the stack is not empty.
- TOP — Print the current top element. If the stack is empty, print Empty.

After processing all operations, print the final stack from  **top to bottom**.

If the final stack is empty, print `Empty`.

You must use:

```
Deque<Integer> stack = new ArrayDeque<>();

```

### Input Format
- The first line contains an integer $Q$.
- The next $Q$ lines contain one operation.
### Output Format
- For every TOP operation, print the top element or Empty.
- After all operations, print:

```
Final Stack: elements

```

If the stack is empty:

```
Final Stack: Empty

```

### Sample 1:
Input
Output

```
7
PUSH 10
PUSH 20
TOP
PUSH 30
POP
TOP
PUSH 40
```

```
20
20
Final Stack: 40 20 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:41:16.827Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();

            if (operation.equals("PUSH"))
            {
                int value = sc.nextInt();
                stack.push(value);
            }
            else if (operation.equals("POP"))
            {
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if (operation.equals("TOP"))
            {
                if (stack.isEmpty())
                {
                    System.out.println("Empty");
                }
                else
                {
                    System.out.println(stack.peek());
                }
            }
        }

        System.out.print("Final Stack: ");

        if (stack.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            while (!stack.isEmpty())
            {
                System.out.print(stack.pop());

                if (!stack.isEmpty())
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/UNDOOPER)