import java.util.*;

class Patient
{
    String name;
    int priority;
    int arrivalOrder;

    Patient(String name, int priority, int arrivalOrder)
    {
        this.name = name;
        this.priority = priority;
        this.arrivalOrder = arrivalOrder;
    }
}

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Patient> queue =
                new PriorityQueue<>(
                    (p1, p2) ->
                    {
                        if (p1.priority != p2.priority)
                        {
                            return Integer.compare(
                                    p1.priority,
                                    p2.priority
                            );
                        }

                        return Integer.compare(
                                p1.arrivalOrder,
                                p2.arrivalOrder
                        );
                    }
                );

        for (int i = 0; i < n; i++)
        {
            String name = sc.next();
            int priority = sc.nextInt();

            queue.offer(
                    new Patient(
                            name,
                            priority,
                            i
                    )
            );
        }

        while (!queue.isEmpty())
        {
            Patient patient = queue.poll();

            System.out.println(
                    patient.name + " " +
                    patient.priority
            );
        }

        sc.close();
    }
}