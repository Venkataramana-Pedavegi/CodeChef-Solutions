# BSEX03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-08T16:28:17.381Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();

            long layers = (long) ((Math.sqrt(8 * N + 1) - 1) / 2);

            System.out.println(layers);
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/BSEX03)