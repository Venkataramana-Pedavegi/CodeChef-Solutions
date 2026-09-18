# PRIME1 - Rating 1069

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Prime Generator

Ram wants to generate some prime numbers for his cryptosystem. Help him please! Your task is to generate all prime numbers between two given numbers.

 **Warning: large Input/Output data, be careful with certain languages (though most should be OK if the algorithm is well designed)** 
### Input Format

The first line contains t, the number of test cases (less then or equal to 10).

Followed by t lines which contain two numbers m and n (1 <= m <= n <= 1000000000, n-m<=100000) separated by a space.

### Output Format

For every test case print all prime numbers p such that m <= p <= n, one number per line. Separate the answers for each test case by an empty line.

### Constraints

(1 <= m <= n <= 1000000000, n-m<=100000)

### Sample 1:
Input
Output

```
2
1 10
3 5
```

```
2
3
5
7
3
5
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T15:32:21.281Z  

```java
import java.util.*;

class Main {

    // Sieve of Eratosthenes
    static List<Integer> getPrimes(int limit) {
        boolean[] composite = new boolean[limit + 1];
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= limit; i++) {

            if (!composite[i]) {
                primes.add(i);

                if ((long) i * i <= limit) {
                    for (int j = i * i; j <= limit; j += i) {
                        composite[j] = true;
                    }
                }
            }
        }

        return primes;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        // sqrt(1,000,000,000) < 31623
        List<Integer> primes = getPrimes(31623);

        while (T-- > 0) {

            long m = sc.nextLong();
            long n = sc.nextLong();

            int size = (int)(n - m + 1);

            boolean[] composite = new boolean[size];

            for (int p : primes) {

                // No need to check primes greater than sqrt(n)
                if ((long)p * p > n) {
                    break;
                }

                long start = Math.max(
                    (long)p * p,
                    ((m + p - 1) / p) * p
                );

                for (long j = start; j <= n; j += p) {
                    composite[(int)(j - m)] = true;
                }
            }

            // 0 and 1 are not prime
            if (m == 1) {
                composite[0] = true;
            }

            for (int i = 0; i < size; i++) {
                if (!composite[i]) {
                    System.out.println(m + i);
                }
            }

            // Empty line between test cases
            if (T > 0) {
                System.out.println();
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRIME1)