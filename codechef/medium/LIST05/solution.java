import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList < String > basket =
            new ArrayList < > ();

        for (int i = 0; i < n; i++)
        {
            String fruit = sc.next();

            basket.add(
                fruit.toLowerCase()
            );
        }

        int m = sc.nextInt();

        int availableCount = 0;

        for (int i = 0; i < m; i++)
        {
            String favorite = sc.next();

            boolean available =
                basket.contains(
                    favorite.toLowerCase()
                );

            System.out.println(
                favorite + ": " + available
            );

            if (available)
            {
                availableCount++;
            }
        }

        System.out.println(
            "Available Favorites: " +
            availableCount
        );


        sc.close();
    }
}