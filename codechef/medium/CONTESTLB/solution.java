import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

class Contestant
{
    String name;
    int solved;
    long penalty;

    Contestant(String name, int solved, long penalty)
    {
        this.name = name;
        this.solved = solved;
        this.penalty = penalty;
    }
}

class Codechef
{
    static List<String> rankContestants(
        Stream<Contestant> contestants)
    {
            List<Contestant> sorted =
            contestants
                .sorted(
                    Comparator
                        .comparingInt(
                            (Contestant c) -> c.solved
                        )
                        .reversed()
                        .thenComparingLong(
                            c -> c.penalty
                        )
                        .thenComparing(
                            c -> c.name
                        )
                )
                .collect(Collectors.toList());

        AtomicInteger position =
            new AtomicInteger(0);

        AtomicInteger currentRank =
            new AtomicInteger(0);

        int[] previousSolved =
            {Integer.MIN_VALUE};

        long[] previousPenalty =
            {Long.MIN_VALUE};

        return sorted.stream()
            .map(c ->
            {
                int pos =
                    position.incrementAndGet();

                if (pos == 1 ||
                    c.solved != previousSolved[0] ||
                    c.penalty != previousPenalty[0])
                {
                    currentRank.set(pos);
                }

                previousSolved[0] = c.solved;
                previousPenalty[0] = c.penalty;

                return currentRank.get()
                    + " " + c.name;
            })
            .collect(Collectors.toList());

    }

    public static void main(String[] args)
        throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        int n = Integer.parseInt(br.readLine());

        List<Contestant> contestants =
            new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int solved =
                Integer.parseInt(st.nextToken());
            long penalty =
                Long.parseLong(st.nextToken());

            contestants.add(
                new Contestant(
                    name,
                    solved,
                    penalty
                )
            );
        }

        List<String> result =
            rankContestants(
                contestants.stream()
            );

        result.forEach(System.out::println);
    }
}