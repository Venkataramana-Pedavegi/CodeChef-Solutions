# JAVATREESET - Rating 850

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Print Students in Alphabetical Order

Given names of students, print all unique names in alphabetical order.

### Input Format
- First line contains integer N.
- Next N lines contain one student name.
### Output Format

Print unique names in sorted order.

### Sample 1:
Input
Output

```
6
Raj
Aman
Rahul
Raj
Aman
Zoya
```

```
Aman
Rahul
Raj
Zoya
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:09:51.464Z  

```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line = br.readLine();
        if (line == null || line.trim().isEmpty()) return;
        
        int n = Integer.parseInt(line.trim());
        Set<String> names = new TreeSet<>();
        
        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            if (name != null && !name.trim().isEmpty()) {
                names.add(name.trim());
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (String name : names) {
            sb.append(name).append("\n");
        }
        
        System.out.print(sb);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVATREESET)