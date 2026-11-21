# OOPSFUND10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Discount Calculation System

🌟 Hey, Coders! Welcome to the  **Discount Calculation System**  lab!

This lab is based on two SOLID principles: the  **Open/Closed Principle (OCP)**  and the  **Liskov Substitution Principle (LSP)**, the second and third of the five SOLID principles.

- OCP says that software should be open for extension but closed for modification. A new discount policy should be addable without changing the checkout code.
- LSP says that objects of a subtype must be usable wherever the base type is expected, without breaking the program's expected behavior. Every discount policy must follow the same rules, so the checkout can trust any of them.

You will implement three discount policies and a checkout service that works with any valid `DiscountPolicy`.

 **Project Structure** 
You are given the following file:

- Codechef.java → Contains the DiscountPolicy interface, RegularDiscount, PremiumDiscount, FestivalDiscount, CheckoutService, and a main method that demonstrates the workflow.

Complete the TODOs in `Codechef.java`.  **This is the only file you need to edit.** 

#### The DiscountPolicy Contract

Every discount policy must follow the same rules, so any of them can be substituted for another:

- It accepts any finite, non-negative purchase amount. 0.0 is valid.
- It rejects a negative, NaN, or infinite amount with an IllegalArgumentException.
- It returns a discount that is finite, not negative, not greater than the purchase amount, and rounded to two decimal places.
#### Task

 **1. Implement `RegularDiscount`, `PremiumDiscount`, and `FestivalDiscount`** 

In each class, implement `calculateDiscount(double amount)` using these discount rates:

- RegularDiscount gives a 5% discount.
- PremiumDiscount gives a 10% discount.
- FestivalDiscount gives a 15% discount.

For each class:

- Validate the purchase amount first, using the provided validateAmount() method.
- Reject a negative, NaN, or infinite amount with an IllegalArgumentException and the message Invalid purchase amount.
- Calculate the discount as the class's rate multiplied by the purchase amount.
- Round the discount to two decimal places using the provided roundMoney() method.
- A purchase amount of 0.0 is valid and gives a discount of 0.0.

 **2. Implement `CheckoutService`** 

The constructor is already provided. It rejects a `null` discount policy with an `IllegalArgumentException` and the message `Discount policy cannot be null`.

Implement `calculateFinalAmount(double amount)` by performing these steps in order:

- Reject a negative, NaN, or infinite purchase amount with an IllegalArgumentException and the message Invalid purchase amount.
- Calculate the discount by calling calculateDiscount(amount) on the configured discountPolicy.
- Reject the discount if it is negative, NaN, infinite, or greater than the purchase amount, with an IllegalArgumentException and the message Invalid discount amount.
- Subtract the discount from the purchase amount.
- Round the result to two decimal places using the provided roundMoney() method, and return it.

A purchase amount of `0.0` is valid. With a discount of `0.0`, the final amount is `0.0`.

#### Important Rules
- Do not change the given class names, method names, or constructor signatures.
- CheckoutService must work with any DiscountPolicy. It must not refer to RegularDiscount, PremiumDiscount, FestivalDiscount, or any customer type, and it must not use instanceof, if-else, or switch to choose behavior based on the policy.
- Use the provided validateAmount() and roundMoney() helper methods.
- Complete only the TODOs in Codechef.java.
#### Example

 **Input used in `main()`:**  Purchase amount: `2000.0`

 **Expected Output:** 

```
Purchase Amount: 2000.0
Regular Customer Final Amount: 1900.0
Premium Customer Final Amount: 1800.0
Festival Discount Final Amount: 1700.0

```

 **Explanation:** 

- Regular customers get a 5% discount: 2000.0 − 100.0 = 1900.0.
- Premium customers get a 10% discount: 2000.0 − 200.0 = 1800.0.
- Festival offers give a 15% discount: 2000.0 − 300.0 = 1700.0.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:53:53.447Z  

```cpp
    public double calculateDiscount(double amount) {

// Provides a 10% discount to premium customers.
class PremiumDiscount implements DiscountPolicy {

    @Override
        return Math.round(amount * 100.0) / 100.0;
    }
}
        }
    }

    private double roundMoney(double amount) {
    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        return roundMoney(amount * 0.05);
    }

    public double calculateDiscount(double amount) {
        validateAmount(amount);

    @Override
// Provides a 5% discount to regular customers.
class RegularDiscount implements DiscountPolicy {

    double calculateDiscount(double amount);
}
interface DiscountPolicy {
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND10)