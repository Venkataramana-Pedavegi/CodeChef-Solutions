# OOPSFUND08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Food Delivery Order Processor

Hello Developers! 👋 Welcome to the  **Food Order Processing System**  lab!

This lab is based on the  **Single Responsibility Principle (SRP)**, the first of the five SOLID principles. SRP says that  **a class should have only one reason to change**. Here, validating an order, calculating its bill, generating its receipt, and coordinating the workflow are four separate jobs, so each one lives in its own class. You will implement each job in the class that owns it and keep the classes from doing each other's work.

 **Project Structure** 
You are given the following file:

- Codechef.java → Contains OrderItem, FoodOrder, Bill, OrderValidator, BillCalculator, ReceiptGenerator, OrderProcessor, and a main method that demonstrates the workflow.

Complete the TODOs in `Codechef.java`.  **This is the only file you need to edit.** 

#### Task

 **1. Implement `OrderValidator`** 

- Implement validate(FoodOrder order) so it throws an IllegalArgumentException when the order is invalid. A blank string means null, empty, or whitespace only. Perform the checks in the following order, using these exact messages: If the order is null, throw with the message Order cannot be null. If the order ID is blank, throw with the message Order ID is required. If the customer name is blank, throw with the message Customer name is required. If the item list is null or empty, throw with the message Order must contain at least one item.
- Then check each item in list order: If the item is null, throw with the message Order item cannot be null. If the item name is blank, throw with the message Item name is required. If the quantity is zero or negative, throw with the message Quantity must be greater than zero. If the unit price is negative, NaN, or infinite, throw with the message Unit price must be finite and non-negative.
- A unit price of 0.0 is valid.

 **2. Implement `BillCalculator`** 

- Implement calculate(FoodOrder order) to return a Bill: Subtotal: the sum of quantity × unitPrice over all items. Discount: 10% of the subtotal if the subtotal is at least 1000.0; otherwise 0.0. Delivery fee: 0.0 if the subtotal is at least 500.0; otherwise 40.0. Total: subtotal − discount + deliveryFee.
- Compare the thresholds against the subtotal before rounding. Then round the subtotal, discount, delivery fee, and total to two decimal places (half-up) before storing them in the Bill. Use the constants already declared in the class instead of repeating the numbers.

 **3. Implement `ReceiptGenerator`** 

- Implement generate(FoodOrder order, Bill bill) to return the receipt as a single String. Every line, including the last one, ends with a newline (\n): ===== FOOD ORDER RECEIPT ===== Order ID: <orderId> Customer: <customerName> Items: - <itemName> x <quantity> = <itemTotal> Subtotal: <subtotal> Discount: <discount> Delivery Fee: <deliveryFee> Total: <total> The - <itemName> x <quantity> = <itemTotal> line appears once per item, in the original order. <itemTotal> is quantity × unitPrice for that item. Format every monetary value with exactly two decimal places and a dot as the decimal separator, regardless of the system's locale (for example 300.00, not 300 or 300,00). Use the Bill values as given. Do not recalculate them.

 **4. Implement `OrderProcessor`** 

- In the constructor, throw an IllegalArgumentException with the message Order-processing components cannot be null if any of the three dependencies is null.
- In processOrder(FoodOrder order), run the workflow in this order: validate the order, calculate the bill, generate the receipt. Return the receipt.
- OrderProcessor must not contain any validation, pricing, or formatting logic of its own. It only delegates.
#### Important Rules
- Do not change the given class names, method names, or constructor signatures.
- Keep each class focused on its single responsibility.
- Complete only the TODOs in Codechef.java.

 **Example 1: Discount and Free Delivery** 

- Order: ORD101, customer Alice, items: Burger × 2 @ 150.0, Pizza × 1 @ 800.0 ===== FOOD ORDER RECEIPT ===== Order ID: ORD101 Customer: Alice Items: - Burger x 2 = 300.00 - Pizza x 1 = 800.00 Subtotal: 1100.00 Discount: 110.00 Delivery Fee: 0.00 Total: 990.00

 **Example 2: Delivery Fee, No Discount** 

- Order: ORD102, customer Bob, items: Tea × 2 @ 45.5, Samosa × 1 @ 30.0 ===== FOOD ORDER RECEIPT ===== Order ID: ORD102 Customer: Bob Items: - Tea x 2 = 91.00 - Samosa x 1 = 30.00 Subtotal: 121.00 Discount: 0.00 Delivery Fee: 40.00 Total: 161.00

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:53:12.660Z  

```cpp
The dispatch workflow was extended by adding a new TransportPartner implementation instead of modifying existing logic. This allows the system to support new transport types while keeping existing code unchanged, which follows the Open/Closed Principle.

DispatchService was handling dispatch operations as well as route calculation logic. Moving route planning into RoutePlanner gives each class a focused responsibility, improving maintainability and class cohesion.
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND08)