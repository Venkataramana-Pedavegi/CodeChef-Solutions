# HASHMAP04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Group Anagrams

You are given $N$ strings. Your task is to group the strings that are anagrams of each other. Complete the function `groupAnagrams`.

 **Note** : An anagram is a string formed by rearranging the letters of a another string, using all the original letters exactly once.
For example,  **"listen"**  and  **"silent"**  are anagrams of each other because they contain the same letters.

### Input Format
- The first line of input contains an integer $N$ — the number of strings.
- The next $N$ lines contain strings.
### Output Format
- Complete the function which return the vector of string vectors. each string vector are group of anagram strings.
- You can return the groups of anagrams in any order.
### Sample 1:
Input
Output

```
5
abc
dba
acb
bda
cba
```

```
abc acb cba 
dba bda
```

### Explanation:

There could be multiple grouping, for eg, 1 valid grouping is: {abc, acb, cba}, {dba, bda}

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:11:40.504Z  

```java
import java.io.*;
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> groups = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedS = new String(chars);
            if (!groups.containsKey(sortedS)) {
                groups.put(sortedS, new ArrayList<>());
            }
            groups.get(sortedS).add(s);
        }
        return new ArrayList<>(groups.values());
    }
}

public class Main {
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    String line = br.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        String nStr = sc.next();
        if (nStr == null) return;
        int N = Integer.parseInt(nStr);
        
        String[] strs = new String[N];
        for (int i = 0; i < N; i++) {
            strs[i] = sc.next();
        }
        
        Solution sol = new Solution();
        List<List<String>> ans = sol.groupAnagrams(strs);
        
        PrintWriter out = new PrintWriter(System.out);
        for (List<String> group : ans) {
            for (int i = 0; i < group.size(); i++) {
                out.print(group.get(i) + (i == group.size() - 1 ? "" : " "));
            }
            out.println();
        }
        out.flush();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP04)