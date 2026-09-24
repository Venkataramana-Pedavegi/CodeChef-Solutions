# COLGLF5 - Rating 1651

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### College Life 5

There is only $1$ TV in the common room, and as luck would have it, both the El Clasico football match and the India-Pakistan cricket match are happening simultaneously.

There is one football fan who is looking at the live commentary online and will scream whenever an 'important' event takes place in the El Clasico. Similarly, there is a cricket fan who will do so for every important event in the cricket match.

You are given two arrays - $F_1, F_2, \ldots, F_n$, which denote the times when an important event happens in the football match. And similarly $C_1, C_2, \ldots, C_m$ for cricket. You sadly have the remote in hand. You start out by watching the El Clasico. But whenever an Important event happens in the sport which isn't on the TV right now, you will be forced to switch to that sport's channel, and this continues, i.e., you switch channels if and only if when an important event in the other sport happens. Find the total number of times you will have to switch between the channels.

### Input:
- First line will contain $T$, number of testcases. Then the testcases follow.
- Each testcase contains of $3$ lines of input.
- First line contain $2$ space separated integers $N$ and $M$, number of important events in football and cricket match respectively.
- Second line contain $N$ space separated integers $F_i$, where the $i^{th}$ index represents $i^{th}$ important event in the football match.
- Third line contain $M$ space separated integers $C_i$, where the $i^{th}$ index represents $i^{th}$ important event in the cricket match.
### Output:

For each testcase, output in a single line answer to the problem.

### Constraints
- $1 \leq N, M \leq 2.5*10^4$
- $1 \leq F_i, C_i \leq 10^9$
- $F_i > F_{i - 1}$ $\forall i > 0$
- $C_i > C_{i - 1}$ $\forall i > 0$
- $F_i$ != $C_j$ $\forall i, j$
- Sum of $N$ over all tests is atmost $2*10^5$
- Sum of $M$ over all tests is atmost $2*10^5$
### Sample 1:
Input
Output

```
3
2 2
1 3
2 4
3 1
100 200 300
1
1 2
1
100 200
```

```
3
2
1
```

### Explanation:

 **Case 1:**  At $T = 0$, we are watching El Clasico. At $T = 1$ there is an important event in football match and since we are already watching the same channel we won't switch. At $T = 2$, there is an important event in cricket match and we switch the channel for the first time. At $T = 3$, there is an important event in football match and we switch the channel for the second time. At $T = 4$, there is an important event in cricket match and we switch the channel for the third time. So in total we switch three times.

 **Case 2:**  At $T = 0$, we are watching El Clasico. At $T = 1$ there is an important event in cricket match and we switch the channel for the first time. At $T = 100$, there is an important event in football match and we switch the channel for the second time. At $T = 200$, there is an important event in football match and since we are on the same channel, we don't switch. At $T = 300$, there is an important event in football match and since we are on the same channel, we don't switch. So in total we switch two times.

 **Case 3:**  At $T = 0$, we are watching El Clasico. At $T = 1$ there is an important event in football match and since we are on the same channel, we don't switch. At $T = 100$, there is an important event in cricket match and we switch the channel for the first time. At $T = 200$, there is an important event in cricket match and since we are on the same channel, we don't switch. So in total we switch only one time.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T05:44:32.029Z  

```java
import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] F = new int[N];
            int[] C = new int[M];

            for (int i = 0; i < N; i++) {
                F[i] = sc.nextInt();
            }

            for (int i = 0; i < M; i++) {
                C[i] = sc.nextInt();
            }

            int i = 0;
            int j = 0;

            // 0 = Football, 1 = Cricket
            int currentChannel = 0;

            int switches = 0;

            while (i < N && j < M) {

                if (F[i] < C[j]) {

                    if (currentChannel != 0) {
                        switches++;
                        currentChannel = 0;
                    }

                    i++;

                } else {

                    if (currentChannel != 1) {
                        switches++;
                        currentChannel = 1;
                    }

                    j++;
                }
            }

            while (i < N) {

                if (currentChannel != 0) {
                    switches++;
                    currentChannel = 0;
                }

                i++;
            }

            while (j < M) {

                if (currentChannel != 1) {
                    switches++;
                    currentChannel = 1;
                }

                j++;
            }

            System.out.println(switches);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/COLGLF5)