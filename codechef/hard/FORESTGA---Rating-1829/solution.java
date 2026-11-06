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