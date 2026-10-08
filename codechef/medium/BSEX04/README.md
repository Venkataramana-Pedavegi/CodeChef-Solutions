# BSEX04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Next Possible Event

You are organizing a series of events, each with a specific start and end time, given as `events[i] = [start_i, end_i]`. Each event has a unique start time.

For each event $i$, you need to find the next possible event $j$ such that:

- The start time of event $j$ is greater than or equal to the end time of event $i$ (i.e., $start_j \geq end_i$).
- Among such events, you must select the event with the earliest start time.

If no such event exists, return `-1` for that event.

### Input Format
- First line of input contains a single positive integer N - the number of events.
- Next N lines contain two space separated integers each - the start and end time of each event.
### Output Format
- Output N space separated integers - the answer for each event.
### Constraints
- $1 \leq N \leq 10^5$
- $0 \leq \text{start}_i \leq \text{end}_i \leq 10^9$
- Each start time is unique.
### Sample 1:
Input
Output

```
3
3 4
2 3
1 2
```

```
-1 0 1
```

### Explanation:
- For the first event [3,4], there is no next event that starts after or at time 4, so the output is -1.
- For the second event [2,3], the next event is [3,4] because its start time (3) is equal to the end time of [2,3]. Thus, the index is 0.
- For the third event [1,2], the next event is [2,3] because its start time (2) is equal to the end time of [1,2]. Thus, the index is 1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:35:09.964Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX04)