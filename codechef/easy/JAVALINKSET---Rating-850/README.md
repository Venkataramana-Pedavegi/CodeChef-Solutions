# JAVALINKSET - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Preserve First Occurrence

Given an array of integers, remove duplicate values while preserving their first occurrence.

Print the resulting sequence.

### Input Format
- First line contains an integer N
- Second line contains N space-separated integers.
### Output Format

Print the elements after removing duplicates while maintaining insertion order.

### Sample 1:
Input
Output

```
8
5 2 5 3 2 8 8 1
```

```
5 2 3 8 1
```

### Explanation:

All duplicates were removed

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:43:00.932Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAVALINKSET)