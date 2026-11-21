# LIST06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Build Your Own ArrayList

You're working on a lightweight Java library where you cannot use built-in collections like `ArrayList`. Your task is to  **implement your own version of an ArrayList**  class that supports basic operations such as adding elements, retrieving elements by index, getting the size, and printing all elements.

This challenge is designed to test your understanding of  **dynamic arrays, internal resizing, and OOP concepts**, all of which are foundational to understanding how the  **Java Collections Framework**  works under the hood.

Your custom `MyArrayList` class should support the following methods:

- void add(int element) – Adds an element to the end of the list.
- int get(int index) – Returns the element at the given index.
- int size() – Returns the number of elements in the list.
- void print() – Prints all elements in the list space-separated on a single line.

Internally, use a fixed-size array and  **resize it**  when needed (just like how `ArrayList` does it).

### Input Format
- First line: An integer Q – the number of operations.
- Next Q lines: Each line represents an operation in one of the following formats: add X get X size print

Assume that inputs to `get` are always within bounds.

### Output Format
- For each get operation, output the value at that index.
- For size, print the current size.
- For print, output all elements on a single line, space-separated.
### Sample 1:
Input
Output

```
7
add 10
add 20
add 30
get 1
size
add 40
print
```

```
20
3
10 20 30 40
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:09:36.941Z  

```java
import java.util.*;

class MyArrayList
{
    private int[] arr;
    private int size;

    MyArrayList()
    {
        arr = new int[2];
        size = 0;
    }

    void add(int element)
    {
        if (size == arr.length)
        {
            int[] newArr =
                new int[arr.length * 2];

            for (int i = 0; i < arr.length; i++)
            {
                newArr[i] = arr[i];
            }

            arr = newArr;
        }

        arr[size] = element;
        size++;
    }

    int get(int index)
    {
        return arr[index];
    }

    int size()
    {
        return size;
    }

    void print()
    {
        for (int i = 0; i < size; i++)
        {
            if (i > 0)
            {
                System.out.print(" ");
            }

            System.out.print(arr[i]);
        }

        System.out.println();
    }
}

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        MyArrayList list = new MyArrayList();

        while (q-- > 0)
        {
            String operation = sc.next();

            if (operation.equals("add"))
            {
                int x = sc.nextInt();
                list.add(x);
            }
            else if (operation.equals("get"))
            {
                int index = sc.nextInt();
                System.out.println(list.get(index));
            }
            else if (operation.equals("size"))
            {
                System.out.println(list.size());
            }
            else if (operation.equals("print"))
            {
                list.print();
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LIST06)