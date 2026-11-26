import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        TreeMap<Integer, String> scores = new TreeMap<>();

        for (int i = 0; i < n; i++)
        {
            String name = sc.next();
            int score = sc.nextInt();

            scores.put(score, name);
        }

        int q = sc.nextInt();

        while (q-- > 0)
        {
            int x = sc.nextInt();

            Integer lower = scores.lowerKey(x);
            Integer higher = scores.higherKey(x);

            if (lower == null)
            {
                System.out.println("Lower: None");
            }
            else
            {
                System.out.println(
                    "Lower: " + scores.get(lower) + " " + lower
                );
            }

            if (higher == null)
            {
                System.out.println("Higher: None");
            }
            else
            {
                System.out.println(
                    "Higher: " + scores.get(higher) + " " + higher
                );
            }
        }

        sc.close();
    }
}