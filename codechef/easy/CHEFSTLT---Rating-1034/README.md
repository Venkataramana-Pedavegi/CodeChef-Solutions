# CHEFSTLT - Rating 1034

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T16:21:16.656Z  

```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int XA = sc.nextInt();
            int XB = sc.nextInt();
            int XC = sc.nextInt();

            if (XA > 50) {
                System.out.println("A");
            } 
            else if (XB > 50) {
                System.out.println("B");
            } 
            else if (XC > 50) {
                System.out.println("C");
            } 
            else {
                System.out.println("NOTA");
            }
        }

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/CHEFSTLT)