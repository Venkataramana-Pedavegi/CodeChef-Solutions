# OOPSFUND12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### 3D Printing Job Comparison

Each printing job has a length, width, height, and material.

Implement the required classes to compare two printing jobs and calculate their manufacturing costs using the selected pricing policy.

Use encapsulation, inheritance, abstraction, and runtime polymorphism.

The input/output handling and `main()` function are provided. Write all required classes above the locked `main()` function without modifying it.

 **1. PrintJob Class** 

Declare the following private data members:

Data member	Type
`length`	`double`
`width`	`double`
`height`	`double`
`volume`	`double`
`material`	`string` in C++; `String` in Java

Implement the following public methods:

Method	Return type	Required functionality
`set_length(double l)`	`void`	Assign `l` to `length`
`set_width(double w)`	`void`	Assign `w` to `width`
`set_height(double h)`	`void`	Assign `h` to `height`
`set_material(m)`	`void`	Assign the string parameter `m` to `material`
`calculate_volume()`	`void`	Calculate `length  *width*  height` and store it in `volume`
`get_volume()`	`double`	Return the stored volume
`matches(other)`	`bool` in C++; `boolean` in Java	Return whether the stored volumes are equal and the materials are identical

The material comparison is case-sensitive. Different dimensions can produce matching jobs.

The provided `main()` sets all dimensions and materials and calls `calculate_volume()` on both jobs before comparing them or calculating their costs.

 **2. PrintPolicy Class** 

Create an abstract base class named `PrintPolicy`.

Declare a public abstract method named `charge` that accepts a printing job and returns its manufacturing cost as a `double`.

The method must support runtime polymorphism through the common `PrintPolicy` type.

For C++, use the following declarations:

```
virtual double charge(const PrintJob& job) const = 0;
virtual ~PrintPolicy() = default;

```

The virtual destructor is required because the locked `main()` destroys derived policy objects through base-class pointers.

For Java, use:

```
public abstract double charge(PrintJob job);

```

`PrintPolicy` must not be instantiated directly.

For C++, declare `PrintJob::get_volume()` as a `const` member function so that `charge()` can call it through a constant reference.

 **3. BasicPolicy Class** 

Create a class named `BasicPolicy` that inherits publicly from `PrintPolicy` in C++, or extends it in Java.

Override `charge()` to return:

$$ \text{Cost}=2\times\text{Volume} $$

 **4. SupportPolicy Class** 

Create a class named `SupportPolicy` that inherits publicly from `PrintPolicy` in C++, or extends it in Java.

Declare a private `double` data member named `extra`.

Implement:

- A public constructor SupportPolicy(double extra) that initializes the additional fee.
- An overridden charge() method that returns:
$$ \text{Cost}=2\times\text{Volume}+\text{extra} $$

Apply the additional fee separately to each printing job.

 **Implementation Requirements** 

- Implement all four classes with the specified names.
- Keep the specified data members private and the required methods public.
- Use method overriding and runtime polymorphism for the pricing policies.
- Do not modify either printing job during comparison or cost calculation.
- Do not perform input or output inside the required classes.
- Do not modify the locked main() function.
- In C++, policy ownership and smart-pointer handling are provided in the locked code; students are not required to implement them.
### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains three lines: The first line contains l1 w1 h1 m1, representing the first job's dimensions and material. The second line contains l2 w2 h2 m2, representing the second job's dimensions and material. The third line contains mode extra.

The value of `mode` is either `BASIC` or `SUPPORT`.

- For BASIC, read extra but ignore its value. It is not required to be zero.
- For SUPPORT, add extra to the cost of each job.
### Output Format

For each test case, print exactly two lines:

- First line: Matching Jobs if both jobs have equal stored volumes and identical materials; otherwise, Non-Matching Jobs.
- Second line: The manufacturing costs of the first and second jobs, separated by one space, each printed with exactly two digits after the decimal point.

Do not print blank lines between test cases.

