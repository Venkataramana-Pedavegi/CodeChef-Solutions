import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Deque<Integer> deque =
            new ArrayDeque<>();

        while (q-- > 0)
        {
            String operation = sc.next();

            switch (operation)
            {
                case "ADD_FRONT":
                {
                    int x = sc.nextInt();
                    deque.addFirst(x);
                    break;
                }

                case "ADD_REAR":
                {
                    int x = sc.nextInt();
                    deque.addLast(x);
                    break;
                }

                case "REMOVE_FRONT":
                {
                    Integer value =
                        deque.pollFirst();

                    if (value == null)
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(value);
                    }

                    break;
                }

                case "REMOVE_REAR":
                {
                    Integer value =
                        deque.pollLast();

                    if (value == null)
                    {
                        System.out.println("EMPTY");
                    }
                    else
                    {
                        System.out.println(value);
                    }

                    break;
                }
            }
        }

        sc.close();
    }
}