# OOPSFUND02J - Rating 950

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:16:21.085Z  

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

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND02J)