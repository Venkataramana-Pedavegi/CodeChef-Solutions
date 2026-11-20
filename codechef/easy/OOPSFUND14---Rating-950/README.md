# OOPSFUND14 - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Quadratic Equation Solver

You are given $T$ quadratic equations of the form:

$$ ax^2+bx+c=0 $$

The coefficients $a$, $b$, and $c$ are integers, and $a \ne 0$.

Implement the complete `QuadraticEquation` class using encapsulation, a parameterized constructor, and member methods.

The input/output handling and `main()` function are provided and must not be modified.

 **Class Requirements** 

Declare three private `double` data members named `a`, `b`, and `c`.

Implement the following public members:

Member	Return type	Required functionality
`QuadraticEquation(double a, double b, double c)`	Constructor	Initialize all three coefficients
`getDiscriminant()`	`double`	Return $D=b^2-4ac$
`getRootCount()`	`int`	Return the number of distinct real roots
`getRoot1()`	`double`	Return $\dfrac{-b+\sqrt{D}}{2a}$
`getRoot2()`	`double`	Return $\dfrac{-b-\sqrt{D}}{2a}$

Determine the number of distinct real roots as follows:

- If $D>0$, return $2$.
- If $D=0$, return $1$.
- If $D<0$, return $0$.

The provided `main()` calls:

- Both root methods when $D>0$.
- Only getRoot1() when $D=0$.
- Neither root method when $D<0$.

Return roots without rounding. Do not read input or print output inside the class.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each of the next $T$ lines contains three space-separated integers $a$, $b$, and $c$.
### Output Format

For each test case, print exactly one line:

- Two Roots: r1 r2 if there are two distinct real roots.
- One Root: r if there is one distinct real root.
- No real solutions if there are no real roots.

For two roots, print the result of `getRoot1()` first and `getRoot2()` second. Do not sort them.

Print each root with exactly two digits after the decimal point, rounded to the nearest hundredth. If a root is exactly halfway between two hundredths, round away from zero.

For example:

- $1.125$ is printed as 1.13.
- $-1.125$ is printed as -1.13.

Any value that rounds to zero must be printed as `0.00`, never `-0.00`.

The locked `main()` handles rounding and output formatting.

### Constraints
- $1 \le T \le 100$
- $-100 \le a,b,c \le 100$
- $a \ne 0$
- All coefficients are integers.

Within these bounds, the discriminant is represented exactly by `double`. No epsilon comparison is required when determining its sign.

### Sample 1:
Input
Output

```
4
1 -5 6
1 -2 1
1 2 5
2 -7 3
```

```
Two Roots: 3.00 2.00
One Root: 1.00
No real solutions
Two Roots: 3.00 0.50
```

### Explanation:

For the first equation, $x^2-5x+6=0$:

$D=(-5)^2-4(1)(6)=1$

Since the discriminant is positive, two real roots exist: $3$ and $2$.

For the second equation, $x^2-2x+1=0$, the discriminant is zero, so the equation has one distinct real root, $1$.

For the third equation, $x^2+2x+5=0$, the discriminant is $-16$, so there are no real solutions.

For the fourth equation, $2x^2-7x+3=0$, the discriminant is $25$, giving roots $3$ and $0.5$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-20T14:26:23.733Z  

```java
import java.util.*;

// Write the complete QuadraticEquation class here.
class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public int getRootCount() {
        double d = getDiscriminant();
        if (d > 0) {
            return 2;
        } else if (d == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

            QuadraticEquation eq =
                new QuadraticEquation(a, b, c);

            int count = eq.getRootCount();

            if (count == 0) {
                output.append("No real solutions\n");
            }
            else if (count == 1) {
                double x = eq.getRoot1();

                if (Math.abs(x) < 0.005)
                    x = 0;

                output.append(String.format(
                    Locale.US, "One Root: %.2f%n", x
                ));
            }
            else {
                double x = eq.getRoot1();
                double y = eq.getRoot2();

                if (Math.abs(x) < 0.005)
                    x = 0;

                if (Math.abs(y) < 0.005)
                    y = 0;

                output.append(String.format(
                    Locale.US,
                    "Two Roots: %.2f %.2f%n", x, y
                ));
            }
        }

        System.out.print(output);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND14)