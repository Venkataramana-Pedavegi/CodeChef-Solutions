# JAVASORT01 - Rating 1650

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sort Students by Marks

You are given details of $N$ students. Each student has a name and marks.

Sort the students using a  **lambda expression**  according to the following rules:

- Higher marks should come first.
- If two students have the same marks, sort their names in alphabetical order.
### Input Format
- The first line contains an integer $N$.
- The next $N$ lines contain a student name and marks.
### Output Format

Print the students in sorted order as:

```
name marks

```

### Sample 1:
Input
Output

```
5
Alice 85
Bob 92
Charlie 85
David 70
Emma 92
```

```
Bob 92
Emma 92
Alice 85
Charlie 85
David 70
```

### Explanation:

The frequencies are: 1 appears once, 2 appears twice, and 3 appears once.

Sorting primarily by frequency, integers 1 and 3 (each appearing once) come before 2 (appearing twice). Since 1 and 3 have the same frequency, they are sorted by their value, resulting in 1 before 3.

The final sorted list is: 1, 3, 2, 2.

### Sample 2:
Input
Output

```
4
2 1 1 1
```

```
2 1 1 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:50:42.444Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
    String name;
    int marks;

    Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }
}

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            String name = sc.next();
            int marks = sc.nextInt();

            students.add(new Student(name, marks));
        }

        students.sort((a, b) ->
        {
            if (a.marks != b.marks)
            {
                return Integer.compare(b.marks, a.marks);
            }

            return a.name.compareTo(b.name);
        });

        for (Student student : students)
        {
            System.out.println(
                student.name + " " + student.marks
            );
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASORT01)