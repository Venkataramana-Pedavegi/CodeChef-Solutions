# JAVALAMBDAT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:39:04.087Z  

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

[View on CodeChef](https://www.codechef.com/problems/JAVALAMBDAT)