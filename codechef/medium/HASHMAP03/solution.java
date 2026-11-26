import java.util.*;

public class Main
{
    public static List<Map.Entry<String, Integer>>
        sortMapByValueDescending(
            HashMap<String, Integer> map)
    {
        List<Map.Entry<String, Integer>> list =
            new ArrayList<>(map.entrySet());

        list.sort(
            (a, b) ->
            {
                int scoreCompare =
                    Integer.compare(
                        b.getValue(),
                        a.getValue()
                    );

                if (scoreCompare != 0)
                {
                    return scoreCompare;
                }

                return a.getKey()
                        .compareTo(b.getKey());
            }
        );

        return list;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        HashMap<String, Integer> map =
            new HashMap<>();

        for (int i = 0; i < n; i++)
        {
            String username = sc.next();
            int score = sc.nextInt();

            map.put(username, score);
        }

        List<Map.Entry<String, Integer>> sortedList =
            sortMapByValueDescending(map);

        for (Map.Entry<String, Integer> entry
                : sortedList)
        {
            System.out.println(
                entry.getKey() + ": " +
                entry.getValue()
            );
        }

        sc.close();
    }
}