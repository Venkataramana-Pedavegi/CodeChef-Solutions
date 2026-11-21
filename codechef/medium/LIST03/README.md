# LIST03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Eligibility Report

A school maintains student records containing a student's name and age. The records are stored as `Student` objects inside an `ArrayList`.

You are given details of $N$ students. After storing all records, process the collection and generate a report containing:

- The names of all students whose age is at least $18$, in the same order in which they were entered.
- The number of students younger than $18$.
- The name and age of the oldest student.

If more than one student has the maximum age, report the student who appeared first in the input.

### Task
- Complete the collection-processing portion of the program.
- The input handling and creation of Student objects are already provided. Use the stored Student objects to generate the required report.
### Input Format
- The first line contains an integer $N$, the number of students.
- The next $N$ lines each contain: A student name The student's age (space-separated)
### Output Format

First print:

`Eligible Students:`

Then print the name of every student whose age is at least $18$, one per line.

Finally, print:

`Minor Count: <count>`
`Oldest Student: <name> <age>`

### Sample 1:
Input
Output

```
6
Aman 17
Riya 20
Karan 19
Neha 16
Arjun 22
Meera 22
```

```
Eligible Students:
Riya
Karan
Arjun
Meera
Minor Count: 2
Oldest Student: Arjun 22
```

### Explanation:

Riya, Karan, Arjun, and Meera are at least $18$ years old.There are $2$ students below the age of $18$ (Aman and Neha).Both Arjun and Meera have the maximum age ($22$). Since Arjun appears first in the input, he is reported as the oldest student.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:10:30.601Z  

```java
import java.util.*;

class Student {
    private String name;
    private int age;
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList < Student > students = new ArrayList < > ();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            students.add(new Student(name, age));
        } 
        
        int minorCount = 0;
        Student oldestStudent = null;

        System.out.println("Eligible Students:");

        for (Student student : students)
        {
            if (student.getAge() >= 18)
            {
                System.out.println(
                        student.getName()
                );
            }
            else
            {
                minorCount++;
            }

            if (oldestStudent == null ||
                student.getAge() >
                oldestStudent.getAge())
            {
                oldestStudent = student;
            }
        }

        System.out.println(
                "Minor Count: " + minorCount
        );

        System.out.println(
                "Oldest Student: " +
                oldestStudent.getName() +
                " " +
                oldestStudent.getAge()
        );
        
        sc.close();
    }

}
```

---

[View on CodeChef](https://www.codechef.com/problems/LIST03)