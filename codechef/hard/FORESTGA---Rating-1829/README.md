# FORESTGA - Rating 1829

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Forest Gathering

Chef is the head of commercial logging industry that recently bought a farm containing  **N**  trees. You are given initial height of the i-th tree by  **Hi**  and the rate of growth of height as  **Ri**  meters per month. For simplicity, you can assume that all the trees are perfect cylinders of equal radius. This allows us to consider only the height of trees when we talk about the amount of wood.

In Chef's country, laws don't allow one to cut a tree partially, so one has to cut the tree completely for gathering wood. Also, laws prohibit cutting trees of heights (strictly) lower than  **L**  meters.

Today Chef received an order of  **W**  meters (of height) of wood. Chef wants to deliver this order as soon as possible. Find out how minimum number of months he should wait after which he will able to fulfill the order. You can assume that Chef's company's sawing machines are very efficient and take negligible amount of time to cut the trees.

### Input

There is a single test case per test file.

The first line of the input contains three space separated integers  **N**,  **W**  and  **L**  denoting the number of trees in the farm, the amount of wood (in meters) that have to be gathered and the minimum allowed height of the tree to cut.

Each of next  **N**  lines contain two space separated integers denoting  **Hi**  and  **Ri**  respectively.

### Output

Output a single integer denoting the number of months that have to pass before Chef will be able to fulfill the order.

### Constraints
- 1 ≤ N ≤ 105
- 1 ≤ W, L ≤ 1018
- 1 ≤ Hi, Ri ≤ 109
### Subtasks
- Subtask #1 [40 points]: 1 ≤ N, W, L ≤ 104
- Subtask #2 [60 points]: No additional constraints
### Sample 1:
Input
Output

```
3 74 51
2 2
5 7
2 9
```

```
7
```

### Explanation:

After  **6**  months, heights of each tree will be  **14**,  **47**  and  **56**  respectively. Chef is allowed to cut only the third tree, sadly it is not enough to fulfill an order of 74 meters of wood.

After  **7**  months, heights of each tree will be  **16**,  **54**  and  **65**  respectively. Now Chef is allowed to cut second and third trees. Cutting both of them would provide him  **119**  meters of wood, which is enough to fulfill the order.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-06T14:41:27.759Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static class Tree {
        long h, r;
        Tree(long h, long r) {
            this.h = h;
            this.r = r;
        }
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        FastScanner fs = new FastScanner();
        String token = fs.next();
        if (token == null) return;

        int n = Integer.parseInt(token);
        long w = fs.nextLong();
        long l = fs.nextLong();

        Tree[] trees = new Tree[n];
        for (int i = 0; i < n; i++) {
            trees[i] = new Tree(fs.nextLong(), fs.nextLong());
        }

        long low = 0;
        // Upper bound: 10^18 months is sufficient even for W = 10^18, L = 10^18, R = 1
        long high = (long) 1e18;
        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canHarvest(trees, w, l, mid)) {
                ans = mid;
                high = mid - 1; // Try to fulfill the order in fewer months
            } else {
                low = mid + 1;  // Not enough wood, need more time
            }
        }

        System.out.println(ans);
    }

    private static boolean canHarvest(Tree[] trees, long w, long l, long m) {
        long totalWood = 0;

        for (Tree tree : trees) {
            // Tree is eligible if: h + m * r >= l
            // Rearranged without overflow: m * r >= l - h
            boolean eligible = false;
            if (tree.h >= l) {
                eligible = true;
            } else if (tree.r > 0) {
                // Minimum months needed for this tree to reach height l: ceil((l - h) / r)
                long neededMonths = (l - tree.h + tree.r - 1) / tree.r;
                if (m >= neededMonths) {
                    eligible = true;
                }
            }

            if (eligible) {
                // Check if current tree alone exceeds or satisfies remaining required wood W
                // to prevent 64-bit integer overflow during m * tree.r
                if (tree.r > 0 && m > (w - tree.h) / tree.r) {
                    return true;
                }

                long currentHeight = tree.h + m * tree.r;
                totalWood += currentHeight;

                if (totalWood >= w) {
                    return true;
                }
            }
        }

        return totalWood >= w;
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens()) {
                String line;
                try {
                    line = br.readLine();
                } catch (IOException e) {
                    return null;
                }
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FORESTGA)