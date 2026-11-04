# DLFLE

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Delivery Fleet

You are given  **$M$ delivery trucks**, each with cargo capacity $K$, and a queue of  **$N$ orders**  with weights $O_1,O_2,\ldots,O_N$.

The orders must be delivered  **in the given order**. A truck keeps delivering consecutive orders while it has enough remaining capacity. If an order is heavier than the truck's remaining capacity, the truck becomes unavailable and the  **same order**  is attempted by the next truck with full capacity $K$. If a truck's capacity becomes exactly $0$, the next order is handled by the next truck.

If all trucks become unavailable before all orders are delivered, the process fails. Before processing begins, you may remove some orders  **only from the front of the queue**.

Find the  **minimum number of orders to remove**  so that all remaining orders can be delivered successfully.

### Input Format
- The first line contains three space-separated integers $N$, $M$, and $K$ — the number of orders, the number of trucks, and the capacity of each truck.
- The second line contains $N$ space-separated integers $O_1,O_2,\ldots,O_N$ — the weights of the orders in their given order.
### Output Format
- Print a single integer — the minimum number of orders that must be removed from the front of the queue.
### Constraints
- $1 \le N,M \le 2\times10^5$
- $1 \le K \le 10^9$
- $1 \le O_i \le 10^9$
### Sample 1:
Input
Output

```
5 3 20
10 5 15 2 3
```

```
0
```

### Explanation:

The first truck delivers orders $10$ and $5$. It cannot carry the next order of weight $15$ with its remaining capacity, so that order is attempted by the second truck.

The second truck then delivers $15$, $2$, and $3$.

All orders are delivered successfully, so  **no order needs to be removed**.

### Sample 2:
Input
Output

```
4 1 100
110 50 20 10
```

```
1
```

### Explanation:

The first order has weight $110$, which exceeds the truck's capacity of $100$.
After removing this order, the remaining orders are: $50\space 20\space 10$
Their total weight is $80$, so the single truck can deliver all of them.
Therefore, the minimum number of orders to remove is  **1**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-04T08:03:08.554Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        if (!fs.hasNext()) return;

        int n = fs.nextInt();
        int m = fs.nextInt();
        long k = fs.nextLong();

        long[] orders = new long[n];
        for (int i = 0; i < n; i++) {
            orders[i] = fs.nextLong();
        }

        int low = 0, high = n;
        int ans = n;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canDeliver(orders, mid, n, m, k)) {
                ans = mid;
                high = mid - 1; // Try to find a smaller number of orders to remove
            } else {
                low = mid + 1;  // Need to remove more orders from the front
            }
        }

        System.out.println(ans);
    }

    private static boolean canDeliver(long[] orders, int start, int n, int m, long k) {
        if (start == n) return true; // 0 orders remaining

        int trucksUsed = 1;
        long remainingCapacity = k;

        for (int i = start; i < n; i++) {
            // If a single order exceeds maximum truck capacity, it's impossible
            if (orders[i] > k) {
                return false;
            }

            if (orders[i] <= remainingCapacity) {
                remainingCapacity -= orders[i];
            } else {
                trucksUsed++;
                if (trucksUsed > m) {
                    return false;
                }
                remainingCapacity = k - orders[i];
            }
        }

        return trucksUsed <= m;
    }

    // Fast I/O for 2 * 10^5 inputs
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        boolean hasNext() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return false;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    return false;
                }
            }
            return true;
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
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
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DLFLE)