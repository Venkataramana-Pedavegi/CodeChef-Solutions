import java.util.*;
import java.util.concurrent.*;

class Worker extends Thread
{
    private BlockingQueue<Integer> queue;
    private int numberOfJobs;

    private int processed = 0;
    private long result = 0;

    Worker(BlockingQueue<Integer> queue, int numberOfJobs)
    {
        this.queue = queue;
        this.numberOfJobs = numberOfJobs;
    }

    public void run()
    {
        try
        {
            for (int i = 0; i < numberOfJobs; i++)
            {
                int value = queue.take();

                result += (long) value * value;
                processed++;
            }
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
    }

    int getProcessed()
    {
        return processed;
    }

    long getResult()
    {
        return result;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BlockingQueue<Integer> queue =
                new LinkedBlockingQueue<>();

        for (int i = 0; i < n; i++)
        {
            queue.put(sc.nextInt());
        }

        Worker worker = new Worker(queue, n);

        worker.start();
        worker.join();

        System.out.println("Processed: " + worker.getProcessed());
        System.out.println("Result: " + worker.getResult());

        sc.close();
    }
}