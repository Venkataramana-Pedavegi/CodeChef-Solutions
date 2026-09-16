import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0)
        {
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();

            // Store frequency
            for (int i = 0; i < n; i++)
            {
                int x = sc.nextInt();
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            // Get all elements
            ArrayList<Integer> list = new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet())
            {
                int value = entry.getKey();
                int frequency = entry.getValue();

                for (int i = 0; i < frequency; i++)
                {
                    list.add(value);
                }
            }

            // Sort the elements
            Collections.sort(list);

            // Swap adjacent elements
            for (int i = 1; i < n - 1; i += 2)
            {
                int temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }

            // Print
            for (int x : list)
            {
                System.out.print(x + " ");
            }

            System.out.println();
        }

        sc.close();

	}
}
