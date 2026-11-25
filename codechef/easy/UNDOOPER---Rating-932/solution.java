import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();

            if (operation.equals("PUSH"))
            {
                int value = sc.nextInt();
                stack.push(value);
            }
            else if (operation.equals("POP"))
            {
                if (!stack.isEmpty())
                {
                    stack.pop();
                }
            }
            else if (operation.equals("TOP"))
            {
                if (stack.isEmpty())
                {
                    System.out.println("Empty");
                }
                else
                {
                    System.out.println(stack.peek());
                }
            }
        }

        System.out.print("Final Stack: ");

        if (stack.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            while (!stack.isEmpty())
            {
                System.out.print(stack.pop());

                if (!stack.isEmpty())
                {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }
}