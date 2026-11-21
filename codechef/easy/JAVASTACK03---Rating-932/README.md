# JAVASTACK03 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:19:58.876Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAVASTACK03)