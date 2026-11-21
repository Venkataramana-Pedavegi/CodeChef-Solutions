# MULTTHREAD02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Alternating Index Multiplier

You are given a list of $N$ integers and an integer multiplication factor $K$. The elements of the list must be processed concurrently using two threads:

- One thread processes elements at even indices: $0, 2, 4, \dots$
- The other thread processes elements at odd indices: $1, 3, 5, \dots$

For every index $i$, the transformed value is: $B_i = A_i \times K$

The transformed value must be stored at the same index in the output list. The driver code creates and manages both threads. Your task is to implement only the `Multiplier` class.

During its execution, each worker must call `Thread.yield()` after processing an element.

### Task

Complete the `Multiplier` class.

The driver code will create two `Multiplier` objects with different starting indices and execute them concurrently.

### Output Format

The driver code prints the transformed list in the following format:

```
Output List: [B0, B1,..., BN-1]

```

### Sample 1:
Input
Output

```
6 2
1 2 3 4 5 6
```

```
Output List: [2, 4, 6, 8, 10, 12]
```

### Explanation:

The thread responsible for  **even indices**  processes: $A_0, A_2, A_4$

The thread responsible for  **odd indices**  processes: $A_1, A_3, A_5$

After multiplying each element by $K = 2$ and storing them back at their corresponding indices, the output list becomes: $\text{[2, 4, 6, 8, 10, 12]}$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:02:55.642Z  

```java
import java.util.*;

class Multiplier extends Thread
{
    private final List<Integer> input;
    private final List<Integer> output;
    private final int startIndex;
    private final int factor;

    Multiplier(
            List<Integer> input,
            List<Integer> output,
            int startIndex,
            int factor)
    {
        this.input = input;
        this.output = output;
        this.startIndex = startIndex;
        this.factor = factor;
    }

    @Override
    public void run()
    {
        for (int i = startIndex;
             i < input.size();
             i += 2)
        {
            int value = input.get(i) * factor;

            output.set(i, value);

            Thread.yield();
        }
    }
}

class Codechef
{
    public static void main(String[] args)
            throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int factor = sc.nextInt();

        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            input.add(sc.nextInt());
        }

        List<Integer> output =
                Collections.synchronizedList(
                    new ArrayList<>(
                        Collections.nCopies(n, 0)
                    )
                );

        Multiplier evenThread =
                new Multiplier(
                    input,
                    output,
                    0,
                    factor
                );

        Multiplier oddThread =
                new Multiplier(
                    input,
                    output,
                    1,
                    factor
                );

        evenThread.start();
        oddThread.start();

        evenThread.join();
        oddThread.join();

        System.out.println(
            "Output List: " + output
        );

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MULTTHREAD02)