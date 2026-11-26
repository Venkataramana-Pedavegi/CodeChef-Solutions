# HASHMAP08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ordered Student Registry

A college stores student names and their marks in the order in which the students are registered.

You are given $Q$ operations. Maintain the student records using a `LinkedHashMap`.

Each operation can be one of the following:

- ADD name marks : Add a new student. If the student already exists, update their marks without changing their position.
- REMOVE name : Remove the student if present.
- GET name : Print the marks of the student. If the student does not exist, print Not Found.
- DISPLAY : Print all students and their marks in their current insertion order.

If a student is removed and later added again, the student should appear at the  **end**  of the order.

### Input Format
- The first line contains an integer $Q$.
- The next $Q$ lines contain one operation each.
### Output Format

For every `GET` operation:

- Print the student's marks if found.
- Otherwise, print Not Found.

For every `DISPLAY` operation:

- Print each record as:

```
name marks

```

If there are no students, print:

```
Empty

```

### Sample 1:
Input
Output

```
10
ADD Alice 85
ADD Bob 90
ADD Charlie 75
ADD Alice 95
DISPLAY
REMOVE Bob
ADD David 88
ADD Bob 92
GET Charlie
DISPLAY
```

```
Alice 95
Bob 90
Charlie 75
75
Alice 95
Charlie 75
David 88
Bob 92
```

### Explanation:

Initially, the insertion order is:

```
Alice, Bob, Charlie

```

Updating Alice's marks does not change her position.

After removing Bob and adding him again, Bob becomes the most recently inserted student:

```
Alice, Charlie, David, Bob

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:17:40.463Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/HASHMAP08)