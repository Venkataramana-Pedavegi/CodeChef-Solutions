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