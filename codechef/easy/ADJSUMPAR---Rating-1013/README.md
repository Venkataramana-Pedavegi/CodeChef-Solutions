# ADJSUMPAR - Rating 1013

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Adjacent Sum Parity

Chef has an array $A$ of length $N$.

Chef forms a binary array $B$ of length $N$ using the parity of the sums of adjacent elements in $A$. Formally,

- $B_i = (A_i + A_{i+1}) \, \% \, 2$ for $1 \leq i \le N - 1$
- $B_N = (A_N + A_1) \, \% \, 2$

Here $x \, \% \, y$ denotes the remainder obtained when $x$ is divided by $y$.

Chef lost the array $A$ and needs your help. Given array $B$, determine whether there exists any valid array $A$ which could have formed $B$.

### Input Format
- The first line contains a single integer $T$ — the number of test cases. Then the test cases follow.
- The first line of each test case contains an integer $N$ — the size of the array $A$.
- The second line of each test case contains $N$ space-separated integers $B_1, B_2, \dots, B_N$ denoting the array $B$.
### Output Format

For each testcase, output `YES` if there exists a valid array $A$, `NO` otherwise.

You can print any character in any case. For example `YES`, `Yes`, `yEs` are all considered same.

### Constraints
- $1 \leq T \leq 1000$
- $2 \leq N \leq 10^5$
- $B_i \in \{0, 1\}$
- The sum of $N$ over all test cases do not exceed $3 \cdot 10^5$.
### Sample 1:
Input
Output

```
4
2
0 0
2
1 0
4
1 0 1 0
3
1 0 0

```

```
YES
NO
YES
NO

```

### Explanation:

 **Test case 1:**  One such valid array is $A = [3, 3]$.

 **Test case 2:**  It can be shown that no such arrays exist and are valid.

 **Test case 3:**  One such valid array is $A = [1, 2, 4, 5]$.

- $B_1 = 1$ since $A_1 + A_2 = 1 + 2 = 3$ and $3 \, \% \, 2 = 1$
- $B_2 = 0$ since $A_2 + A_3 = 2 + 4 = 6$ and $6 \, \% \, 2 = 0$
- $B_3 = 1$ since $A_3 + A_4 = 4 + 5 = 9$ and $9 \, \% \, 2 = 1$
- $B_4 = 0$ since $A_4 + A_1 = 5 + 1 = 6$ and $6 \, \% \, 2 = 0$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T15:41:15.446Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int countOnes = 0;

            for (int i = 0; i < N; i++) {
                int b = sc.nextInt();

                if (b == 1) {
                    countOnes++;
                }
            }

            if (countOnes % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();


	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ADJSUMPAR)