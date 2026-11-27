# JAVASORT - Rating 1650

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Counting sort

You are given a list of integers. Your task is to sort the list based on the frequency of each integer in ascending order. If two integers have the same frequency, the one with the smaller value should come first.

### Input Format
- The first line contains a single integer $n$, the number of integers in the list.
- The second line contains $n$ space separated integers $a1,a2,…,an$.
### Output Format

Print the sorted list based on the frequency of each integer.

### Sample 1:
Input
Output

```
4
1 2 3 2
```

```
1 3 2 2
```

### Explanation:

The frequencies are: 1 appears once, 2 appears twice, and 3 appears once.

Sorting primarily by frequency, integers 1 and 3 (each appearing once) come before 2 (appearing twice). Since 1 and 3 have the same frequency, they are sorted by their value, resulting in 1 before 3.

The final sorted list is: 1, 3, 2, 2.

### Sample 2:
Input
Output

```
4
2 1 1 1
```

```
2 1 1 1
```

### Explanation:

The frequencies are: 1 appears thrice and 2 appears once.

Sorting by frequency, the integer 2 (appearing once) comes before 1 (appearing three times).

The final sorted list is: 2,1,1,1.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:48:41.771Z  

```java
import java.util.*;

public class Main {
    public static void frequencyBasedSort(int n, List<Integer> arr) {
        // Initialize a count array to count frequencies (since max value is 100)
        final int max_value = 100;
        int[] count = new int[max_value + 1];
        // Count frequencies of each integer
        for (int num : arr) {
            count[num]++;
        }
        // Create a list of pairs (value, frequency)
        List<Map.Entry<Integer, Integer>> freqList = new ArrayList<>();
        for (int i = 0; i <= max_value; ++i) {
            if (count[i] > 0) {
                freqList.add(new AbstractMap.SimpleEntry<>(i, count[i]));
            }
        }
        // Sort the list by frequency (ascending) and by value (ascending if frequencies are the same)
        freqList.sort((a, b) -> {
            if (a.getValue().equals(b.getValue())) {
                return Integer.compare(a.getKey(), b.getKey()); // Sort by value if frequencies are the same
            }
            return Integer.compare(a.getValue(), b.getValue()); // Otherwise, sort by frequency
        });
        // Output the sorted list based on frequency
        for (Map.Entry<Integer, Integer> p : freqList) {
            for (int i = 0; i < p.getValue(); ++i) {
                System.out.print(p.getKey() + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(scanner.nextInt());
        }
        // Function call to perform frequency-based sorting
        frequencyBasedSort(n, arr);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASORT)