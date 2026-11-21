# ADVJV09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Remove Multiples Using Iterator

You are given a list of $N$ integers and an integer $K$.

Using an `Iterator`, traverse the list and remove every element that is divisible by $K$.

You must use the `remove()` method of `Iterator` to remove elements during traversal.

Print the remaining elements in their original order.

If no elements remain, print `Empty`.

### Input Format
- The first line contains two integers $N$ and $K$.
- The second line contains $N$ integers.
### Output Format

Print the remaining elements separated by spaces.

If the list becomes empty, print:

```
Empty

```

### Sample 1:
Input
Output

```
6 3
10 12 15 20 21 25
```

```
10 20 25
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:09:04.275Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            numbers.add(sc.nextInt());
        }

        Iterator<Integer> iterator = numbers.iterator();

        while (iterator.hasNext())
        {
            int value = iterator.next();

            if (value % k == 0)
            {
                iterator.remove();
            }
        }

        if (numbers.isEmpty())
        {
            System.out.println("Empty");
        }
        else
        {
            for (int i = 0; i < numbers.size(); i++)
            {
                if (i > 0)
                {
                    System.out.print(" ");
                }

                System.out.print(numbers.get(i));
            }

            System.out.println();
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/ADVJV09)