# JAVASETMCQ2

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### LinkedHashSet - MCQ

Which statement about LinkedHashSet in Java is correct?

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:42:42.961Z  

```cpp
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Read N
        String line = br.readLine();
        if (line == null) return;
        int n = Integer.parseInt(line.trim());
        
        // Read the N space-separated student IDs
        Set<Integer> uniqueIDs = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            uniqueIDs.add(Integer.parseInt(st.nextToken()));
        }
        
        // Output the count of unique IDs
        System.out.println(uniqueIDs.size());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASETMCQ2)