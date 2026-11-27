import java.util.*;
import java.util.stream.*;

class Codechef
{
    static int calculateTotalCost(Stream<int[]> data)
    {
        return data
            .mapToInt(values ->
            {
                int m = values[0];
                int y = values[1];

                return ((m + 3) / 4) * y;
            })
            .findFirst()
            .orElse(0);

    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int y = sc.nextInt();

        Stream<int[]> data =
            Stream.of(new int[]{m, y});

        System.out.println(
            calculateTotalCost(data)
        );

        sc.close();
    }
}