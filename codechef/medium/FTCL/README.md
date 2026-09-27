# FTCL

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find the Celebrity

There are $N$ people at a party, numbered from $0$ to $N-1$.

A person $c$ is called a  **celebrity**  if:

- every other person knows $c$, and
- $c$ does not know any other person.

The relationships are represented by an $N\times N$ matrix $M$, where:

- $M[i][j]=1$ means person $i$ knows person $j$;
- $M[i][j]=0$ means person $i$ does not know person $j$.

For a person $c$ to be a celebrity, the following conditions must hold for every $i\ne c$:

- $M[i][c]=1$
- $M[c][i]=0$

The diagonal entries $M[i][i]$ are  **irrelevant and must be ignored**.

Find the index of the celebrity. If no celebrity exists, print $-1$.

### Input Format
- The first line contains an integer $N$ — the number of people.
- Each of the next $N$ lines contains a binary string of length $N$, representing one row of the matrix $M$.

The $j^{\text{th}}$ character of the $i^{\text{th}}$ string represents $M[i][j]$.

### Output Format

Print a single integer — the index of the celebrity.

If no celebrity exists, print $-1$.

### Constraints
- $1\le N\le40$
- $M[i][j]\in\{0,1\}$
- Diagonal entries $M[i][i]$ are ignored.
### Sample 1:
Input
Output

```
3
010
000
010
```

```
1
```

### Explanation:

The relationship matrix is:

$$ M= \begin{bmatrix} 0 & 1 & 0 \\ 0 & 0 & 0 \\ 0 & 1 & 0 \end{bmatrix} $$

Person $1$ does not know anyone, while every other person knows person $1$.

Therefore, person $1$ is the celebrity.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-27T13:19:41.831Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] matrix = new String[n];

        for (int i = 0; i < n; i++)
        {
            matrix[i] = sc.next();
        }

        // Find a possible celebrity
        int candidate = 0;

        for (int i = 1; i < n; i++)
        {
            if (matrix[candidate].charAt(i) == '1')
            {
                // Candidate knows i, so candidate cannot be celebrity
                candidate = i;
            }
        }

        // Verify the candidate
        for (int i = 0; i < n; i++)
        {
            if (i == candidate)
                continue;

            // Everyone must know candidate
            if (matrix[i].charAt(candidate) != '1')
            {
                System.out.println(-1);
                return;
            }

            // Candidate must not know anyone
            if (matrix[candidate].charAt(i) != '0')
            {
                System.out.println(-1);
                return;
            }
        }

        System.out.println(candidate);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FTCL)