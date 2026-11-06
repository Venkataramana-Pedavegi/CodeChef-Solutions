# MINMAXARR - Rating 1689

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Minimize the Maximum

Chef has an array $A$ of $N$ positive integers. Chef can perform the following operation any (possibly zero) number of times on the array.

- Choose any index $i$ such that $(1 \lt i \le N)$;
- Choose an integer $X$ such that $(1\le X \le A_i)$;
- Set $A_{(i-1)} := A_{(i-1)} + X$;
- Set $A_i := A_i - X$.

Help Chef to  **minimize**  the  **maximum**  value of array $A$ using the above operations.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of two lines of input. The first line of each test case contains a single integer $N$, the size of array $A$. The second line of each test case contains $N$ space-seperated integers, the elements of array $A$.
### Output Format

For each test case, output on a new line, the minimized maximum value possible of array $A$.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $0 \leq A_i \leq 10^9$
- The sum of $N$ over all test cases won't exceed $10^5$.
### Sample 1:
Input
Output

```
3
4
1 5 7 6
3
5 15 19
4
10 3 5 7

```

```
5
13
10
```

### Explanation:

 **Test case $1$:**  Consider the following $3$ operations on the array.

- Choose $i = 3$ and $X = 4$. Here $X \le A_3$. After operation, the array becomes $[1,9,3,6]$.
- Choose $i = 2$ and $X = 4$. Here $X \le A_2$. After operation, the array becomes $[5,5,3,6]$.
- Choose $i = 4$ and $X = 1$. Here $X \le A_4$. After operation, the array becomes $[5,5,4,5]$.

So the minimum value of maximum element of array is $5$.

 **Test case $2$:**  Consider the following $2$ operations on the array.

- Choose $i = 2$ and $X = 8$. Here $X \le A_2$. After operation, the array becomes $[13, 7, 19]$.
- Choose $i = 3$ and $X = 6$. Here $X \le A_3$. After operation, the array becomes $[13, 13, 13]$.

So the minimum value of maximum element of array is $5$.

 **Test case $3$:**  We cannot make $A_1$ less than $10$ using any number of operations. Thus, the minimum value of maximum element is $10$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:39:31.593Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    // Fast I/O reader
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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

    public static void main (String[] args) throws java.lang.Exception
    {
        FastReader in = new FastReader();
        String tStr = in.next();
        if (tStr == null) return;
        int t = Integer.parseInt(tStr);

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = in.nextInt();
            
            long maxVal = 0;
            long prefixSum = 0;

            for (int i = 1; i <= n; i++) {
                long a = in.nextLong();
                prefixSum += a;
                // Ceiling division: ceil(prefixSum / i) = (prefixSum + i - 1) / i
                long required = (prefixSum + i - 1) / i;
                maxVal = Math.max(maxVal, required);
            }

            sb.append(maxVal).append("\n");
        }

        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MINMAXARR)