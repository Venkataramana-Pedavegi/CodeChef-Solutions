# HASHMAP02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Word Frequency Analyzer

A blogging platform needs to analyze frequently used words in an article.

You are given $N$ lines of text, a list of stop words, and a minimum frequency $K$.

Your task is to count word frequencies using a `HashMap<String, Integer>`.

### Rules

While processing the text:

- Treat uppercase and lowercase letters as the same.
- A word consists only of English letters A-Z or a-z.
- Punctuation and other characters act as separators.
- Ignore all given stop words.
- Print only words whose frequency is at least $K$.

The output must be sorted by:

- Frequency in descending order.
- Alphabetical order if two words have the same frequency.

If no word satisfies the condition, print:

```
No words found

```

### Input Format
- The first line contains $N$, the number of text lines.
- The next $N$ lines contain the text.
- The next line contains $M$, the number of stop words.
- If $M>0$, the next line contains $M$ space-separated stop words.
- The final line contains $K$.
### Output Format

For every qualifying word, print:

```
word: frequency

```

### Sample 1:
Input
Output

```
2
The cat chased the mouse.
The CAT ran away, and the mouse escaped!
2
the and
1
```

```
cat: 2
mouse: 2
away: 1
chased: 1
escaped: 1
ran: 1
```

### Explanation:

After converting words to lowercase and removing `the` and `and`:

- cat appears $2$ times.
- mouse appears $2$ times.
- The remaining words appear once.

Words with equal frequencies are printed alphabetically.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:16:08.293Z  

```java
import java.io.*;
import java.util.*;

class WordAnalyzer
{
    public List<Map.Entry<String, Integer>> analyze(
            List<String> text,
            Set<String> stopWords,
            int minFrequency)
    {
        HashMap<String, Integer> frequency =
                new HashMap<>();

        for (String line : text)
        {
            String[] words =
                    line.toLowerCase()
                        .split("[^a-z]+");

            for (String word : words)
            {
                if (word.isEmpty() ||
                    stopWords.contains(word))
                {
                    continue;
                }

                frequency.put(
                        word,
                        frequency.getOrDefault(word, 0) + 1
                );
            }
        }

        List<Map.Entry<String, Integer>> result =
                new ArrayList<>();

        for (Map.Entry<String, Integer> entry
                : frequency.entrySet())
        {
            if (entry.getValue() >= minFrequency)
            {
                result.add(entry);
            }
        }

        result.sort(
                (a, b) ->
                {
                    int frequencyCompare =
                            Integer.compare(
                                    b.getValue(),
                                    a.getValue()
                            );

                    if (frequencyCompare != 0)
                    {
                        return frequencyCompare;
                    }

                    return a.getKey()
                            .compareTo(b.getKey());
                }
        );

        return result;
    }
}


class Codechef
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String> text = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            text.add(br.readLine());
        }

        int m = Integer.parseInt(br.readLine());

        Set<String> stopWords = new HashSet<>();

        if (m > 0)
        {
            StringTokenizer st =
                    new StringTokenizer(br.readLine());

            for (int i = 0; i < m; i++)
            {
                stopWords.add(
                        st.nextToken().toLowerCase()
                );
            }
        }

        int k = Integer.parseInt(br.readLine());

        WordAnalyzer analyzer = new WordAnalyzer();

        List<Map.Entry<String, Integer>> result =
                analyzer.analyze(text, stopWords, k);

        if (result.isEmpty())
        {
            System.out.println("No words found");
        }
        else
        {
            for (Map.Entry<String, Integer> entry : result)
            {
                System.out.println(
                        entry.getKey() + ": " +
                        entry.getValue()
                );
            }
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/HASHMAP02)