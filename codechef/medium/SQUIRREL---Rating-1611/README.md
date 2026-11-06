# SQUIRREL - Rating 1611

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Squirrel and chestnut

There are n squirrel(s) waiting below the feet of m chestnut tree(s). The first chestnut of the i-th tree will fall right after Ti second(s), and one more every Pi second(s) after that. The “big mama” of squirrels wants them to bring their nest no less than k chestnuts to avoid the big storm coming, as fast as possible! So they are discussing to wait below which trees to take enough chestnuts in the shortest time. Time to move to the positions is zero, and the squirrels move nowhere after that.

### Request
Calculate the shortest time (how many seconds more) the squirrels can take enough chestnuts.
### Input

- The first line contains an integer t, the number of test cases, for each: The first line contains the integers m,n,k, respectively. The second line contains the integers Ti (i=1..m), respectively. The third line contains the integers Pi (i=1..m), respectively.
 ***(Each integer on a same line is separated by at least one space character, there is no added line between test cases)** *
### Output

For each test cases, output in a single line an integer which is the shortest time calculated.

### Constraints
- $0 \lt t \leq 20$
- $0 \lt m, n \leq 10,000$
- $0 \lt k \leq 10^7$
- $0 \lt T_i, P_i \leq 100$
### Sample 1:
Input
Output

```
2
3 2 5
5 1 2
1 2 1
3 2 5
5 1 2
1 1 1
```

```
4
3
```

### Explanation:

 **Test case $1$:**  Two squirrels wait below trees $2$ and $3$.

- After $1$ second, a chestnut from tree $2$ falls. Total chestnuts the squirrels have is $1$.
- After $2$ seconds, a chestnut from tree $3$ falls. Total chestnuts the squirrels have is $2$.
- After $3$ seconds, two chestnuts fall from trees $2$ and $3$. Total chestnuts the squirrels have is $4$.
- After $4$ seconds, a chestnut from tree $3$ falls. Total chestnuts the squirrels have is $5$.

Total time to gather $5$ chestnuts is $4$ seconds.

 **Test case $2$:**  Two squirrels wait below trees $2$ and $3$.

- After $1$ second, a chestnut from tree $2$ falls. Total chestnuts the squirrels have is $1$.
- After $2$ seconds, two chestnuts fall from trees $2$ and $3$. Total chestnuts the squirrels have is $3$.
- After $3$ seconds, two chestnuts fall from trees $2$ and $3$. Total chestnuts the squirrels have is $5$.

Total time to gather $5$ chestnuts is $3$ seconds.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:43:01.324Z  

```java
import java.io.*;
import java.util.*;

class Codechef {
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        FastScanner fs = new FastScanner();
        String token = fs.next();
        if (token == null) return;
        int t = Integer.parseInt(token);

        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int m = fs.nextInt();
            int n = fs.nextInt();
            long k = fs.nextLong();

            long[] T = new long[m];
            for (int i = 0; i < m; i++) {
                T[i] = fs.nextLong();
            }

            long[] P = new long[m];
            for (int i = 0; i < m; i++) {
                P[i] = fs.nextLong();
            }

            long low = 0;
            long high = 2_000_000_000L;
            long ans = high;

            long[] count = new long[m];

            while (low <= high) {
                long mid = low + (high - low) / 2;

                for (int i = 0; i < m; i++) {
                    if (mid >= T[i]) {
                        count[i] = 1 + (mid - T[i]) / P[i];
                    } else {
                        count[i] = 0;
                    }
                }

                Arrays.sort(count);

                long collected = 0;
                int pick = Math.min(n, m);
                for (int i = 0; i < pick; i++) {
                    collected += count[m - 1 - i];
                    if (collected >= k) break;
                }

                if (collected >= k) {
                    ans = mid;
                    high = mid - 1; // Try to find a smaller feasible time
                } else {
                    low = mid + 1;
                }
            }

            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SQUIRREL)