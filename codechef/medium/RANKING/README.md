# RANKING

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ranking Contest

You are given a list of $N$ contestants who participated in a contest. For each contestant, you are given their $Name$, the number of problems $Solved$, and their total $Penalty$.

The final rank list is determined using the following rules:

- Higher solved count: A contestant with more solved problems ranks higher.
- Lower penalty: If two contestants have solved the same number of problems, the one with a smaller penalty ranks higher.
- Lexicographical order: If both solved count and penalty are equal, the contestant whose name is lexicographically smaller ranks higher.

After sorting all contestants, you need to answer $Q$ queries. For each query, given a rank $K$, determine the name of the contestant at rank $K$ (1-indexed).

### Input Format
- The first line of input contains a single integer $N$ — the number of contestants.
- The next $N$ lines each contain a string $\text{Name}_i$, an integer $Solved_i$, and an integer $Penalty_i$.
- The next line contains a single integer $Q$ — the number of queries.
- The next line contains $Q$ space-separated integers $K_1, K_2, \dots, K_Q$ — the ranks requested.
### Output Format

Print $Q$ space-separated strings (or each on a new line), representing the names of the contestants at the given query ranks.

### Sample 1:
Input
Output

```
4
Alice 5 400
Bob 5 380
Charlie 4 200
David 5 400
3
1
2
4
```

```
Bob
Alice
Charlie
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:52:17.979Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static class Contestant implements Comparable<Contestant> {
        String name;
        long solved;
        long penalty;

        Contestant(String name, long solved, long penalty) {
            this.name = name;
            this.solved = solved;
            this.penalty = penalty;
        }

        @Override
        public int compareTo(Contestant other) {
            if (this.solved != other.solved) {
                return Long.compare(other.solved, this.solved);
            }
            if (this.penalty != other.penalty) {
                return Long.compare(this.penalty, other.penalty);
            }
            return this.name.compareTo(other.name);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        st = new StringTokenizer(line);

        int n = Integer.parseInt(st.nextToken());
        List<Contestant> contestants = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            String name = st.nextToken();
            long solved = Long.parseLong(st.nextToken());
            long penalty = Long.parseLong(st.nextToken());
            contestants.add(new Contestant(name, solved, penalty));
        }

        Collections.sort(contestants);

        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        int q = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < q; i++) {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int k = Integer.parseInt(st.nextToken());
            sb.append(contestants.get(k - 1).name).append("\n");
        }

        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/RANKING)