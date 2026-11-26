# JHASHMAPMCQ3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### TreeMap - MCQ

What is the main feature of TreeMap?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:18:09.927Z  

```cpp
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        LinkedHashMap<String, Integer> students = new LinkedHashMap<>();

        while (q-- > 0)
        {
            String operation = sc.next();

            if (operation.equals("ADD"))
            {
                String name = sc.next();
                int marks = sc.nextInt();

                students.put(name, marks);
            }
            else if (operation.equals("REMOVE"))
            {
                String name = sc.next();

                students.remove(name);
            }
            else if (operation.equals("GET"))
            {
                String name = sc.next();

                if (students.containsKey(name))
                {
                    System.out.println(students.get(name));
                }
                else
                {
                    System.out.println("Not Found");
                }
            }
            else if (operation.equals("DISPLAY"))
            {
                if (students.isEmpty())
                {
                    System.out.println("Empty");
                }
                else
                {
                    for (Map.Entry<String, Integer> entry : students.entrySet())
                    {
                        System.out.println(
                            entry.getKey() + " " + entry.getValue()
                        );
                    }
                }
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JHASHMAPMCQ3)