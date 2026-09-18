# MASKPOL - Rating 1064

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-18T15:22:12.475Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if (X >= Y) {
                System.out.println("PIZZA");
            }
            else if (X >= Z) {
                System.out.println("BURGER");
            }
            else {
                System.out.println("NOTHING");
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MASKPOL)