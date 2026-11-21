# LIST04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Cleanup

A text-processing application stores user-entered words in an ArrayList. Before the list can be used, invalid words must be removed according to a set of filtering rules.

You are given $N$ words and an integer $K$.

A word must be removed if any of the following conditions is true:

- Its length is less than $K$.
- It contains at least one digit.
- Its first and last characters are the same, ignoring case.

The remaining words must preserve their original order.

After processing, print the updated list and the total number of removed words.

### Task

Process the given `ArrayList` according to the filtering rules and produce the required output.

The list must be modified while processing it; creating a separate list containing only valid words is not allowed.

### Input Format
- The first line contains two space-separated integers $N$ and $K$.
- The next $N$ lines each contain one word.
### Output Format

Print two lines:

- Final List: [word1, word2,...]
- Removed Words: <count>
### Sample 1:
Input
Output

```
8 4
Sun
Rain
Level
Tree
Code7
Cloud
Radar
Moon
```

```
Final List: [Rain, Tree, Cloud, Moon]
Removed Words: 4
```

### Explanation:
- Sun is removed because its length is less than $4$.
- Rain remains.
- Level is removed because its first and last characters are the same, ignoring case.
- Tree remains.
- Code7 is removed because it contains a digit.
- Cloud remains.
- Radar is removed because its first and last characters are the same, ignoring case.
- Moon remains.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T14:14:46.497Z  

```java
import java.util.*;

class Codechef
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            words.add(sc.next());
        }

        int removedCount = 0;

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext())
        {
            String word = iterator.next();

            boolean remove = false;

            // Rule 1: Length less than K
            if (word.length() < k)
            {
                remove = true;
            }

            // Rule 2: Contains a digit
            if (!remove)
            {
                for (int i = 0; i < word.length(); i++)
                {
                    if (Character.isDigit(word.charAt(i)))
                    {
                        remove = true;
                        break;
                    }
                }
            }

            // Rule 3: Same first and last character
            if (!remove)
            {
                char first =
                        Character.toLowerCase(
                                word.charAt(0)
                        );

                char last =
                        Character.toLowerCase(
                                word.charAt(
                                        word.length() - 1
                                )
                        );

                if (first == last)
                {
                    remove = true;
                }
            }

            if (remove)
            {
                iterator.remove();
                removedCount++;
            }
        }

        System.out.println("Final List: " + words);
        System.out.println("Removed Words: " + removedCount);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LIST04)