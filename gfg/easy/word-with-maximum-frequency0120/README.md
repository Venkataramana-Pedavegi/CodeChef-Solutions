# Max Frequency Word

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string  **s**  that is made up of words separated by spaces. Your task is to find the word with the highest frequency, i.e. it appears the most times in the sentence. If multiple words have maximum frequency, then print the word that occurs first in the sentence.

 **Examples:** 

```
Input: s = "the devil in the sky"
Output: "the 2"
Explanation: The frequency of "the" is 2, so we return "the" and its frequency "2" i.e., "the 2" 

```

```
Input: s = "this is not right"
Output: "this 1"
Explanation: Every word has the frequency of "1", so we return "this 1" as this occurs first in the sentence. 

```

 **Constraints:** 
1 ≤ s.size() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-08T16:08:27.370Z  

```java
class Solution {
    public String maximumFrequency(String s) {

                String[] words = s.split(" ");

                HashMap<String, Integer> freq = new HashMap<>();

                for (String word : words) {
                    freq.put(word, freq.getOrDefault(word, 0) + 1);
                }

                String answer = words[0];
                int maxFreq = freq.get(answer);
                for (String word : words) {
                    int currentFreq = freq.get(word);

                    if (currentFreq > maxFreq) {
                        maxFreq = currentFreq;
                        answer = word;
                    }
                }

                return answer + " " + maxFreq;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/word-with-maximum-frequency0120/1)