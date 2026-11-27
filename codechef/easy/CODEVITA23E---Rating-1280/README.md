# CODEVITA23E - Rating 1280

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Sorting Boxes

Little Jill jumbled up the order of the letters in our dictionary. Now, Jack uses this list to find the smallest lexicographical string that can be made out of this new order. Can you help him?

You are given a string $P$ that denotes the new order of letters in the English dictionary.

You need to print the smallest lexicographic string made from the given string $S$.

### Input Format
- The first line contains an integer $T$, representing the number of test cases.
- For each test case: The first line contains the string $P$ (the custom alphabet order). The second line contains the string $S$ (the string to be reordered).
### Output Format

Print a single string in a new line for every test case giving the result

### Constraints
- $1 \leq T \leq 1000$
- Length $(P) = 26$
- $1 \leq$ length $(S) \leq 100$
### Sample 1:
Input
Output

```
2
polikujmnhytgbvfredcxswqaz
abcd
qwryupcsfoghjkldezxvbintma
ativedoc
```

```
bdca
codevita
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:52:36.469Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        int T = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Store results for all test cases
        List<String> results = new ArrayList<>();

        for (int t = 0; t < T; t++) {
            // Read P and S for each test case
            String P = sc.nextLine();
            String S = sc.nextLine();

            // Get the smallest lexicographical string
            String result = smallestLexicographicalString(P, S);
            results.add(result);
        }

        // Print all results
        for (String res : results) {
            System.out.println(res);
        }

        sc.close();
    }

    public static String smallestLexicographicalString(String P, String S) {
        // Create a mapping of characters to their order in P
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < P.length(); i++) {
            orderMap.put(P.charAt(i), i);
        }

        // Convert S to a character array for sorting
        Character[] chars = new Character[S.length()];
        for (int i = 0; i < S.length(); i++) {
            chars[i] = S.charAt(i);
        }

        // Sort the character array based on the order in P
        Arrays.sort(chars, (a, b) -> Integer.compare(orderMap.get(a), orderMap.get(b)));

        // Convert the sorted character array back to a string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CODEVITA23E)