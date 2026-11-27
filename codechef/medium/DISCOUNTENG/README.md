# DISCOUNTENG

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Discount Engine

A customer membership type is either \texttt{BASIC} or \texttt{PREMIUM}. Discounts are applied to products based on their category according to the following table:

Product type	BASIC	PREMIUM
REGULAR	0%	5%
SEASONAL	10%	15%
CLEARANCE	25%	25%

For each product, the discounted price is calculated as: $\text{discountedPrice} = \left\lfloor \frac{\text{price} \times (100 - \text{discount})}{100} \right\rfloor$

After calculating the subtotal across all $N$ products using their discounted prices, apply an additional $5\%$ discount if the subtotal is at least $10000$: $\text{finalAmount} = \left\lfloor \frac{\text{subtotal} \times 95}{100} \right\rfloor$

Print the final payable amount.

### Input Format
- The first line contains the membership type $\text{MEMBERSHIP}$ (\texttt{BASIC} or \texttt{PREMIUM}), an integer $N$ representing the number of products, followed by $N$ pairs of product details: $\text{MEMBERSHIP } N \quad \text{TYPE}_1 \quad \text{PRICE}_1 \quad \text{TYPE}_2 \quad \text{PRICE}_2 \quad \dots \quad \text{TYPE}_N \quad \text{PRICE}_N$
### Output Format
- Print a single integer representing the final payable amount.
### Constraints
- $1 \le N \le 10^5$
- $1 \le \text{PRICE}_i \le 10^9$
- $\text{MEMBERSHIP} \in \{\text{\texttt{"BASIC"}}, \text{\texttt{"PREMIUM"}}\}$
- $\text{TYPE}_i \in \{\text{\texttt{"REGULAR"}}, \text{\texttt{"SEASONAL"}}, \text{\texttt{"CLEARANCE"}}\}$
### Sample 1:
Input
Output

```
PREMIUM 3
REGULAR 1000
SEASONAL 2000
CLEARANCE 4000
```

```
5650
```

### Explanation:

Membership: $\text{PREMIUM}$

Product Discount Calculations:

- $\text{REGULAR}$ ($1000$): Discount = $5\%$. $\text{discountedPrice} = \left\lfloor \frac{1000 \times (100 - 5)}{100} \right\rfloor = 950$
- $\text{SEASONAL}$ ($2000$): Discount = $15\%$. $\text{discountedPrice} = \left\lfloor \frac{2000 \times (100 - 15)}{100} \right\rfloor = 1700$
- \texttt{CLEARANCE} ($4000$): Discount = $25\%$. $\text{discountedPrice} = \left\lfloor \frac{4000 \times (100 - 25)}{100} \right\rfloor = 3000$

Subtotal Calculation: $\text{subtotal} = 950 + 1700 + 3000 = 5650$

Since the subtotal ($5650$) is strictly less than $10000$, no additional $5\%$ discount is applied.

$\text{finalAmount} = 5650$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:39:57.406Z  

```java
import java.util.Scanner;

public class Main
{
    @FunctionalInterface
    interface DiscountRule
    {
        int getDiscount(long price);

        default long calculateDiscountedPrice(long price) {
            int discount = getDiscount(price);
            return (price * (100 - discount)) / 100;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext())
        {
            return;
        }

        String membership = sc.next();

        boolean isPremium =
            membership.equals("PREMIUM");

        int n = sc.nextInt();

        long subtotal = 0;

        for (int i = 0; i < n; i++)
        {
            String type = sc.next();
            long price = sc.nextLong();

            DiscountRule rule;
            switch (type) {
                case "REGULAR":
                    rule = p -> isPremium ? 5 : 0;
                    break;
                case "SEASONAL":
                    rule = p -> isPremium ? 15 : 10;
                    break;
                case "CLEARANCE":
                    rule = p -> 25;
                    break;
                default:
                    rule = p -> 0;
                    break;
            }
            subtotal += rule.calculateDiscountedPrice(price);
        }

        long finalAmount = subtotal;
        if (subtotal >= 10000) {
            finalAmount = (subtotal * 95) / 100;
        }

        System.out.println(finalAmount);

        sc.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DISCOUNTENG)