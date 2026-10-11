# DPNMAO22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Fixed Vowel Permutations

You are given a string $S$ consisting of uppercase English letters.
Your task is to find the number of unique strings that can be formed by permuting the consonants, while keeping the vowels ($A$, $E$, $I$, $O$, $U$) in their original positions.

### Input Format
- A single line containing the string $S$.
### Output Format
- A single integer representing the total number of such permutations.
### Constraints
- $1 \leq |S| \leq 12$
- $S$ contains only uppercase English letters.
### Sample 1:
Input
Output

```
ABC
```

```
2
```

### Explanation:

The vowel $A$ at index $0$ is fixed.
The consonants $B$ and $C$ can be permuted in $2! = 2$ ways.
The resulting strings are $ABC$ and $ACB$.

### Sample 2:
Input
Output

```
CODE
```

```
2
```

### Explanation:

The vowels $O$ and $E$ are fixed in their positions.
The consonants $C$ and $D$ can be permuted in $2! = 2$ ways.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-11T10:41:57.825Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        List<Character> consonants = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                consonants.add(c);
            }
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : consonants) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        long total = factorial(consonants.size());
        for (int count : freq.values()) {
            total /= factorial(count); // adjust for duplicates
        }

        System.out.println(total);
        sc.close();
    }

    static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/DPNMAO22)