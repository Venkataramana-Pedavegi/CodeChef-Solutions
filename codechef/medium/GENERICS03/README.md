# GENERICS03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Generic Value Analyzer

Implement a generic Java class `ValueAnalyzer<T>` that can work with different comparable data types.

The class must support values such as:

- Integer
- Double
- String

To compare generic values, use a bounded type parameter:

```
T extends Comparable<T>

```

### Task

Complete the class:

```
ValueAnalyzer<T extends Comparable<T>>

```

It must provide the following methods:

- add(T value) : Add a value to the collection.
- getMinimum() : Return the smallest stored value.
- getMaximum() : Return the largest stored value.
- contains(T value) : Return whether the value exists.
- size() : Return the number of stored values.

Values must be compared using `compareTo()`.

The driver code will create the appropriate generic object based on the input type.

### Input Format

The first line contains the data type:

```
INTEGER
DOUBLE
STRING

```

The second line contains an integer $N$.

The third line contains $N$ space-separated values of the specified type.

The fourth line contains one value $X$ to search for.

### Output Format

Print:

```
Minimum: <minimum>
Maximum: <maximum>
Size: <size>
Found: <true/false>

```

### Sample 1:
Input
Output

```
INTEGER
5
40 10 80 20 50
20
```

```
Minimum: 10
Maximum: 80
Size: 5
Found: true
```

### Sample 2:
Input
Output

```
STRING
4
Mango Apple Orange Banana
Grapes
```

```
Minimum: Apple
Maximum: Orange
Size: 4
Found: false
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:38:54.109Z  

```java
import java.io.*;
import java.util.*;

class ValueAnalyzer<T extends Comparable<T>>
{
    private final List<T> values;

    ValueAnalyzer()
    {
        values = new ArrayList<>();
    }

    void add(T value)
    {
        values.add(value);
    }

    T getMinimum()
    {
        T minimum = values.get(0);

        for (T value : values)
        {
            if (value.compareTo(minimum) < 0)
            {
                minimum = value;
            }
        }

        return minimum;
    }

    T getMaximum()
    {
        T maximum = values.get(0);

        for (T value : values)
        {
            if (value.compareTo(maximum) > 0)
            {
                maximum = value;
            }
        }

        return maximum;
    }

    boolean contains(T value)
    {
        return values.contains(value);
    }

    int size()
    {
        return values.size();
    }
}

class Main
{
    static <T extends Comparable<T>> void printResult(
        ValueAnalyzer<T> analyzer,
        T searchValue)
    {
        System.out.println(
            "Minimum: " + analyzer.getMinimum()
        );

        System.out.println(
            "Maximum: " + analyzer.getMaximum()
        );

        System.out.println(
            "Size: " + analyzer.size()
        );

        System.out.println(
            "Found: " + analyzer.contains(searchValue)
        );
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
            new BufferedReader(
                new InputStreamReader(System.in)
            );

        String type = br.readLine();

        int n =
            Integer.parseInt(br.readLine());

        StringTokenizer st =
            new StringTokenizer(br.readLine());

        if (type.equals("INTEGER"))
        {
            ValueAnalyzer<Integer> analyzer =
                new ValueAnalyzer<>();

            for (int i = 0; i < n; i++)
            {
                analyzer.add(
                    Integer.parseInt(st.nextToken())
                );
            }

            int searchValue =
                Integer.parseInt(br.readLine());

            printResult(analyzer, searchValue);
        }
        else if (type.equals("DOUBLE"))
        {
            ValueAnalyzer<Double> analyzer =
                new ValueAnalyzer<>();

            for (int i = 0; i < n; i++)
            {
                analyzer.add(
                    Double.parseDouble(st.nextToken())
                );
            }

            double searchValue =
                Double.parseDouble(br.readLine());

            printResult(analyzer, searchValue);
        }
        else if (type.equals("STRING"))
        {
            ValueAnalyzer<String> analyzer =
                new ValueAnalyzer<>();

            for (int i = 0; i < n; i++)
            {
                analyzer.add(st.nextToken());
            }

            String searchValue = br.readLine();

            printResult(analyzer, searchValue);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/GENERICS03)