# LIST02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inventory Cleanup Using ListIterator

A store maintains a list of product names. Before displaying the final inventory, the list must be cleaned according to a set of rules.

You are given $N$ product names. Traverse the list using a `ListIterator` and perform the following operations during the same traversal:

- Remove every product whose name starts with a vowel (A, E, I, O, or U, case-insensitive).
- If a product is not removed and its name has more than $5$ characters, replace it with its uppercase version using the iterator's set() method.
- Leave all other product names unchanged.

After processing the entire list, print the remaining products in their original relative order.

### Input Format
- The first line contains an integer $N$, the number of products.
- The next $N$ lines each contain one product name.
### Output Format

Print the updated list in the following format:

`Updated List: [item1, item2,...]`

If all products are removed, print:

`Updated List: []`

### Sample 1:
Input
Output

```
6
Apple
Banana
Orange
Mango
Grapes
Umbrella
```

```
Updated List: [BANANA, Mango, GRAPES]
```

### Explanation:
- Apple starts with a vowel (A), so it is removed.
- Banana does not start with a vowel and has more than $5$ characters ($6$), so it is updated to BANANA.
- Orange starts with a vowel (O), so it is removed.
- Mango does not start with a vowel and has $5$ characters (not more than $5$), so it remains unchanged as Mango.
- Grapes does not start with a vowel and has more than $5$ characters ($6$), so it is updated to GRAPES.
- Umbrella starts with a vowel (U), so it is removed.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:14:25.816Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        ArrayList<String> products =
                new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            products.add(sc.nextLine());
        }

        ListIterator<String> iterator =
                products.listIterator();

        while (iterator.hasNext())
        {
            String product = iterator.next();

            char firstChar =
                    Character.toUpperCase(
                            product.charAt(0)
                    );

            if (firstChar == 'A' ||
                firstChar == 'E' ||
                firstChar == 'I' ||
                firstChar == 'O' ||
                firstChar == 'U')
            {
                iterator.remove();
            }
            else if (product.length() > 5)
            {
                iterator.set(
                        product.toUpperCase()
                );
            }
        }

        System.out.println(
                "Updated List: " + products
        );

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LIST02)