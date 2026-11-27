import java.io.*;
import java.util.*;

class Triplet<T, U, V>
{
    private T first;
    private U second;
    private V third;

    Triplet()
    {
        first = null;
        second = null;
        third = null;
    }

    void setFirst(T value)
    {
        first = value;
    }

    void setSecond(U value)
    {
        second = value;
    }

    void setThird(V value)
    {
        third = value;
    }

    T getFirst()
    {
        return first;
    }

    U getSecond()
    {
        return second;
    }

    V getThird()
    {
        return third;
    }

    boolean isComplete()
    {
        return first != null &&
               second != null &&
               third != null;
    }

    void reset()
    {
        first = null;
        second = null;
        third = null;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        Triplet<Integer, String, Double> triplet =
            new Triplet<>();

        while (q-- > 0)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();

            if (operation.equals("FIRST"))
            {
                int value =
                    Integer.parseInt(st.nextToken());

                triplet.setFirst(value);
            }
            else if (operation.equals("SECOND"))
            {
                String value = st.nextToken();

                triplet.setSecond(value);
            }
            else if (operation.equals("THIRD"))
            {
                double value =
                    Double.parseDouble(st.nextToken());

                triplet.setThird(value);
            }
            else if (operation.equals("CHECK"))
            {
                System.out.println(
                    triplet.isComplete()
                    ? "Complete"
                    : "Incomplete"
                );
            }
            else if (operation.equals("PRINT"))
            {
                System.out.println(
                    triplet.getFirst() + " " +
                    triplet.getSecond() + " " +
                    triplet.getThird()
                );
            }
            else if (operation.equals("RESET"))
            {
                triplet.reset();
            }
        }
    }
}