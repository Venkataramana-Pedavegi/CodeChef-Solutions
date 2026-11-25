# JAVASET01 - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:43:04.315Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line1 = br.readLine();
        if (line1 == null) return;
        int n = Integer.parseInt(line1.trim());
        
        String line2 = br.readLine();
        if (line2 == null) return;
        StringTokenizer st = new StringTokenizer(line2);
        
        // LinkedHashSet keeps unique elements while preserving insertion order
        Set<Integer> set = new LinkedHashSet<>();
        
        for (int i = 0; i < n; i++) {
            if (st.hasMoreTokens()) {
                set.add(Integer.parseInt(st.nextToken()));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int val : set) {
            sb.append(val).append(" ");
        }
        
        System.out.println(sb.toString().trim());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASET01)