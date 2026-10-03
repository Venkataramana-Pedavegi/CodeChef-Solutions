# SESO04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Linear Search in string

Given a string and a character as input, print the first position of the character in the string if it is present. If the character does not exist in the string, print " **-1** ".

### Input Format
- The first line contains a string.
- The second line contains a single character.
### Output Format
- Print the first position (0-based index) of the character in the string if it is present.
- Print "-1" if the character is not present in the string.
### Sample 1:
Input
Output

```
HelloHowYouDoing
w
```

```
7
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-03T16:10:10.284Z  

```java
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.next();
        
        char searchChar = scanner.next().charAt(0);
        
        int position = -1;
        
        for (int i = 0; i < inputString.length(); ++i) {
            if (inputString.charAt(i) == searchChar) {
                position = i;
                break; // 
            }
        }
        
        System.out.println(position);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SESO04)