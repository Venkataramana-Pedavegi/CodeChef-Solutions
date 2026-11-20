# OOPSFUND15 - Rating 1250

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Linear Equation Solver

A mathematical application solves equations of the form:

$ax + b = cx + d$

where $a, b, c, d$ are integer coefficients.

Depending on the coefficients, an equation can have exactly one solution, no solution, or infinitely many solutions.

Your task is to implement the required classes using encapsulation, constructors, inheritance, and member functions.

Write both classes in the provided single source file. The `main()` function is already implemented and must not be modified.

 **1. Equation Class** 

- Create a class named Equation containing these private data members: Data memberTypea64-bit integerb64-bit integer
- Implement the following public methods: MethodDescriptionEquation(a, b)Constructor that initializes a and bgetA()Return the stored value of agetB()Return the stored value of b

 **2. LinearEquation Class** 

- Create a class named LinearEquation that publicly inherits from Equation.
- The derived class contains two additional private data members: Data memberTypec64-bit integerd64-bit integer
- Implement the following public methods: MethodDescriptionLinearEquation(a, b, c, d)Initialize the inherited coefficients through the base-class constructor and initialize c and dgetSolutionType()Return 0, 1, or 2 according to the number of solutionsgetSolution()Return the unique solution as a double

 **Solution Rules** 

- Rearrange the equation: $(a - c)x = d - b$
- The solution type is determined as follows: ConditionSolution typeReturn value$a - c \neq 0$Exactly one solution1$a - c = 0$ and $d - b \neq 0$No solution0$a - c = 0$ and $d - b = 0$Infinitely many solutions2
- When exactly one solution exists, calculate: $x = \frac{d - b}{a - c}$
- The getSolution() method is called only when getSolutionType() returns 1.

 **Implementation Instructions** 

- Implement the complete Equation and LinearEquation classes.
- Keep all specified data members private and methods public.
- Use inheritance to reuse the coefficients and public methods of Equation.
- Initialize the base-class members using its constructor, rather than duplicating them in the derived class.
- Use getA() and getB() in the derived class when calculating solutions.
- Do not read input or print output inside either class.
- Do not modify the locked main() function.
### Input Format
- The first line contains an integer T, denoting the number of test cases.
- Each of the next T lines contains four space-separated integers a b c d, representing the equation $ax+b=cx+d$.
### Output Format

For each test case, print exactly one line:

- One solution: x if the equation has exactly one solution.
- No solution if the equation has no solution.
- Infinite solutions if the equation has infinitely many solutions.

Print $x$ rounded to the nearest hundredth, with exactly two digits after the decimal point. If the exact solution is halfway between two hundredths, round away from zero.

For example, $4.975$ is printed as `4.98`, and $-4.975$ is printed as `-4.98`.

Print rounded zero as `0.00`, never `-0.00`.

The locked main() handles rounding and formatting. The getSolution() method must return the solution without rounding.

### Constraints
- $1\le T\le100$
- $-100\le a,b,c,d\le100$
- All coefficients are integers.
### Sample 1:
Input
Output

```
5
2 3 1 8
4 5 4 5
3 2 3 7
-2 4 1 -5
1 5 3 5

```

```
One solution: 5.00
Infinite solutions
No solution
One solution: 3.00
One solution: 0.00
```

### Explanation:

Test Case 1: $2x + 3 = x + 8$, giving $x = 5$.

Test Case 2: $4x + 5 = 4x + 5$, which holds for every real value of $x$.

Test Case 3: $3x + 2 = 3x + 7$ is impossible, so there is no solution.

Test Case 4: $-2x + 4 = x - 5$, giving $x = 3$.

Test Case 5: $x + 5 = 3x + 5$, giving $x = 0$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T14:28:27.021Z  

```java
import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

// Implement the complete Equation and LinearEquation classes here.
class Equation {
    private long a;
    private long b;

    public Equation(long a, long b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public long getB() {
        return b;
    }
}

class LinearEquation extends Equation {
    private long c;
    private long d;

    public LinearEquation(long a, long b, long c, long d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }

    public int getSolutionType() {
        long diffCoeff = getA() - c;
        long diffConst = d - getB();

        if (diffCoeff != 0) {
            return 1;
        } else if (diffConst != 0) {
            return 0;
        } else {
            return 2;
        }
    }

    public double getSolution() {
        return (double) (d - getB()) / (getA() - c);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder out = new StringBuilder();

        for (int t = 0; t < T; t++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            LinearEquation eq = new LinearEquation(a, b, c, d);
            int type = eq.getSolutionType();

            if (type == 0) {
                out.append("No solution\n");
            }
            else if (type == 2) {
                out.append("Infinite solutions\n");
            }
            else {
                double x = eq.getSolution();

                String rounded = BigDecimal.valueOf(x)
                        .setScale(2, RoundingMode.HALF_UP)
                        .toPlainString();

                out.append("One solution: ")
                   .append(rounded)
                   .append('\n');
            }
        }

        System.out.print(out);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND15)