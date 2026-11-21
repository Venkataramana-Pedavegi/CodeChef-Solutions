# LIST05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:10:37.166Z  

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

[View on CodeChef](https://www.codechef.com/problems/LIST05)