# JAVAHASHMAP - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Frequency of Words

Given N words, print the frequency of every distinct word in the order of its first appearance.

### Input Format
- First line contains integer N.
- Second line contains N space-separated words.
### Output Format

For every distinct word, print $word frequency$

### Sample 1:
Input
Output

```
8
apple mango apple banana mango apple orange banana
```

```
apple 3
mango 2
banana 2
orange 1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:17:08.999Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line1 = br.readLine();
        if (line1 == null || line1.trim().isEmpty()) return;
        
        int n = Integer.parseInt(line1.trim());
        
        String line2 = br.readLine();
        if (line2 == null) return;
        
        StringTokenizer st = new StringTokenizer(line2);
        
        // LinkedHashMap preserves insertion order (order of first appearance)
        Map<String, Integer> wordCounts = new LinkedHashMap<>();
        
        for (int i = 0; i < n && st.hasMoreTokens(); i++) {
            String word = st.nextToken();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            sb.append(entry.getKey()).append(" ").append(entry.getValue()).append("\n");
        }
        
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVAHASHMAP)