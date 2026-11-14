# OOPSFUND07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Payment Processing System

Hello Developers! 👋 Welcome to the  **Payment Processing System**  lab!

In this lab, you will apply  **abstraction in Java**  by creating an abstract `Payment` class and implementing different payment methods using `CreditCardPayment` and `UpiPayment`.

#### Project Structure

You are given the following files:

- Payment.java → Contains TODOs for declaring the abstract class and its abstract method.
- CreditCardPayment.java → Contains a TODO for implementing credit card payment processing.
- UpiPayment.java → Contains a TODO for implementing UPI payment processing.
- Main.java → Demonstrates payment processing using references of the Payment type.

Complete the TODOs in the provided files.  **You only need to edit the files containing TODOs.** 

#### Task

 **1. Implement the Abstract Payment Class** 

- Declare Payment as an abstract class.
- Keep the payment amount private and initialize it through the constructor.
- Reject non-positive, NaN, and infinite payment amounts using IllegalArgumentException.
- Provide a getter method to access the payment amount.
- Declare an abstract processPayment() method that takes no arguments and returns void.

 **2. Implement Credit Card Payment** 

- Extend the Payment class.
- Store the cardholder's name and initialize it through the constructor.
- Reject null or blank cardholder names using IllegalArgumentException.
- Override processPayment() to print the payment amount and cardholder's name in the required format.

 **3. Implement UPI Payment** 

- Extend the Payment class.
- Store the UPI ID and initialize it through the constructor.
- Reject null or blank UPI IDs using IllegalArgumentException.
- Override processPayment() to print the payment amount and UPI ID in the required format.
#### Important Rules
- Do not change the given class names, method names, or constructor signatures.
- Maintain the inheritance relationship between Payment, CreditCardPayment, and UpiPayment.
- Complete only the TODOs in the provided files.
#### Expected Output

```
Credit card payment of 2500.0 processed for Aman
UPI payment of 1500.0 processed for aman@upi

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-14T13:52:36.474Z  

```cpp
public class UpiPayment extends Payment {
    private final String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);

        if (upiId == null || upiId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid UPI ID");
        }

        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("UPI payment of " + getAmount() + " processed for " + upiId);
    }
}



```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND07)