import java.util.*;

class MyRunnable implements Runnable
{
    private final int n;
    private final StringBuilder output;

    MyRunnable(int n)
    {
        this.n = n;
        this.output = new StringBuilder();
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= n; i++)
        {
            output.append("RunnableTask - Count: ")
                  .append(i)
                  .append("\n");
        }
    }

    String getOutput()
    {
        return output.toString();
    }
}

class MyThread extends Thread
{
    private final int n;
    private final StringBuilder output;

    MyThread(int n)
    {
        this.n = n;
        this.output = new StringBuilder();
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= n; i++)
        {
            output.append("ThreadTask - Count: ")
                  .append(i)
                  .append("\n");
        }
    }

    String getOutput()
    {
        return output.toString();
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        MyRunnable runnableTask =
            new MyRunnable(n);

        Thread runnableThread =
            new Thread(runnableTask);

        MyThread threadTask =
            new MyThread(n);

        runnableThread.start();
        threadTask.start();

        runnableThread.join();
        threadTask.join();

        System.out.print(runnableTask.getOutput());
        System.out.print(threadTask.getOutput());

        System.out.println("Both threads completed.");

        sc.close();
    }
}