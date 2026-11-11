# MIMAV

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimum Maximum Value

You are given four integers $D_1$, $D_2$, $C_1$, and $C_2$.

Construct two arrays $A$ and $B$ such that:

- $A$ contains exactly $C_1$ distinct positive integers, none of which is divisible by $D_1$.
- $B$ contains exactly $C_2$ distinct positive integers, none of which is divisible by $D_2$.
- No integer appears in both arrays.

Among all valid constructions, find the  **minimum possible value of the largest integer**  present in either array.

### Input Format
- The first line contains four space-separated integers $D_1$, $D_2$, $C_1$, and $C_2$.
### Output Format
- Print a single integer — the minimum possible value of the largest integer present in either array.
### Constraints
- $2 \le D_1,D_2 \le 10^5$
- $1 \le C_1,C_2 \lt 10^9$
- $2 \le C_1+C_2 \le 10^9$
### Sample 1:
Input
Output

```
2 7 1 3
```

```
4
```

### Explanation:

One possible construction is:

$A=[1]$

$B=[2,3,4]$

All conditions are satisfied, and the largest used integer is $4$.

Therefore, the answer is  **4**.

### Sample 2:
Input
Output

```
3 5 2 1
```

```
3
```

### Explanation:

One possible construction is:

$A=[1,2]$

$B=[3]$

The largest used integer is $3$, which is the minimum possible.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-11T14:10:33.654Z  

```java
import java.io.InputStream;
import java.io.IOException;

class Codechef {
    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        String token = sc.next();
        if (token != null) {
            long D1 = Long.parseLong(token);
            long D2 = sc.nextLong();
            long C1 = sc.nextLong();
            long C2 = sc.nextLong();

            long g = gcd(D1, D2);
            long lcm = (D1 / g) * D2;

            long low = 1;
            long high = 2000000000000000000L;
            long ans = high;

            while (low <= high) {
                long mid = (low + high) >> 1;

                long not_div_D1 = mid - mid / D1;
                long not_div_D2 = mid - mid / D2;
                long not_div_lcm = mid - mid / lcm;

                if (not_div_D1 >= C1 && not_div_D2 >= C2 && not_div_lcm >= (C1 + C2)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }

            System.out.println(ans);
        }
    }

    static class FastScanner {
        private final InputStream stream;
        private final byte[] buf = new byte[1024];
        private int head = 0;
        private int tail = 0;

        public FastScanner(InputStream stream) {
            this.stream = stream;
        }

        private int read() {
            if (head >= tail) {
                try { head = 0; tail = stream.read(buf, 0, buf.length); }
                catch (IOException e) { return -1; }
                if (tail <= 0) return -1;
            }
            return buf[head++];
        }

        public String next() {
            int c = read();
            while (c <= 32) { if (c == -1) return null; c = read(); }
            StringBuilder res = new StringBuilder();
            while (c > 32) { res.appendCodePoint(c); c = read(); }
            return res.toString();
        }

        public long nextLong() {
            int c = read();
            while (c <= 32) { if (c == -1) return -1; c = read(); }
            long res = 0;
            while (c > 32) {
                res = res * 10 + c - '0';
                c = read();
            }
            return res;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MIMAV)