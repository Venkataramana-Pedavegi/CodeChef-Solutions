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