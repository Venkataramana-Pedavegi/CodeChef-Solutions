import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> currentSet = new TreeSet<>();

        for (int i = 0; i < n; i++)
        {
            currentSet.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();
            int k = sc.nextInt();

            Set<Integer> otherSet = new HashSet<>();

            for (int j = 0; j < k; j++)
            {
                otherSet.add(sc.nextInt());
            }

            if (operation.equals("UNION"))
            {
                currentSet.addAll(otherSet);
            }
            else if (operation.equals("INTERSECTION"))
            {
                currentSet.retainAll(otherSet);
            }
            else if (operation.equals("DIFFERENCE"))
            {
                currentSet.removeAll(otherSet);
            }

            System.out.println("Size: " + currentSet.size());
        }

        System.out.print("Final Set: ");

        if (currentSet.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            boolean first = true;

            for (int value : currentSet)
            {
                if (!first)
                {
                    System.out.print(" ");
                }

                System.out.print(value);
                first = false;
            }

            System.out.println();
        }

        sc.close();
    }
}