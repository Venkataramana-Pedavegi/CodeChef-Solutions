# BSEX03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Painter Partition Problem

You are given $N$ boards of varying lengths, and $k$ painters are available to paint these boards. Each painter takes the same amount of time to paint  **1 unit**  of board length. A painter can only paint contiguous sections of boards, and each board must be painted by exactly  **one**  painter.

Your task is to determine the  **minimum time**  required to paint all the boards such that no painter paints more than a specific amount of length. You need to divide the boards into $k$  **contiguous**  parts in such a way that the maximum length painted by any painter is  **minimized**.

### Input Format

The first line contains the number of test cases, T.

- The first line of each test case contains two integers, $N$ (the number of boards) and $k$ (the number of painters).
- The second line of each test case contains $N$ space-separated integers, where the $i$-th integer represents the length of the $i$-th board
### Output Format
- A single integer representing the minimum time required to paint all the boards, where the time is defined as the maximum time taken by any single painter to paint their assigned section of boards.
### Constraints
- $1 \leq T \leq 100$
- $1 \leq N \leq 10^5$
- $1 \leq k \leq N$
- $1 \leq a[i] \leq 10^5$
### Sample 1:
Input
Output

```
3
4 2
10 20 30 40
5 3
10 10 10 10 10
6 1
5 10 15 20 25 30

```

```
60
20
105
```

### Explanation:
- Test Case 1: There are 4 boards with lengths [10, 20, 30, 40] and 2 painters. Optimal division will be [10, 20, 30] for one painter and [40] for the other. Maximum length painted by a painter = 60.
- Test case 2: There are 5 boards with equal lengths [10, 10, 10, 10, 10] and 3 painters. Optimal division will be [10, 10], [10, 10], and [10]. Maximum length painted by a painter = 20.
- Test case 3: Only one painter is available, so they must paint all boards. Total length = 5 + 10 + 15 + 20 + 25 + 30 = 105.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:29:30.950Z  

```java
import java.util.*;

public class Main {

    // Implement the painterPartition method here
    public static long painterPartition(int[] boards, int k) {

        long low = 0;
        long high = 0;

        // low = largest board
        // high = total length
        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        // Binary search
        while (low < high) {

            long mid = low + (high - low) / 2;

            int painters = 1;
            long currentSum = 0;

            for (int board : boards) {

                if (currentSum + board <= mid) {
                    currentSum += board;
                } 
                else {
                    painters++;
                    currentSum = board;
                }
            }

            // If k painters are enough,
            // try a smaller maximum
            if (painters <= k) {
                high = mid;
            } 
            else {
                // Need more painters, so increase maximum
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
            int t = sc.nextInt();

            while (t-- > 0) {

                int N = sc.nextInt();
                int k = sc.nextInt();

                int[] boards = new int[N];

                for (int i = 0; i < N; i++) {
                    boards[i] = sc.nextInt();
                }

                System.out.println(painterPartition(boards, k));
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX03)