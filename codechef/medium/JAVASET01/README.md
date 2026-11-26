# JAVASET01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Performance Registry

A college maintains a registry of currently enrolled students.

Each student has:

- A unique student $ID$
- A name
- A score

The registry must support adding students, removing students, and checking whether a student is currently registered.

A student is considered unique based  **only on the student ID**.

You are given $Q$ operations of the following types:

- ADD ID Name Score : Add the student to the registry.
- REMOVE ID : Remove the student with the given ID.
- CHECK ID : Check whether the student is currently registered.

 **Operation Rules** 

 **`ADD ID Name Score`** 

Add the student to the registry. If another student with the same $ID$ is already present, the operation must be ignored. The existing student's name and score must not be modified.

 **`REMOVE ID`** 

Remove the student with the given $ID$. If the student does not exist, do nothing.

 **`CHECK ID`** 

Print:

```
PRESENT

```

if the student is currently registered. Otherwise, print:

```
ABSENT

```

 **Re-Insertion Rule** 

If a student is removed and later added again, the new record is treated as a fresh insertion. For example:

```
ADD 10 Rahul 80
REMOVE 10
ADD 10 Rohan 95

```

The final record for student ID $10$ will be:

```
10 Rohan 95

```

and it will appear according to its new insertion position.

### Input Format
- The first line contains an integer $Q$, representing the number of operations.
- Each of the next $Q$ lines contains one of the following operations:

```
ADD ID Name Score
REMOVE ID
CHECK ID

```

### Output Format

For every `CHECK` operation, print either:

```
PRESENT

```

or:

```
ABSENT

```

After processing all operations, print:

```
Insertion Order:

```

followed by the active students in insertion order.

Then print:

```
Score Order:

```

followed by the active students sorted by score in descending order and student ID in ascending order.

If the registry is empty, print `Empty` under the corresponding section.

### Sample 1:
Input
Output

```
8
ADD 101 Alice 85
ADD 102 Bob 92
CHECK 101
ADD 101 Carol 99
REMOVE 102
CHECK 102
ADD 103 David 92
CHECK 103
```

```
PRESENT
ABSENT
PRESENT
Insertion Order:
101 Alice 85
103 David 92
Score Order:
103 David 92
101 Alice 85
```

### Explanation:

Student `101 Alice 85` is added successfully.

Student `102 Bob 92` is then added.

The first `CHECK 101` prints `PRESENT`.

The operation:

```
ADD 101 Carol 99

```

is ignored because student ID $101$ already exists. Therefore, Alice's record is not replaced.

Student $102$ is removed, so `CHECK 102` prints `ABSENT`.

Finally, student $103$ is added.

The insertion order is therefore:

```
101 Alice 85
103 David 92

```

When sorted by score, David comes before Alice because $92 > 85$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:09:13.417Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/JAVASET01)