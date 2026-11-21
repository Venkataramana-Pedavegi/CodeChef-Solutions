import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<String> products =
                new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            products.add(sc.nextLine());
        }

        ListIterator<String> iterator =
                products.listIterator();

        while (iterator.hasNext())
        {
            String product = iterator.next();

            char firstChar =
                    Character.toUpperCase(
                            product.charAt(0)
                    );

            if (firstChar == 'A' ||
                firstChar == 'E' ||
                firstChar == 'I' ||
                firstChar == 'O' ||
                firstChar == 'U')
            {
                iterator.remove();
            }
            else if (product.length() > 5)
            {
                iterator.set(
                        product.toUpperCase()
                );
            }
        }

        System.out.println(
                "Updated List: " + products
        );

        sc.close();
    }
}