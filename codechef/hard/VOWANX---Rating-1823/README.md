# VOWANX - Rating 1823

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

### Vowel Anxiety

Utkarsh has recently started taking English-language classes to improve his reading and writing skills. However, he is still struggling to learn English. His teacher gave him the following problem to improve his vowel-identification skills:

There is a string $S$ of length $N$ consisting of lowercase English letters only. Utkarsh has to start from the first letter of the string.
Each time he encounters a vowel (i.e. a character from the set $\{a, e, i, o, u\}$) he has to  **reverse**  the entire substring that came before the vowel.

Utkarsh needs help verifying his answer. Can you print the final string after performing all the operations for him?

### Input Format
- First line will contain $T$, number of test cases. Then $T$ test cases follow.
- The first line of each test case contains $N$, the length of the string.
- The second line contains $S$, the string itself.
### Output Format

For each test case, output in a single line the final string after traversing $S$ from left to right and performing the necessary reversals.

### Constraints
- $1 \leq T \leq 10^4$
- $1 \leq N \leq 10^6$
- Sum of $N$ over all test cases does not exceed $10^6$.
### Sample 1:
Input
Output

```
2
10
abcdefghij
7
bcadage
```

```
hgfeabcdij
gacbade
```

### Explanation:

 **Test case $1$:**  The first letter is a vowel, but there is no substring before it to reverse, so we leave it as it is. Next, we reverse `abcd` and the string becomes `dcbaefghij`. Next we reach the vowel `i` and reverse `dcbaefgh` to get the string `hgfeabcdij`.

 **Test case $2$:**  Initially, we reverse `bc` and the string becomes `cbadage`. Next we reach the vowel `a` and reverse `cbad` to get the string `dabcage`. Finally we reach the vowel `e` and reverse `dabcag` to get the string `gacbade`.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T05:42:15.498Z  

```java
import java.util.*;

class Codechef {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            int N = sc.nextInt();
            String S = sc.next();

            Deque<Character> deque = new ArrayDeque<>();

            // false = normal direction
            // true  = reversed direction
            boolean reverse = false;

            for (int i = 0; i < N; i++) {

                char ch = S.charAt(i);

                if (isVowel(ch)) {

                    // Reverse everything before the vowel
                    reverse = !reverse;

                }

                // Add current character at the logical end
                if (reverse) {
                    deque.addFirst(ch);
                } else {
                    deque.addLast(ch);
                }
            }

            StringBuilder ans = new StringBuilder();

            // Convert deque into the actual string
            if (reverse) {

                while (!deque.isEmpty()) {
                    ans.append(deque.removeLast());
                }

            } else {

                while (!deque.isEmpty()) {
                    ans.append(deque.removeFirst());
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }

    static boolean isVowel(char ch) {

        return ch == 'a' ||
               ch == 'e' ||
               ch == 'i' ||
               ch == 'o' ||
               ch == 'u';
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/VOWANX)