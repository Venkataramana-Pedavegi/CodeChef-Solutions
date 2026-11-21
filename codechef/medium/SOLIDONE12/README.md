# SOLIDONE12

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding - Design A Online Shopping Workflow System

An e-commerce company is building an order processing platform that handles complete shopping workflows such as payment processing, notification sending, invoice generation and delivery management.

The system should support multiple interchangeable implementations while keeping responsibilities separated, extensible and easy to maintain.

Currently, the company wants to support:

- different payment methods
- different notification mechanisms
- different delivery partners

In future, additional implementations may be added without changing existing workflow logic.

 **System Goals** 

- The shopping workflow system should: separate responsibilities clearly across components support interchangeable implementations safely coordinate complete order processing workflow support future extensibility easily maintain abstraction-driven architecture

 **Design Expectations** 

- The system must follow: SRP (Single Responsibility Principle) ⓘ Each class should have only one responsibility or reason to change. OCP (Open Closed Principle) ⓘ New functionality should be added by extending existing code instead of modifying existing classes. LSP (Liskov Substitution Principle) ⓘ Objects of a derived class should be usable anywhere their base class is expected without changing the correctness of the program. Abstraction and polymorphism ⓘ Use interfaces or abstract classes so different implementations can be used interchangeably while hiding implementation details. Clean object-oriented architecture ⓘ Organize classes with clear responsibilities, low coupling, and high cohesion to make the system easier to understand, maintain, and extend.

 **Implementation Flow** 

- 1. Order Class Implement: Order Responsibilities: store order information Fields: orderId productName amount
- 2. PaymentMethod Interface Create an interface: PaymentMethod Implement method: void pay(double amount) This interface should represent generic payment behavior.
- 3. CreditCardPayment Class Create a class: CreditCardPayment This class must implement the PaymentMethod interface. Output format: Credit Card payment processed: 50000.0
- 4. UpiPayment Class Create a class: UpiPayment This class must implement the PaymentMethod interface. Output format: UPI payment processed: 50000.0
- 5. NotificationSender Interface Create an interface: NotificationSender Implement method: void send(String message) This interface should represent generic notification behavior.
- 6. EmailNotification Class Create a class: EmailNotification This class must implement the NotificationSender interface. Output format: EMAIL: Order placed successfully
- 7. SMSNotification Class Create a class: SMSNotification This class must implement the NotificationSender interface. Output format: SMS: Order placed successfully
- 8. DeliveryPartner Interface Create an interface: DeliveryPartner Implement method: void deliver(String productName) This interface should represent generic delivery behavior.
- 9. BikeDeliveryPartner Class Create a class: BikeDeliveryPartner This class must implement the DeliveryPartner interface. Output format: Bike Delivery assigned for: Laptop
- 10. InvoiceGenerator Class Implement: InvoiceGenerator Responsibilities: generate invoice summary Implement method: String generateInvoice(Order order) Output format: Order ID: ORD101 Product: Laptop Amount: 50000.0
- 11. OrderService Class Implement: OrderService Responsibilities: coordinate shopping workflow delegate payment processing delegate notification sending delegate delivery assignment generate invoice separately Implement: void processOrder(Order order, PaymentMethod paymentMethod, NotificationSender notificationSender, DeliveryPartner deliveryPartner)

 **Expected Workflow** 

- The workflow should execute in this order: process payment send notification assign delivery generate invoice print invoice

 **Constraints** 

- Do NOT use: multithreading, databases, file handling, networking libraries and advanced frameworks
- Use only: interfaces, classes, strings, console output and simple object-oriented programming

 **Example** 

 **Input Flow** 

```
Order ID: ORD101
Product: Laptop
Amount: 50000.0
Payment: Credit Card
Notification: Email
Delivery: Bike

```

 **Output** 

```
Credit Card payment processed: 50000.0
EMAIL: Order placed successfully
Bike Delivery assigned for: Laptop

Order ID: ORD101
Product: Laptop
Amount: 50000.0

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:55:41.355Z  

```cpp
    }
}


// ================= MAIN =================
public class Codechef {

    public static void main(String[] args) {

        Order order = new Order("ORD101", "Laptop", 50000);

        PaymentMethod paymentMethod = new CreditCardPayment();

        NotificationSender notificationSender = new EmailNotification();

        DeliveryPartner deliveryPartner = new BikeDeliveryPartner();

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        OrderService service = new OrderService(invoiceGenerator);

        service.processOrder(order, paymentMethod, notificationSender, deliveryPartner);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SOLIDONE12)