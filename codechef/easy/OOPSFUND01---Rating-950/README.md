# OOPSFUND01 - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Vector Object Operations

You are given $N$ two-dimensional vectors. The $i$-th vector has coordinates $(X_i, Y_i)$.

Complete the unfinished members of the provided C++ `Vector2D` class. The data members, method declarations, input handling, query processing, and output handling are already provided.

Do not create another class or modify the provided member signatures or locked `main()` function.

### Task

Implement the following public members:

Member	Required behavior
`Vector2D(long long x, long long y)`	Initialize the coordinates using `this` and increment `objectCount` once.
`getX() const`	Return the current object's $x$ coordinate.
`getY() const`	Return the current object's $y$ coordinate.
`operator+(const Vector2D& other) const`	Return a new vector with coordinates $(x + \text{other}.x, \ y + \text{other}.y)$.
`operator*(long long k) const`	Return a new vector with coordinates $(xk, yk)$.
`dotProduct(const Vector2D& a, const Vector2D& b)`	Return $a.x \times b.x + a.y \times b.y$.
`getObjectCount()`	Return the static variable `objectCount`.

Both overloaded operators must leave their operands unchanged and return their result directly using `Vector2D(...)`.

The static counter starts at zero and increases whenever the two-parameter constructor executes. It must not decrease when an object is destroyed.

The provided program constructs exactly $N$ initial vector objects. Each `ADD` or `SCALE` operation constructs exactly one additional result object. `DOT` and `COUNT` construct no vector objects.

Use C++17 or later. The provided program does not copy vector objects or reallocate their storage after initialization.

### Operations

Vectors are numbered from $1$ to $N$.

- ADD A B: Use the overloaded + operator to add vectors $A$ and $B$. Print the resulting coordinates.
- SCALE A K: Use the overloaded * operator to multiply vector $A$ by $K$. Print the resulting coordinates.
- DOT A B: Print the dot product of vectors $A$ and $B$.
- COUNT: Print the total number of vector objects constructed so far.

The original vectors remain unchanged throughout execution. Result vectors are temporary and are not added to the original collection.

### Input Format
- The first line contains an integer $N$, the number of vectors.
- Each of the next $N$ lines contains two space-separated integers $X_i$ and $Y_i$.
- The next line contains an integer $Q$, the number of operations.
- Each of the next $Q$ lines contains one operation:

```
ADD A B
SCALE A K
DOT A B
COUNT

```

### Output Format

Print exactly one line for each operation:

- For ADD and SCALE, print two space-separated integers representing the resulting coordinates.
- For DOT, print the dot product.
- For COUNT, print the total number of vector objects constructed so far.
### Constraints
- $1 \le N,Q \le 10^5$
- $-10^4 \le X_i,Y_i,K \le 10^4$
- $1 \le A,B \le N$
- All calculations and results fit within signed 64-bit integers.
### Sample 1:
Input
Output

```
3
2 3
4 1
-1 5
5
ADD 1 2
DOT 1 2
SCALE 3 2
ADD 2 3
DOT 1 3
```

```
6 4
11
-2 10
3 6
13
```

### Explanation:

For the first operation:

```
ADD 1 2

```

The two vectors are $(2,3)$ and $(4,1)$.

Their sum is:

$$ (2+4,\ 3+1)=(6,4) $$

For the second operation:

```
DOT 1 2

```

The dot product is:

$$ 2 \times 4 + 3 \times 1 = 11 $$

For the third operation:

```
SCALE 3 2

```

The third vector is $(-1,5)$.

After multiplying both coordinates by $2$:

$$ (-1 \times 2,\ 5 \times 2)=(-2,10) $$

For the fourth operation:

```
ADD 2 3

```

The result is:

$$ (4 + (-1),\ 1+5)=(3,6) $$

For the final operation:

```
DOT 1 3

```

The result is:

$$ 2 \times (-1)+3 \times 5=13 $$

The `ADD` and `SCALE` operations create new objects only for their results. They do not modify the original vectors.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:16:17.288Z  

```java
import java.io.*;
import java.util.StringTokenizer;

class Vector2D {
    private long x;
    private long y;
    private static long objectCount = 0;

    public Vector2D(long x, long y) {
        this.x = x;
        this.y = y;
        objectCount++;
    }

    public long getX() {
        return x;
    }

    public long getY() {
        return y;
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(
                this.x + other.x,
                this.y + other.y
        );
    }

    public Vector2D scale(long k) {
        return new Vector2D(
                this.x * k,
                this.y * k
        );
    }

    public static long dotProduct(Vector2D a, Vector2D b) {
        return a.x * b.x + a.y * b.y;
    }

    public static long getObjectCount() {
        return objectCount;
    }
}

public class Main {
    private static final class FastScanner {
        private final BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        private StringTokenizer tokenizer;

        String next() throws IOException {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                String line = reader.readLine();
                if (line == null) {
                    throw new EOFException();
                }
                tokenizer = new StringTokenizer(line);
            }
            return tokenizer.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }

    public static void main(String[] args) throws IOException {
        FastScanner input = new FastScanner();
        BufferedWriter output =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int n = input.nextInt();

        Vector2D[] vectors = new Vector2D[n];

        for (int i = 0; i < n; i++) {
            long x = input.nextLong();
            long y = input.nextLong();
            vectors[i] = new Vector2D(x, y);
        }

        int q = input.nextInt();

        while (q-- > 0) {
            String operation = input.next();

            switch (operation) {
                case "ADD": {
                    int a = input.nextInt() - 1;
                    int b = input.nextInt() - 1;

                    Vector2D result = vectors[a].add(vectors[b]);

                    output.write(result.getX() + " " + result.getY());
                    break;
                }

                case "SCALE": {
                    int a = input.nextInt() - 1;
                    long k = input.nextLong();

                    Vector2D result = vectors[a].scale(k);

                    output.write(result.getX() + " " + result.getY());
                    break;
                }

                case "DOT": {
                    int a = input.nextInt() - 1;
                    int b = input.nextInt() - 1;

                    output.write(Long.toString(
                            Vector2D.dotProduct(vectors[a], vectors[b])
                    ));
                    break;
                }

                case "COUNT": {
                    output.write(Long.toString(
                            Vector2D.getObjectCount()
                    ));
                    break;
                }

                default:
                    throw new IllegalArgumentException("Invalid operation");
            }

            output.newLine();
        }

        output.flush();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND01)