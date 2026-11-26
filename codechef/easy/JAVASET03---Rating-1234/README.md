# JAVASET03 - Rating 1234

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Dynamic Set Operations Analyzer

You are given an initial set of $N$ integers and $Q$ operations.

For each operation, another set of integers is provided. Update the current set according to the operation:

- UNION — Add all elements of the given set.
- INTERSECTION — Keep only common elements.
- DIFFERENCE — Remove all elements present in the given set.

Duplicate values in the input should automatically be ignored.

### Input Format
- The first line contains an integer $N$.
- The second line contains $N$ integers representing the initial set.
- The third line contains an integer $Q$.
- Each operation consists of: A line containing the operation name and an integer $K$. The next line containing $K$ integers.

The operation name is one of:

```
UNION
INTERSECTION
DIFFERENCE

```

### Output Format

After every operation, print:

```
Size: X

```

where $X$ is the current number of elements.

After all operations, print:

```
Final Set: elements

```

If the final set is empty, print:

```
Final Set: Empty

```

### Sample 1:
Input
Output

```
5
1 2 3 4 5
4
UNION 3
5 6 7
DIFFERENCE 2
2 6
INTERSECTION 4
1 3 4 8
UNION 3
8 9 3
```

```
Size: 7
Size: 5
Size: 3
Size: 5
Final Set: 1 3 4 8 9
```

### Explanation:

 **Initial Set:** 
`{1, 2, 3, 4, 5}`

- UNION {5, 6, 7} $\rightarrow$ {1, 2, 3, 4, 5, 6, 7}
- DIFFERENCE {2, 6} $\rightarrow$ {1, 3, 4, 5, 7}
- INTERSECTION {1, 3, 4, 8} $\rightarrow$ {1, 3, 4}
- UNION {8, 9, 3} $\rightarrow$ {1, 3, 4, 8, 9}

 **Final Result:** 
`{1, 3, 4, 8, 9}`

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:10:51.255Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Set<Integer> currentSet = new TreeSet<>();

        for (int i = 0; i < n; i++)
        {
            currentSet.add(sc.nextInt());
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++)
        {
            String operation = sc.next();
            int k = sc.nextInt();

            Set<Integer> otherSet = new HashSet<>();

            for (int j = 0; j < k; j++)
            {
                otherSet.add(sc.nextInt());
            }

            if (operation.equals("UNION"))
            {
                currentSet.addAll(otherSet);
            }
            else if (operation.equals("INTERSECTION"))
            {
                currentSet.retainAll(otherSet);
            }
            else if (operation.equals("DIFFERENCE"))
            {
                currentSet.removeAll(otherSet);
            }

            System.out.println("Size: " + currentSet.size());
        }

        System.out.print("Final Set: ");

        if (currentSet.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            boolean first = true;

            for (int value : currentSet)
            {
                if (!first)
                {
                    System.out.print(" ");
                }

                System.out.print(value);
                first = false;
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/JAVASET03)