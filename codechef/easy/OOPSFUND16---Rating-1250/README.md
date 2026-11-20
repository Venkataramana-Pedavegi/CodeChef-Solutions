# OOPSFUND16 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Arithmetic Progression Analyzer

A mathematical application analyzes arithmetic progressions. An arithmetic progression (AP) is a sequence in which the difference between consecutive terms remains constant.

For an arithmetic progression with first term $a$, common difference $d$, and number of terms $n$, the application must calculate the last term, the sum of the first $n$ terms, and the progression's direction.

Your task is to implement the required classes using encapsulation, constructors, inheritance, and member functions.

 **1. Sequence Class** 

- Create a class named Sequence containing the following private data members: Data memberTypea64-bit integerd64-bit integer
- Implement the following public methods: MethodDescriptionSequence(a, d)Constructor that initializes the first term and common differencegetFirstTerm()Return the stored first termgetDifference()Return the stored common difference

 **2. ArithmeticProgression Class** 

- Create a class named ArithmeticProgression that inherits publicly from Sequence.
- The derived class must contain one additional private data member: Data memberTypen64-bit integer
- Implement the following public methods: MethodDescriptionArithmeticProgression(a, d, n)Initialize the inherited members using the base-class constructor and store ngetLastTerm()Return the $n$-th termgetSum()Return the sum of the first $n$ termsgetTrend()Return INCREASING, DECREASING, or CONSTANT based on the common difference

 **Calculation Rules** 

- The last term is: $L = a + (n - 1)d$
- The sum of the first $n$ terms is: $S = \frac{n(2a + (n - 1)d)}{2}$
- Determine the trend as follows: ConditionTrend$d > 0$INCREASING$d < 0$DECREASING$d = 0$CONSTANT
- The trend depends on $d$, including when $n = 1$.

 **Implementation Instructions** 

- Implement both Sequence and ArithmeticProgression above the provided main function.
- Keep all specified data members private and methods public.
- Initialize inherited data members through the base-class constructor.
- The derived class must use getFirstTerm() and getDifference() to access inherited values.
- Implement getLastTerm(), getSum(), and getTrend() without reading input or printing output inside either class.
- Do not modify the locked main function.
### Input Format
- The first line contains an integer T, denoting the number of test cases.
- Each of the next T lines contains three space-separated integers a d n, representing the first term, common difference, and number of terms.
### Output Format

For each test case, print exactly one line containing:

`lastTerm sum trend`

Separate the three values with a single space.

### Constraints
- $1\le T\le100$
- $-10^5\le a,d\le10^5$
- $1\le n\le10^5$
- All intermediate calculations and results fit within signed 64-bit integers.
### Sample 1:
Input
Output

```
5
2 3 5
10 -2 4
7 0 6
-5 4 3
8 -3 1
```

```
14 40 INCREASING
4 28 DECREASING
7 42 CONSTANT
3 -3 INCREASING
8 8 DECREASING
```

### Explanation:

For the first test case, the progression is `2, 5, 8, 11, 14`. Its last term is 14, the sum is 40, and the trend is increasing.

For the second test case, the progression is `10, 8, 6, 4`. The last term is 4, the sum is 28, and the trend is decreasing.

For the third test case, all six terms equal 7. The sum is 42 and the trend is constant.

For the fourth test case, the progression is `-5, -1, 3`. Its sum is -3.

For the fifth test case, the progression contains only the term 8. The trend is still classified as decreasing because the specified common difference is -3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T14:29:57.565Z  

```java
import java.util.*;

// Write the complete Sequence and ArithmeticProgression classes here.
class Sequence {
    private long a;
    private long d;

    public Sequence(long a, long d) {
        this.a = a;
        this.d = d;
    }

    public long getFirstTerm() {
        return a;
    }

    public long getDifference() {
        return d;
    }
}

class ArithmeticProgression extends Sequence {
    private long n;

    public ArithmeticProgression(long a, long d, long n) {
        super(a, d);
        this.n = n;
    }

    public long getLastTerm() {
        return getFirstTerm() + (n - 1) * getDifference();
    }

    public long getSum() {
        return (n * (2 * getFirstTerm() + (n - 1) * getDifference())) / 2;
    }

    public String getTrend() {
        long d = getDifference();
        if (d > 0) {
            return "INCREASING";
        } else if (d < 0) {
            return "DECREASING";
        } else {
            return "CONSTANT";
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        while (T-- > 0) {
            long a = sc.nextLong();
            long d = sc.nextLong();
            long n = sc.nextLong();

            ArithmeticProgression ap =
                new ArithmeticProgression(a, d, n);

            out.append(ap.getLastTerm()).append(' ')
               .append(ap.getSum()).append(' ')
               .append(ap.getTrend()).append('\n');
        }

        System.out.print(out);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND16)