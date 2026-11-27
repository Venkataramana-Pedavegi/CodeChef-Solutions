# GENERICS02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generic Triplet Record Manager

Implement a generic Java class `Triplet<T, U, V>` that stores three values of possibly different data types.

For this problem, the driver code creates:

```
Triplet<Integer, String, Double>

```

to store:

- an integer in first;
- a string in second;
- a double in third.

Initially, all three values must be `null`.

You are then given $Q$ operations that modify or inspect the triplet.

 **Task** 
Complete the generic `Triplet<T, U, V>` class with the following features:

- A default constructor that initializes all three values to null.
- setFirst(T value)
- setSecond(U value)
- setThird(V value)
- getFirst()
- getSecond()
- getThird()
- isComplete() — returns true only when none of the three values is null.
- reset() — sets all three values back to null.

 **Operations** 
Each operation is one of the following:

- FIRST X : Store integer $X$ in first.
- SECOND X : Store string $X$ in second.
- THIRD X : Store double $X$ in third.
- CHECK : Print Complete if all three values are present; otherwise print Incomplete.
- PRINT : Print the three current values on one line.
- RESET : Set all three values to null.

For `PRINT`, a missing value must be printed as `null`.

### Input Format
- The first line contains an integer $Q$.
- Each of the next $Q$ lines contains one operation.
### Output Format

For every `CHECK` or `PRINT` operation, print the required result.

For `PRINT`, use the format:

```
first second third

```

### Constraints
- $1 \le Q \le 10^4$
- $-10^9 \le X \le 10^9$ for FIRST
- SECOND values contain no spaces.
### Sample 1:
Input
Output

```
9
CHECK
FIRST 10
SECOND Hello
PRINT
THIRD 3.5
CHECK
PRINT
RESET
PRINT
```

```
Incomplete
10 Hello null
Complete
10 Hello 3.5
null null null
```

### Explanation:

The triplet starts as:

```
null null null

```

After storing `10` and `Hello`, the third value is still missing, so the triplet is incomplete.

After storing `3.5`, all three generic values are available:

```
10 Hello 3.5

```

The `RESET` operation restores all values to `null`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:38:22.958Z  

```java
import java.io.*;
import java.util.*;

class Triplet<T, U, V>
{
    private T first;
    private U second;
    private V third;

    Triplet()
    {
        first = null;
        second = null;
        third = null;
    }

    void setFirst(T value)
    {
        first = value;
    }

    void setSecond(U value)
    {
        second = value;
    }

    void setThird(V value)
    {
        third = value;
    }

    T getFirst()
    {
        return first;
    }

    U getSecond()
    {
        return second;
    }

    V getThird()
    {
        return third;
    }

    boolean isComplete()
    {
        return first != null &&
               second != null &&
               third != null;
    }

    void reset()
    {
        first = null;
        second = null;
        third = null;
    }
}

class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int q = Integer.parseInt(br.readLine());

        Triplet<Integer, String, Double> triplet =
            new Triplet<>();

        while (q-- > 0)
        {
            StringTokenizer st =
                new StringTokenizer(br.readLine());

            String operation = st.nextToken();

            if (operation.equals("FIRST"))
            {
                int value =
                    Integer.parseInt(st.nextToken());

                triplet.setFirst(value);
            }
            else if (operation.equals("SECOND"))
            {
                String value = st.nextToken();

                triplet.setSecond(value);
            }
            else if (operation.equals("THIRD"))
            {
                double value =
                    Double.parseDouble(st.nextToken());

                triplet.setThird(value);
            }
            else if (operation.equals("CHECK"))
            {
                System.out.println(
                    triplet.isComplete()
                    ? "Complete"
                    : "Incomplete"
                );
            }
            else if (operation.equals("PRINT"))
            {
                System.out.println(
                    triplet.getFirst() + " " +
                    triplet.getSecond() + " " +
                    triplet.getThird()
                );
            }
            else if (operation.equals("RESET"))
            {
                triplet.reset();
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GENERICS02)