# DSAPROB15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Count Pairs

Given a sorted array of integers and a value $x$, count the number of pairs $(i, j)$ such that $i < j$ and the sum of $arr[i]$ $+$ $arr[j]$ is less than $x$.

### Input Format
- The first line contains an integer $n$, the number of elements in the array.
- The second line contains $n$ integers representing the elements of the sorted array.
- The third line contains the integer $x$.
### Output Format

Output a single integer, the number of pairs whose sum is less than $x$.

### Constraints
- $1 \leq n \leq 10^5$
- $0 \leq arr[i] \leq 10^5$
- $0 \leq x \leq 10^8$
### Sample 1:
Input
Output

```
5
1 2 3 4 5
7
```

```
6
```

### Explanation:

The pairs that have a sum less than 7 are:

- (1, 2), sum = 3
- (1, 3), sum = 4
- (1, 4), sum = 5
- (1, 5), sum = 6
- (2, 3), sum = 5
- (2, 4), sum = 6

Thus, the total number of such pairs is 6.

### Sample 2:
Input
Output

```
6
2 3 4 5 6 8
10
```

```
8
```

### Explanation:

The pairs that have a sum less than 10 are:

- (2, 3), sum = 5
- (2, 4), sum = 6
- (2, 5), sum = 7
- (2, 6), sum = 8
- (3, 4), sum = 7
- (3, 5), sum = 8
- (3, 6), sum = 9
- (4, 5), sum = 9

Thus, the total number of such pairs is 9.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T05:51:07.775Z  

```java
import java.util.*;

public class Main {

    public static long countPairsLessThanX(int[] arr, int x) {

        int left = 0;
        int right = arr.length - 1;

        long count = 0;

        while (left < right) {

            if (arr[left] + arr[right] < x) {

                // All elements between left and right
                // can form a valid pair with arr[left]
                count += right - left;

                left++;

            } else {

                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        System.out.println(countPairsLessThanX(arr, x));

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAPROB15)