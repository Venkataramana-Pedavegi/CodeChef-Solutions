# OOPSFUND20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Grade and Attendance Management

A university maintains academic records for two categories of students:  **Undergraduate (UG)**  and  **Postgraduate (PG)**.

Each student has an academic score and an attendance percentage. However, the grading criteria and minimum attendance requirements differ for UG and PG students.

Your task is to implement a student management system using abstraction, inheritance, method overriding, and runtime polymorphism.

 **1. Student Interface** 

- Create an abstract type named Student that declares the following two public methods: MethodReturn typeDescriptionDisplay_Grade()StringReturn the student's grade based on their academic scoreAttendance()StringReturn Eligible or Not Eligible based on the attendance requirement
- The Student type must define the common method contract without providing the grading or attendance logic. It must not be instantiated directly.

 **2. UG_Students Class** 

- Create a class named UG_Students that implements the Student contract.
- It must contain two private data members: score — Integer attendance — Integer
- Implement a constructor UG_Students(score, attendance) that initializes both members.
- Implement Display_Grade() according to the following rules: ScoreGrade80–100A60–79B40–59C0–39F
- Implement Attendance() to return: Eligible if attendance is at least 75%. Not Eligible otherwise.

 **3. PG_Students Class** 

- Create a class named PG_Students that implements the Student contract.
- It must contain two private data members: score - Integer attendance - Integer
- Implement a constructor PG_Students(score, attendance) that initializes both members.
- Implement Display_Grade() according to the following rules: ScoreGrade85–100A70–84B50–69C0–49F
- Implement Attendance() to return: Eligible if attendance is at least 80%. Not Eligible otherwise.

 **Implementation Requirements** 

- Implement the complete Student, UG_Students, and PG_Students types.
- Keep the specified data members private.
- Make both methods public in the implementing classes.
- Use inheritance or interface implementation to establish the required relationship.
- Implement runtime polymorphism so both student types can be accessed through the common Student type.
- The methods must return strings rather than printing output.
- Write all required types in the provided single source file.
- Do not modify the locked main() function.

The common student contract must be implemented using the abstraction mechanism supported by the chosen programming language.

### Input Format

The first line contains an integer `T`, denoting the number of students.

Each of the next `T` lines contains three space-separated values:

`type score attendance`

Where:

- type is either UG or PG.
- score is the student's academic score.
- attendance is the student's attendance percentage.
### Output Format

For each student, print exactly one line containing:

`type Grade: G Attendance: S`

Where:

- type is UG or PG, as supplied in the input.
- G is the grade returned by Display_Grade().
- S is Eligible or Not Eligible, as returned by Attendance().
### Constraints
- $1 \le T \le 500$
- $0 \le \text{score} \le 100$
- $0 \le \text{attendance} \le 100$
- type is either UG or PG.
### Sample 1:
Input
Output

```
6
UG 85 90
PG 82 85
UG 55 70
PG 45 90
UG 60 75
PG 90 79
```

```
UG Grade: A Attendance: Eligible
PG Grade: B Attendance: Eligible
UG Grade: C Attendance: Not Eligible
PG Grade: F Attendance: Eligible
UG Grade: B Attendance: Eligible
PG Grade: A Attendance: Not Eligible
```

### Explanation:

For the first student, the UG score of 85 corresponds to grade A, and attendance of 90% satisfies the UG requirement of 75%.

For the second student, the PG score of 82 corresponds to grade B, and attendance of 85% satisfies the PG requirement of 80%.

For the third student, the UG score of 55 corresponds to grade C, but attendance of 70% is insufficient.

For the sixth student, the PG score of 90 corresponds to grade A, but attendance of 79% is below the required 80%.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:32:53.425Z  

```java
import java.util.*;

// Implement the following types:
// 1. Student
// 2. UG_Students
// 3. PG_Students
interface Student {
    String Display_Grade();
    String Attendance();
}

class UG_Students implements Student {
    private int score;
    private int attendance;

    public UG_Students(int score, int attendance) {
        this.score = score;
        this.attendance = attendance;
    }

    @Override
    public String Display_Grade() {
        if (score >= 80) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String Attendance() {
        return attendance >= 75 ? "Eligible" : "Not Eligible";
    }
}

class PG_Students implements Student {
    private int score;
    private int attendance;

    public PG_Students(int score, int attendance) {
        this.score = score;
        this.attendance = attendance;
    }

    @Override
    public String Display_Grade() {
        if (score >= 85) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String Attendance() {
        return attendance >= 80 ? "Eligible" : "Not Eligible";
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            int score = sc.nextInt();
            int attendance = sc.nextInt();

            Student student;

            if (type.equals("UG")) {
                student = new UG_Students(
                    score, attendance
                );
            } else {
                student = new PG_Students(
                    score, attendance
                );
            }

            output.append(type)
                  .append(" Grade: ")
                  .append(student.Display_Grade())
                  .append(" Attendance: ")
                  .append(student.Attendance())
                  .append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND20)