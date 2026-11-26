# JAVASETMCQ3

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### TreeSet - MCQ

Which statement about TreeSet in Java is correct?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:09:32.618Z  

```cpp
import java.io.*;
import java.util.*;

class Student
{
    int id;
    String name;
    int score;

    Student(int id, String name, int score)
    {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if (!(obj instanceof Student))
        {
            return false;
        }

        Student other = (Student) obj;

        return this.id == other.id;
    }

    @Override
    public int hashCode()
    {
        // TODO:
        // Generate hash code using only student ID.
         return Integer.hashCode(id);

        
    }
}

class StudentRegistry
{
    private LinkedHashSet<Student> students;

    StudentRegistry()
    {
        students = new LinkedHashSet<>();
    }

    void addStudent(int id, String name, int score)
    {
        // TODO:
        // Add the student if the ID does not already exist.
        Student student = new Student(id, name, score);

        students.add(student);
    }

    void removeStudent(int id)
    {
        // TODO:
        // Remove the student with the given ID.
         Student student = new Student(id, "", 0);

        students.remove(student);
    }

    boolean containsStudent(int id)
    {
      Student student = new Student(id, "", 0);

        return students.contains(student);
    }

    void printInsertionOrder()
    {
        // TODO:
        // Print students in insertion order.
         System.out.println("Insertion Order:");

        if (students.isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        for (Student student : students)
        {
            System.out.println(
                student.id + " " +
                student.name + " " +
                student.score
            );
        }
    }

    void printScoreOrder()
    {
        // TODO:
        // Use TreeSet with a custom Comparator.
        //
        // Sort by:
        // 1. Score descending
        // 2. ID ascending
        System.out.println("Score Order:");

        if (students.isEmpty())
        {
            System.out.println("Empty");
            return;
        }

        TreeSet<Student> sortedStudents =
            new TreeSet<>(
                new Comparator<Student>()
                {
                    @Override
                    public int compare(Student s1, Student s2)
                    {
                        if (s1.score != s2.score)
                        {
                            return Integer.compare(
                                s2.score,
                                s1.score
                            );
                        }

                        return Integer.compare(
                            s1.id,
                            s2.id
                        );
                    }
                }
            );

        sortedStudents.addAll(students);

        for (Student student : sortedStudents)
        {
            System.out.println(
                student.id + " " +
                student.name + " " +
                student.score
            );
        }
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        StudentRegistry registry = new StudentRegistry();

        while (q-- > 0)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();

            if (operation.equals("ADD"))
            {
                int id = Integer.parseInt(st.nextToken());
                String name = st.nextToken();
                int score = Integer.parseInt(st.nextToken());

                registry.addStudent(id, name, score);
            }
            else if (operation.equals("REMOVE"))
            {
                int id = Integer.parseInt(st.nextToken());

                registry.removeStudent(id);
            }
            else if (operation.equals("CHECK"))
            {
                int id = Integer.parseInt(st.nextToken());

                if (registry.containsStudent(id))
                {
                    System.out.println("PRESENT");
                }
                else
                {
                    System.out.println("ABSENT");
                }
            }
        }

        registry.printInsertionOrder();
        registry.printScoreOrder();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASETMCQ3)