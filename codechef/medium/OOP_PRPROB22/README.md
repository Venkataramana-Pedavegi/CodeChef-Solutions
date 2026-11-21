# OOP_PRPROB22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Grade and Marksheet Using Multithreading

Create a Java program that uses the `Runnable` interface to execute two tasks using separate threads.

The first task receives the student's marks $M$ and prints the corresponding grade:

- If $80 \le M \le 100$, print Grade A.
- Otherwise, print Other Grade.

The second task prints `Students Marksheet`.

The  **grade thread must finish completely before the marksheet thread starts**.

#### Tasks

You must:

- Implement both tasks using the Runnable interface.
- Create separate Thread objects for both tasks.
- Start the grade thread first.
- Start the marksheet thread only after the grade thread has completed.
#### Output Format

Print two lines:

- The grade determined from $M$.
- Students Marksheet
### Sample 1:
Input
Output

```
80
```

```
Grade A
Students Marksheet
```

### Explanation:

Since $M = 80$, the first thread prints `Grade A`.

The main thread waits for the first thread using `join()`. After it finishes, the second thread starts and prints `Students Marksheet`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:02:02.492Z  

```java
import java.util.Scanner;

class GradeTask implements Runnable
{
    private final int marks;

    GradeTask(int marks)
    {
        this.marks = marks;
    }

    @Override
    public void run()
    {
        if (marks >= 80 && marks <= 100)
        {
            System.out.println("Grade A");
        }
        else
        {
            System.out.println("Other Grade");
        }
    }
}

class MarksheetTask implements Runnable
{
    @Override
    public void run()
    {
        System.out.println("Students Marksheet");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int marks = scanner.nextInt();

        Thread gradeThread =
            new Thread(new GradeTask(marks));

        Thread marksheetThread =
            new Thread(new MarksheetTask());

        try
        {
            gradeThread.start();
            gradeThread.join();

            marksheetThread.start();
            marksheetThread.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OOP_PRPROB22)