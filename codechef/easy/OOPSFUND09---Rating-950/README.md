# OOPSFUND09 - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Rectangle Comparison Using Classes and Objects

Two rectangles match if their areas are equal and their colors are identical. Their lengths and widths need not be the same.

Implement the complete `Rectangle` class above the provided locked `main()` function. Do not modify the input/output handling or locked code.

 **Class Requirements** 

Declare four private instance variables:

Variable	Type
`length`	`double`
`width`	`double`
`area`	`double`
`color`	`String` in Java; `string` in C++

Implement the following public methods:

Method	Return type	Required functionality
`set_length(double l)`	`void`	Assign `l` to `length`
`set_width(double w)`	`void`	Assign `w` to `width`
`set_color(c)`	`void`	Assign `c` to `color`; the parameter is a string
`find_area()`	`void`	Calculate `length * width` and store it in `area`
`matches(other)`	`boolean` in Java; `bool` in C++	Return whether the stored areas and colors match

Use the current object reference explicitly in all three setters: `this` in Java or `this->` in C++.

The `matches()` method accepts another rectangle as `Rectangle other` in Java or `const Rectangle& other` in C++.

 **Comparison Rules** 

- Compare the stored areas using exact equality.
- Colors must contain exactly the same characters in the same case.
- Different dimensions can produce matching rectangles.
- Neither rectangle may be modified by matches().

Every input dimension is an integer or an integer plus $0.5$. Under the given bounds, these dimensions and their area products are represented exactly by `double`, so no epsilon comparison is required.

The provided `main()` sets all dimensions and colors and calls `find_area()` on both rectangles before calling `matches()`.

### Input Format
- The first line contains an integer $T$, the number of test cases.
- Each test case contains two lines: The first line contains $l_1$, $w_1$, and $c_1$, the first rectangle's length, width, and color. The second line contains $l_2$, $w_2$, and $c_2$, the second rectangle's length, width, and color.

Values on each line are separated by spaces.

### Output Format

For each test case, print exactly one line:

- Matching Rectangles if the stored areas are equal and the colors are identical.
- Non-Matching Rectangles otherwise.
### Constraints
- $1 \le T \le 1000$
- $0.5 \le l_1,w_1,l_2,w_2 \le 10000$
- Each dimension is a multiple of $0.5$, written as an integer or with one decimal digit.
- $1 \le |c_1|,|c_2| \le 20$
- Colors contain only uppercase and lowercase English letters, without spaces.
### Sample 1:
Input
Output

```
4
5 4 Red
5 4 Red
5 4 Red
6 4 Blue
2 10 Green
4 5 Green
2.5 4 Blue
5 2 blue
```

```
Matching Rectangles
Non-Matching Rectangles
Matching Rectangles
Non-Matching Rectangles
```

### Explanation:
- Test case 1: Both rectangles have area $20$ and color Red.
- Test case 2: The areas are $20$ and $24$, and the colors also differ.
- Test case 3: Both rectangles have area $20$ and color Green, despite having different dimensions.
- Test case 4: Both rectangles have area $10$, but Blue and blue differ because color comparison is case-sensitive.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T13:58:47.441Z  

```java
import java.util.*;

// Write the complete Rectangle class here.

class Rectangle {
    private double length;
    private double width;
    private double area;
    private String color;

    public void set_length(double l) {
        this.length = l;
    }

    public void set_width(double w) {
        this.width = w;
    }

    public void set_color(String c) {
        this.color = c;
    }

    public void find_area() {
        this.area = this.length * this.width;
    }

    public boolean matches(Rectangle other) {
        return this.area == other.area && this.color.equals(other.color);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            double l1 = sc.nextDouble();
            double w1 = sc.nextDouble();
            String c1 = sc.next();

            double l2 = sc.nextDouble();
            double w2 = sc.nextDouble();
            String c2 = sc.next();

            Rectangle r1 = new Rectangle();
            Rectangle r2 = new Rectangle();

            r1.set_length(l1);
            r1.set_width(w1);
            r1.set_color(c1);
            r1.find_area();

            r2.set_length(l2);
            r2.set_width(w2);
            r2.set_color(c2);
            r2.find_area();

            System.out.println(
                r1.matches(r2)
                    ? "Matching Rectangles"
                    : "Non-Matching Rectangles"
            );
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND09)