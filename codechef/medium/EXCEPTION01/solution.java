import java.util.*;
import java.lang.*;
import java.io.*;

class InvalidAgeException extends RuntimeException
{
    public InvalidAgeException(String message)
    {
        super(message);
    }
}

class Person
{
    private int age;

    public void setAge(int age)
    {
        if (age < 0 || age > 120)
        {
            throw new InvalidAgeException("Invalid Age");
        }

        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
}

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        Person person = new Person();

        try
        {
            person.setAge(age);
            System.out.println("Age Accepted: " + person.getAge());
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}