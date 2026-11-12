# DPNMAO02 - Rating 970

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Anagram Check

You are given two strings, $S$ and $T$. Your task is to determine if it's possible to rearrange the characters of $S$ to form the string $T$. In other words, you need to check if $T$ is an anagram of $S$.

 **NOTE:**  An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

### Input Format
- The first line of input contains the string $S$.
- The second line of input contains the string $T$.
### Output Format
- Print True if $T$ can be formed by rearranging the characters of $S$, otherwise print False.
### Constraints
- $1\leq |S|, |T| \leq 1000$
- The strings consist of lowercase English letters only.
### Sample 1:
Input
Output

```
listen
silent
```

```
true
```

### Sample 2:
Input
Output

```
hello
world
```

```
false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-12T06:02:57.161Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s = sc.next();
        String t = sc.next();
        
        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        
        for (int count : freq) {
            if (count != 0) {
                System.out.println(false);
                return;
            }
        }
        
        System.out.println(true);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO02)