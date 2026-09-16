# ANKTRAIN - Rating 1187

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Train Partner

Rahul and Rashi are off to the wedding of a close relative. This time they have to travel without their guardians. Rahul got very interested in the arrangement of seats inside the train coach.

The entire coach could be viewed as an arrangement of consecutive blocks of size 8.

```

Berth Number   	Compartment
1 -  8               1

9 - 16               2

17 - 24               3

... and so on

```

Each of these size-8 blocks are further arranged as:

```

 1LB,  2MB,  3UB,  4LB,  5MB,  6UB,  7SL,  8SU  
 9LB, 10MB,...
...   
...

```

Here `LB` denotes lower berth, `MB` middle berth and `UB` upper berth.

The following berths are called  **Train-Partners** :

```

3UB   |  6UB  
2MB   |  5MB  
1LB   |  4LB  
7SL   |  8SU  

```

and the pattern is repeated for every set of 8 berths.

Rahul and Rashi are playing this game of finding the train partner of each berth. Can you write a program to do the same?

### Input

The first line of input contains a single integer  **T**, denoting the number of test cases to follow.

Each of the next  **T**  lines contain a single integer  **N**, the berth number whose neighbor is to be found out.

### Output

The output should contain exactly  **T**  lines each containing the berth of the neighbor of the corresponding seat.

### Constraints
### Subtasks

 **Subtask #1 (50 points):** 

- 1 ≤ T ≤ 8
- 1 ≤ N ≤ 8

 **Subtask #2 (50 points):** 

- 1 ≤ T ≤ 100
- 1 ≤ N ≤ 500
### Sample 1:
Input
Output

```
3
1
5
3
```

```
4LB
2MB
6UB
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-16T06:34:20.887Z  

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

        while (T-- > 0)
        {
            int n = sc.nextInt();

            int rem = n % 8;
            int partner;
            String type;

            if (rem == 1)
            {
                partner = n + 3;
                type = "LB";
            }
            else if (rem == 2)
            {
                partner = n + 3;
                type = "MB";
            }
            else if (rem == 3)
            {
                partner = n + 3;
                type = "UB";
            }
            else if (rem == 4)
            {
                partner = n - 3;
                type = "LB";
            }
            else if (rem == 5)
            {
                partner = n - 3;
                type = "MB";
            }
            else if (rem == 6)
            {
                partner = n - 3;
                type = "UB";
            }
            else if (rem == 7)
            {
                partner = n + 1;
                type = "SU";
            }
            else
            {
                // rem == 0 means berth position 8
                partner = n - 1;
                type = "SL";
            }

            System.out.println(partner + type);
        }

        sc.close();
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/ANKTRAIN)