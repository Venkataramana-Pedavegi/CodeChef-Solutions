# Fizz Buzz

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Fizz Buzz Problem involves that given an integer  **n**, for every integer **0 < i <= n**, the task is to output,

- "FizzBuzz" if i is divisible by 3 and 5,
- "Fizz" if i is divisible by 3,
- "Buzz" if i is divisible by 5
- "i" as a string, if none of the conditions are true.

Return an array of strings.

 **Examples :** 

```
Input: n = 3
Output: ["1", "2", "Fizz"]
Explanation: 1 and 2 are neither divisible by 3 nor 5, so we just output 1 and 2, and 3 is divisible by 3 so we output "Fizz".

```

```
Input: n = 10
Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz"]

```

```
Input: n = 20
Output: [“1”, “2”, “Fizz”, “4”, “Buzz”, “Fizz”, “7”, “8”, “Fizz”, “Buzz”, “11”, “Fizz”, “13”, “14”, “FizzBuzz”, “16”, “17”, “Fizz”, “19”, “Buzz”]
```

 **Constraints:** 
1 ≤ n ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:21:47.318Z  

```java

class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();

                for (int i = 1; i <= n; i++) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        result.add("FizzBuzz");
                    }
                    else if (i % 3 == 0) {
                        result.add("Fizz");
                    }
                    else if (i % 5 == 0) {
                        result.add("Buzz");
                    }
                    else {
                        result.add(String.valueOf(i));
                    }
                }

                return result;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/fizz-buzz/1)