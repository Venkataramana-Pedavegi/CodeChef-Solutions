import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Queue<Integer> queue =
            new ArrayDeque<>();

        while (q-- > 0)
        {
            String operation = sc.next();

            switch (operation)
            {
                case "ADD":
                {
                    int x = sc.nextInt();
                    queue.offer(x);
                    break;
                }

                case "SERVE":
                {
                    if (queue.isEmpty())
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(queue.poll());
                    }

                    break;
                }

                case "FRONT":
                {
                    if (queue.isEmpty())
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(queue.peek());
                    }

                    break;
                }

                case "SIZE":
                {
                    System.out.println(queue.size());
                    break;
                }

                case "EMPTY":
                {
                    System.out.println(queue.isEmpty());
                    break;
                }
            }
        }

        sc.close();
    }
}