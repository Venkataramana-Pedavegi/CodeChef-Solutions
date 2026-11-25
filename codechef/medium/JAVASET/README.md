# JAVASET

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Remove Duplicate Student IDs

A college stores student IDs in a list. Some IDs appear multiple times due to data entry mistakes.

Given $N$ student $IDs$, print the number of unique student IDs.

### Input Format
- First line contains an integer N
- Second line contains N space-separated integers.
### Output Format

Print the count of unique IDs.

### Sample 1:
Input
Output

```
8
10 20 30 10 20 40 50 50
```

```
5
```

### Explanation:

Unique IDs are = 10 20 30 40 50

- Count = 5

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-25T14:42:05.643Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/JAVASET)