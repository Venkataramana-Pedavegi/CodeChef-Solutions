import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            words.add(sc.next());
        }

        int removedCount = 0;

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext())
        {
            String word = iterator.next();

            boolean remove = false;

            // Rule 1: Length less than K
            if (word.length() < k)
            {
                remove = true;
            }

            // Rule 2: Contains a digit
            if (!remove)
            {
                for (int i = 0; i < word.length(); i++)
                {
                    if (Character.isDigit(word.charAt(i)))
                    {
                        remove = true;
                        break;
                    }
                }
            }

            // Rule 3: Same first and last character
            if (!remove)
            {
                char first =
                        Character.toLowerCase(
                                word.charAt(0)
                        );

                char last =
                        Character.toLowerCase(
                                word.charAt(
                                        word.length() - 1
                                )
                        );

                if (first == last)
                {
                    remove = true;
                }
            }

            if (remove)
            {
                iterator.remove();
                removedCount++;
            }
        }

        System.out.println("Final List: " + words);
        System.out.println("Removed Words: " + removedCount);

        sc.close();
    }
}