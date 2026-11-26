# HASHMAP06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Second Most Frequent Word

Given an array of strings, find the second most frequently occurring word.

- If there are fewer than two unique words in the array, print -1.
- If there is a tie for the highest frequency or second-highest frequency (or if all unique words have the same frequency), print -1.
### Input Format
- First line contains $T$ - number of test cases
- For each test case: First line contains $N$ - length of array Second line contains $N$ space-separated strings
### Output Format
- For each test case: Print the second most frequent word If no such word exists, print -1
### Sample 1:
Input
Output

```
2
3
aa bb aa
6
a b b c a a
```

```
bb 
b
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:13:09.297Z  

```java
import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            
            // Count frequencies of each word
            Map<String, Integer> freqMap = new HashMap<>();
            for (int i = 0; i < N; i++) {
                String word = sc.next();
                freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
            }
            
            // Find the highest and second highest frequencies
            int firstMax = -1;
            int secondMax = -1;
            
            for (int count : freqMap.values()) {
                if (count > firstMax) {
                    secondMax = firstMax;
                    firstMax = count;
                } else if (count > secondMax && count < firstMax) {
                    secondMax = count;
                }
            }
            
            // If there's no second highest frequency, print -1
            if (secondMax == -1) {
                System.out.println("-1");
                continue;
            }
            
            // Find and print the word corresponding to secondMax
            for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
                if (entry.getValue() == secondMax) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
        
        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP06)