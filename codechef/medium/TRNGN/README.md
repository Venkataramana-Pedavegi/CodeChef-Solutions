# TRNGN

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Training Range

You are given $N$ tracks, where the $i$-th track contains $A_i$ sections.

For each query, you are given two integers $L$ and $U$. Isaac starts from track $L$ and chooses an ending track $R$ such that $L \le R \le N$. He completes every section of tracks $L,L+1,\ldots,R$.

Suppose he completes a total of $K$ sections. The performance gained is:

$U+(U-1)+(U-2)+\cdots+(U-K+1)$

The value gained from later sections may become $0$ or negative.

For each query, find the value of $R$ that gives the  **maximum possible performance gain**.

If multiple values of $R$ give the same maximum gain, choose the  **smallest $R$**.

### Input Format
- The first line contains an integer $N$ — the number of tracks.
- The second line contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$ — the number of sections in each track.
- The third line contains an integer $Q$ — the number of queries.
- Each of the next $Q$ lines contains two integers $L$ and $U$.
### Output Format
- Print $Q$ space-separated integers.
- The $i$-th integer should be the optimal value of $R$ for the $i$-th query.
### Constraints
- $1 \le N,Q \le 10^5$
- $1 \le A_i \le 10^4$
- $1 \le L \le N$
- $1 \le U \le 10^9$
### Sample 1:
Input
Output

```
6
3 1 4 1 5 9
3
1 8
2 7
5 9
```

```
3 4 5
```

### Explanation:

For the first query, $L=1$ and $U=8$.

Choosing $R=3$ gives $3+1+4=8$ sections, so the gain is:

$8+7+6+5+4+3+2+1=36$

Choosing $R=4$ gives $9$ sections, so the gain is:

$8+7+6+5+4+3+2+1+0=36$

Both give the same maximum gain, so the smaller value,  **$R=3$**, is chosen.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:06:56.802Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // Fast I/O reader
    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1 << 16];
        private int head = 0;
        private int tail = 0;

        private int read() throws IOException {
            if (head >= tail) {
                head = 0;
                tail = in.read(buffer, 0, buffer.length);
                if (tail <= 0) return -1;
            }
            return buffer[head++];
        }

        public long nextLong() throws IOException {
            int c = read();
            while (c <= ' ') {
                if (c == -1) return -1;
                c = read();
            }
            boolean neg = (c == '-');
            if (neg) c = read();
            long res = 0;
            while (c >= '0' && c <= '9') {
                res = res * 10 + (c - '0');
                c = read();
            }
            return neg ? -res : res;
        }

        public int nextInt() throws IOException {
            return (int) nextLong();
        }
    }

    // Calculates the total gain for K sections starting from U
    private static long calculateGain(long K, long U) {
        if (K <= 0) return Long.MIN_VALUE;
        return K * U - (K * (K - 1)) / 2;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        FastScanner scanner = new FastScanner();
        int n = scanner.nextInt();
        if (n <= 0) return;

        long[] pref = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref[i] = pref[i - 1] + scanner.nextLong();
        }

        int q = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < q; i++) {
            int L = scanner.nextInt();
            long U = scanner.nextLong();

            // Target prefix sum to reach at least U sections: pref[R] >= pref[L - 1] + U
            long target = pref[L - 1] + U;

            int low = L, high = n;
            int candidate = n;

            // Binary search for the smallest R where sections K >= U
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (pref[mid] >= target) {
                    candidate = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            int bestR = candidate;
            long bestGain = calculateGain(pref[candidate] - pref[L - 1], U);

            // Compare with candidate - 1 (where K < U)
            if (candidate - 1 >= L) {
                long prevGain = calculateGain(pref[candidate - 1] - pref[L - 1], U);
                // Favor smaller index on ties (prevGain >= bestGain)
                if (prevGain >= bestGain) {
                    bestGain = prevGain;
                    bestR = candidate - 1;
                }
            }

            sb.append(bestR).append(i == q - 1 ? "" : " ");
        }

        System.out.println(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/TRNGN)