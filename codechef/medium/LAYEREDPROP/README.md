# LAYEREDPROP

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-26T05:16:11.408Z  

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

[View on CodeChef](https://www.codechef.com/problems/LAYEREDPROP)