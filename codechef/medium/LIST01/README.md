# LIST01

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Modify Even Elements

You are required to read a list of numbers from the user, check each one, and apply a specific update based on whether the number is even or odd.

 **Tasks** :

- Take an integer n as input which represents the size of the ArrayList.
- Take input of n integers from the user and store them in an ArrayList.
- For each element in the ArrayList: If the element is even, update it by adding 1. If the element is odd, leave it unchanged.
- Print the entire updated array.
### Input Format
- The first line contains a single integer n — representing the size of the ArrayList.
- The second line contains n space-separated integers representing the elements of the ArrayList.
### Output Format
- Print the updated array elements separated by spaces, preceded by the label Updated Array:.
### Sample 1:
Input
Output

```
5
10 3 4 7 8
```

```
Updated Array:
11
3
5
7
9
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:10:13.903Z  

```java
import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.set(i, numbers.get(i) + 1);
            }
        }
        
        System.out.println("Updated Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(numbers.get(i));
        }
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/LIST01)