# PRESUF

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Prefix-Suffix Pairs

You are given an array $A$ of $N$ integers, indexed from $1$ to $N$.

For an index $i$, consider the prefix $A_1,A_2,\ldots,A_i$:

- let $P_i$ be the number of times $A_i$ appears in this prefix;
- let $D_i$ be the number of distinct values in this prefix.

Similarly, for an index $j$, consider the suffix $A_j,A_{j+1},\ldots,A_N$:

- let $S_j$ be the number of times $A_j$ appears in this suffix;
- let $E_j$ be the number of distinct values in this suffix.

A pair of indices $(i,j)$, where $1 \le i < j \le N$, is called  **valid**  if:

$P_i + S_j \le \left\lfloor \frac{D_i}{2} \right\rfloor + \left\lfloor \frac{E_j}{2} \right\rfloor$

Find the  **number of valid pairs**  in the array.

Since the answer can be large, print it modulo $10^9+7$.

### Input Format

The first line contains an integer $N$ — the size of the array.

The second line contains $N$ space-separated integers $A_1,A_2,\ldots,A_N$.

### Output Format

Print a single integer — the number of valid pairs modulo $10^9+7$

### Constraints
- $1 \le N \le 10^5$
- $1 \le A_i \le 10^9$
### Sample 1:
Input
Output

```
5
2 2 3 1 5
```

```
2
```

### Explanation:

The valid pairs are `(1, 2)` and `(3, 4)`.

Therefore, the number of valid pairs is `2`.

### Sample 2:
Input
Output

```
5
5 5 5 5 5
```

```
0
```

### Explanation:

No pair satisfies the required condition.

Therefore, the answer is `0`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T14:14:45.875Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static final long MOD = 1000000007L;

    public static void main(String[] args) throws java.lang.Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] leftValue = new int[n];
        int[] rightValue = new int[n];

        // ---------------- PREFIX ----------------
        HashMap<Integer, Integer> freq = new HashMap<>();

        int distinct = 0;

        for (int i = 0; i < n; i++) {

            int count = freq.getOrDefault(a[i], 0) + 1;
            freq.put(a[i], count);

            if (count == 1) {
                distinct++;
            }

            int Pi = count;
            int Di = distinct;

            leftValue[i] = Di / 2 - Pi;
        }

        // ---------------- SUFFIX ----------------
        freq.clear();
        distinct = 0;

        for (int j = n - 1; j >= 0; j--) {

            int count = freq.getOrDefault(a[j], 0) + 1;
            freq.put(a[j], count);

            if (count == 1) {
                distinct++;
            }

            int Sj = count;
            int Ej = distinct;

            rightValue[j] = Ej / 2 - Sj;
        }

        // ---------------- COMPRESS LEFT VALUES ----------------
        int[] sorted = leftValue.clone();

        Arrays.sort(sorted);

        int size = 0;

        for (int x : sorted) {
            if (size == 0 || sorted[size - 1] != x) {
                sorted[size++] = x;
            }
        }

        FenwickTree bit = new FenwickTree(size);

        long answer = 0;

        // ---------------- COUNT VALID PAIRS ----------------
        for (int j = 0; j < n; j++) {

            // Add L[j-1], so only i < j are present
            if (j > 0) {

                int pos = lowerBound(
                    sorted, size, leftValue[j - 1]
                );

                bit.add(pos + 1, 1);
            }

            /*
             * L[i] + R[j] >= 0
             *
             * L[i] >= -R[j]
             */
            int required = -rightValue[j];

            // First position whose value >= required
            int pos = lowerBound(sorted, size, required);

            // Number of previous L values < required
            int less = bit.sum(pos);

            // Total previous elements = j
            // Therefore values >= required = j - less
            answer += j - less;

            answer %= MOD;
        }

        System.out.println(answer);
    }

    // First index where arr[index] >= target
    static int lowerBound(int[] arr, int size, int target) {

        int low = 0;
        int high = size;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    // Fenwick Tree / Binary Indexed Tree
    static class FenwickTree {

        int[] tree;

        FenwickTree(int n) {
            tree = new int[n + 1];
        }

        void add(int index, int value) {

            while (index < tree.length) {

                tree[index] += value;

                index += index & -index;
            }
        }

        int sum(int index) {

            int result = 0;

            while (index > 0) {

                result += tree[index];

                index -= index & -index;
            }

            return result;
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/PRESUF)