### Constraints
- $1 \le T \le 1000$
- $0.5 \le l_1,w_1,h_1,l_2,w_2,h_2 \le 10000$
- Every dimension is a multiple of $0.5$, written as an integer or with one decimal digit.
- $0 \le \text{extra} \le 10^6$
- extra is an integer.
- Each material name contains between $1$ and $20$ uppercase or lowercase English letters, without spaces.
- mode is either BASIC or SUPPORT.

Under these bounds, the dimensions and volume products are represented exactly by `double`. Compare stored volumes using exact equality; no epsilon comparison is required.

### Sample 1:
Input
Output

```
4
2 3 4 PLA
4 2 3 PLA
BASIC 7
2 3 4 PLA
2 3 5 PLA
SUPPORT 10
4 4 2 ABS
2 4 4 PLA
SUPPORT 0
1 2 3 Resin
3 2 1 resin
BASIC 0
```

```
Matching Jobs
48.00 48.00
Non-Matching Jobs
58.00 70.00
Non-Matching Jobs
64.00 64.00
Non-Matching Jobs
12.00 12.00
```

### Explanation:
- Test case 1: Both jobs have volume $24$ and material PLA. Basic pricing gives a cost of $48$ for each job. The supplied extra value $7$ is ignored.
- Test case 2: The volumes are $24$ and $30$. Adding the support fee of $10$ gives costs of $58$ and $70$.
- Test case 3: Both jobs have volume $32$, but their materials differ.
- Test case 4: Both jobs have volume $6$, but Resin and resin differ because material comparison is case-sensitive.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T14:01:11.205Z  

```java
import java.util.*;

// Implement the complete classes here:
// 1. PrintJob
// 2. PrintPolicy
// 3. BasicPolicy
// 4. SupportPolicy
class PrintJob {
    private double length;
    private double width;
    private double height;
    private double volume;
    private String material;

    public void set_length(double l) {
        this.length = l;
    }

    public void set_width(double w) {
        this.width = w;
    }

    public void set_height(double h) {
        this.height = h;
    }

    public void set_material(String m) {
        this.material = m;
    }

    public void calculate_volume() {
        this.volume = this.length * this.width * this.height;
    }

    public double get_volume() {
        return this.volume;
    }

    public boolean matches(PrintJob other) {
        if (other == null) {
            return false;
        }
        return this.volume == other.volume && Objects.equals(this.material, other.material);
    }
}

abstract class PrintPolicy {
    public abstract double charge(PrintJob job);
}

class BasicPolicy extends PrintPolicy {
    @Override
    public double charge(PrintJob job) {
        return 2.0 * job.get_volume();
    }
}

class SupportPolicy extends PrintPolicy {
    private double extra;

    public SupportPolicy(double extra) {
        this.extra = extra;
    }

    @Override
    public double charge(PrintJob job) {
        return (2.0 * job.get_volume()) + this.extra;
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        for (int t = 0; t < T; t++) {
            double l1 = sc.nextDouble();
            double w1 = sc.nextDouble();
            double h1 = sc.nextDouble();
            String m1 = sc.next();

            double l2 = sc.nextDouble();
            double w2 = sc.nextDouble();
            double h2 = sc.nextDouble();
            String m2 = sc.next();

            String mode = sc.next();
            double extra = sc.nextDouble();

            PrintJob a = new PrintJob();
            PrintJob b = new PrintJob();

            a.set_length(l1);
            a.set_width(w1);
            a.set_height(h1);
            a.set_material(m1);
            a.calculate_volume();

            b.set_length(l2);
            b.set_width(w2);
            b.set_height(h2);
            b.set_material(m2);
            b.calculate_volume();

            PrintPolicy policy = mode.equals("BASIC")
                ? new BasicPolicy()
                : new SupportPolicy(extra);

            output.append(a.matches(b)
                ? "Matching Jobs"
                : "Non-Matching Jobs").append('\n');

            output.append(String.format(
                Locale.US,
                "%.2f %.2f%n",
                policy.charge(a),
                policy.charge(b)
            ));
        }

        System.out.print(output);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND12)