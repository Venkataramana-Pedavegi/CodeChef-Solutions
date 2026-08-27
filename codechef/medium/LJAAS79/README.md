# LJAAS79

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Vowel or Consonant

Create a program that takes a lowercase English alphabetic character as input and uses a  **switch**  statement to determine if it's a  **vowel**  or  **consonant**.

### Sample 1:
Input
Output

```
i
```

```
Vowel
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-27T13:57:12.041Z  

```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);

        switch(ch) {
            case 'a': 
                System.out.println("Vowel"); 
                break;
            case 'e': 
                System.out.println("Vowel"); 
                break;
            case 'i': 
                System.out.println("Vowel"); 
                break;
            case 'o': 
                System.out.println("Vowel"); 
                break;
            case 'u': 
                System.out.println("Vowel"); 
                break;
            default: 
                System.out.println("Consonant");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LJAAS79)