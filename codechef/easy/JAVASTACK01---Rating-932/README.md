# JAVASTACK01 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Stack - Implementation

You are given a string $S$ containing letters, digits, spaces, and special characters. Your task is to reverse the string using a custom stack implementation.

Create a class `Stack` that internally stores characters using an array. You must complete the `push()` and `pop()` methods and use them to reverse the given string.

However, the stack has an initial capacity of $K$. If the stack becomes full while inserting characters, its capacity must be doubled dynamically.

### Input Format
- The first line contains an integer $K$, representing the initial capacity of the stack.
- The second line contains the string $S$.
### Output Format

The driver code will print the output in the following format:

- Original: S
- Reversed: reversed_string
- Push Operations: X
- Pop Operations: Y
- Final Capacity: C

where:

- $X$ is the number of push() operations.
- $Y$ is the number of pop() operations.
- $C$ is the final capacity of the dynamically resized stack.
### Sample 1:
Input
Output

```
5
Hello, World!
```

```
Original: Hello, World!
Reversed: !dlroW,olleH
Push Operations: 13
Pop Operations: 13
Final Capacity: 20
```

### Explanation:

The initial capacity is $5$.

While inserting the $13$ characters:

- Capacity $5$ becomes $10$.
- Capacity $10$ becomes $20$.

All $13$ characters are pushed onto the stack and then popped to obtain the reversed string.

Therefore:

- push() is called $13$ times.
- pop() is called $13$ times.
- Final capacity is $20$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:19:56.565Z  

```java
import java.util.*;
import java.io.*;

class Stack
{
    private char[] arr;
    private int top;
    private int capacity;

    int pushOperations;
    int popOperations;

    Stack(int capacity)
    {
        this.capacity = capacity;
        arr = new char[capacity];
        top = -1;

        pushOperations = 0;
        popOperations = 0;
    }

    void push(char ch)
    {
        if (top == capacity - 1)
        {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }

        arr[++top] = ch;
        pushOperations++;
    }

    char pop()
    {
        if (isEmpty())
        {
            return '\0';
        }

        popOperations++;
        return arr[top--];
    }

    boolean isEmpty()
    {
        return top == -1;
    }

    int getCapacity()
    {
        return capacity;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        String str = br.readLine();

        Stack stack = new Stack(k);

        for (int i = 0; i < str.length(); i++)
        {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty())
        {
            reversed.append(stack.pop());
        }

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
        System.out.println("Push Operations: " + stack.pushOperations);
        System.out.println("Pop Operations: " + stack.popOperations);
        System.out.println("Final Capacity: " + stack.getCapacity());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASTACK01)