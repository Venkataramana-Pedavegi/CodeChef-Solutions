# LIST05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Favorite Fruit Availability Report

A grocery application maintains a basket containing $N$ fruit names. You are also given a list of $M$ favorite fruits that need to be checked against the basket.

Fruit names must be compared case-insensitively. For example, Apple, APPLE, and apple represent the same fruit.

For each favorite fruit, determine whether it is available in the basket. After processing all queries, report the total number of favorite fruits that are available.

 **Task** 
Process all favorite-fruit queries using the stored `ArrayList` and produce the required availability report.

This version is more challenging because the learner must handle multiple queries, case-insensitive matching, duplicate basket entries, and aggregate the number of successful searches, rather than simply printing the result of `contains()` for fixed strings.

### Input Format
- The first line contains an integer $N$, the number of fruits in the basket.
- The next $N$ lines contain one fruit name each.
- The next line contains an integer $M$, the number of favorite fruits.
- The next $M$ lines contain one favorite fruit each.
### Output Format

For every favorite fruit, print:

- <fruit>: true if it is available in the basket, otherwise print:
- <fruit>: false

After all checks, print:

- Available Favorites: <count>
### Sample 1:
Input
Output

```
6
Apple
Banana
Mango
Orange
Apple
Grapes
5
apple
Kiwi
MANGO
banana
Papaya
```

```
apple: true
Kiwi: false
MANGO: true
banana: true
Papaya: false
Available Favorites: 3
```

### Explanation:

The checks are performed case-insensitively:

- apple matches Apple.
- Kiwi is not present.
- MANGO matches Mango.
- banana matches Banana.
- Papaya is not present.

Therefore, $3$ of the $5$ favorite fruits are available.

### Sample 2:
Input
Output

```
4
Strawberry
Kiwi
Lemon
Peach
2
Kiwi
Apple

```

```
true
false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:10:54.252Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList < String > basket =
            new ArrayList < > ();

        for (int i = 0; i < n; i++)
        {
            String fruit = sc.next();

            basket.add(
                fruit.toLowerCase()
            );
        }

        int m = sc.nextInt();

        int availableCount = 0;

        for (int i = 0; i < m; i++)
        {
            String favorite = sc.next();

            boolean available =
                basket.contains(
                    favorite.toLowerCase()
                );

            System.out.println(
                favorite + ": " + available
            );

            if (available)
            {
                availableCount++;
            }
        }

        System.out.println(
            "Available Favorites: " +
            availableCount
        );


        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LIST05)