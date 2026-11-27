# CODEVITA23E

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:52:20.881Z  

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

[View on CodeChef](https://www.codechef.com/problems/CODEVITA23E)