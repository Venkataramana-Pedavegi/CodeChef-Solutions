# SESO06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Find Kth Character Position

Given a string  **s1**, a character  **c1**, and an integer  **k**, find and print the position of the $k$th occurrence of the character  **c1**  in the string  **s1**. If the $k$th occurrence does not exist, print  **-1**.

### Input Format
- The first line contains the string s1, the character c1, and the integer k separated by spaces.
### Output Format
- An integer representing the position of the $k$th occurrence of c1 in s1.
- If the $k$th occurrence does not exist, print -1.
### Output Format
- $1 \le |s1| \le 100$
- $1 \le k \le 100$
### Sample 1:
Input
Output

```
HelloHowyoudoing H 2
```

```
5
```

### Sample 2:
Input
Output

```
funny n 3
```

```
-1
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:14:34.532Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNext()) {
            String s1 = scanner.next();
            char c1 = scanner.next().charAt(0);
            int k = scanner.nextInt();
            
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) == c1) {
                    count++;
                    if (count == k) {
                        System.out.println(i);
                        scanner.close();
                        return;
                    }
                }
            }
            
            System.out.println(-1);
            scanner.close();
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO06)