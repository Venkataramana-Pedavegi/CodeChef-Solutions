import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] events = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            events[i][0] = sc.nextInt(); // start
            events[i][1] = sc.nextInt(); // end
        }

        // Store start time and original index
        int[][] starts = new int[n][2];

        for (int i = 0; i < n; i++)
        {
            starts[i][0] = events[i][0];
            starts[i][1] = i;
        }

        // Sort by start time
        Arrays.sort(starts, (a, b) -> Integer.compare(a[0], b[0]));

        int[] answer = new int[n];

        for (int i = 0; i < n; i++)
        {
            int endTime = events[i][1];

            int low = 0;
            int high = n - 1;
            int result = -1;

            // Lower bound: first start >= endTime
            while (low <= high)
            {
                int mid = low + (high - low) / 2;

                if (starts[mid][0] >= endTime)
                {
                    result = starts[mid][1];
                    high = mid - 1;
                }
                else
                {
                    low = mid + 1;
                }
            }

            answer[i] = result;
        }

        // Print answer
        for (int i = 0; i < n; i++)
        {
            System.out.print(answer[i] + " ");
        }

        sc.close();
    }
}