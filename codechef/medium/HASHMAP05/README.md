# HASHMAP05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Top K Frequent Numbers After Each Element

Given an array of $N$ numbers and an integer $K$, find the top $K$ most frequent numbers after each element is processed. If two numbers have the same frequency, the smaller number comes first.

### Input Format
- First line contains $N$ and $K$
- Second line contains $N$ space-separated integers
### Output Format
- For each test case, print $N$ lines where each line contains the top $K$ most frequent numbers until that point.
### Sample 1:
Input
Output

```
5 4
5 2 1 3 2

```

```
5
2 5
1 2 5
1 2 3 5
2 1 3 5
```

### Explanation:
- After 5: only 5 appears once
- After 2: both 5 and 2 appear once, 2 comes first (smaller number)
- After 1: all numbers (1,2,5) appear once, printed in ascending order
- After 3: all numbers (1,2,3,5) appear once, printed in ascending order
- After 2: 2 appears twice (highest frequency), others once each
### Sample 2:
Input
Output

```
6 3
2 1 2 1 2 1
```

```
2
1 2
2 1
1 2
2 1
1 2
```

### Explanation:
- After 2: only 2 appears once
- After 1: both appear once, 1 comes first (smaller)
- After 2: 2 appears twice, 1 once
- After 1: both appear twice, 1 comes first (smaller)
- After 2: 2 appears thrice, 1 twice
- After 1: both appear thrice, 1 comes first (smaller)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:15:39.404Z  

```java
import java.util.*;
class Main {
    
    public static List<List<Integer>> findTopK(int[] arr, int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> freq = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
            
            List<Map.Entry<Integer, Integer>> temp = new ArrayList<>(freq.entrySet());
            
            // Sort by frequency (descending) and then by value (ascending when frequencies are equal)
            Collections.sort(temp, (a, b) -> {
                if (a.getValue() != b.getValue()) {
                    return b.getValue() - a.getValue(); // Descending by frequency
                } else {
                    return a.getKey() - b.getKey(); // Ascending by value
                }
            });
            
            List<Integer> current = new ArrayList<>();
            for (int j = 0; j < Math.min(k, temp.size()); j++) {
                current.add(temp.get(j).getKey());
            }
            
            result.add(current);
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        List<List<Integer>> result = findTopK(arr, n, k);
        
        for (List<Integer> list : result) {
            for (int num : list) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP05)