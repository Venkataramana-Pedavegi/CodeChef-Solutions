# STOCKSPROFIT

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Chef and Stock Profits

Chef is observing stock prices.
You are given an array $prices$ where $prices[i]$ is the price of a given stock on the $i^{\text{th}}$ day.
Chef wants to maximize his profit by choosing  **one day to buy**  and a  **different future day to sell**.

Return the  **maximum profit**  Chef can achieve. If no profit is possible, return $0$.

## Function Declaration
### Function Name

$findMaxProfit$ – Computes the maximum achievable profit by buying on one day and selling on a later day.

### Parameters
- $prices$ : A list/array of integers where $prices[i]$ = stock price on day $i$.
### Return Value
- Returns an integer — the maximum profit Chef can make. If no profitable transaction is possible, return $0$.
## Constraints:
- $2 \leq n \leq 10^5$
- $0 \leq prices[i] \leq 10^4$
### Input Format
- $n$ → number of days
- Next line → n integers representing stock prices
### Output Format

Print the maximum profit Chef can achieve.

### Sample 1:
Input
Output

```
7
2 4 1 7 5 3 6

```

```
6

```

### Explanation:

 **Buy**  on day 3 (price = 1) and  **sell**  on day 4 (price = 7). Profit = 7 - 1 = 6.

### Sample 2:
Input
Output

```
8
9 8 7 6 5 4 3 2

```

```
0

```

### Explanation:

Prices keep falling, so no profit can be made.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-20T14:09:55.304Z  

```java
public static int findMaxProfit(int[] prices) {

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < prices.length; i++) {

        int profit = prices[i] - minPrice;

        maxProfit = Math.max(maxProfit, profit);

        minPrice = Math.min(minPrice, prices[i]);
    }

    return maxProfit;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/STOCKSPROFIT)