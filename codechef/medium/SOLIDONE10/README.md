# SOLIDONE10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding - Design A Multi Channel Alert System

A company is building a notification platform capable of sending alerts through multiple communication channels such as email, SMS and push notifications. The system should support different notification delivery mechanisms while keeping the notification workflow clean, extensible and easy to maintain.

Currently, the company wants to support:

- Email, SMS and Push notifications

In future, additional notification channels may be added without changing existing workflow logic.

 **System Goals** 

- The notification system should: support multiple notification delivery channels separate notification sending responsibility from history tracking allow new notification types to be added easily keep the design flexible and extensible maintain clean responsibility separation across classes

 **Design Expectations** 

- The system must follow: SRP (Single Responsibility Principle) ⓘ Each class should have only one responsibility or reason to change. OCP (Open-Closed Principle) ⓘ New functionality should be added by extending existing code instead of modifying existing classes. Extensible object-oriented design ⓘ Design the system so new features can be added with minimal changes. Polymorphism using abstraction ⓘ Use interfaces or abstract classes so different implementations can be used interchangeably.

 **Implementation Flow** 

- 1. NotificationSender Interface Create an interface: NotificationSender This interface should represent generic notification sending behavior. Implement the method: void send(String recipient, String message) All notification types must implement this interface.
- 2. EmailNotification Class Create a class: EmailNotification This class must implement the NotificationSender interface. Responsibilities: send email notifications Output format: EMAIL sent to codechef@gmail.com: Order Placed
- 3. SMSNotification Class Create a class: SMSNotification This class must implement the NotificationSender interface. Responsibilities: send SMS notifications Output format: SMS sent to 9876543210: OTP Generated
- 4. PushNotification Class Create a class: PushNotification This class must implement the NotificationSender interface. Responsibilities: send push notifications Output format: PUSH sent to DEVICE_101: Payment Successful
- 5. NotificationHistory Class Implement: NotificationHistory Responsibilities: maintain notification delivery history store processed notification records separately Methods: void addRecord(String record) void printHistory() Output format: === Notification History === EMAIL -> codechef@gmail.com SMS -> 9876543210 PUSH -> DEVICE_101
- 6. NotificationService Class Implement: NotificationService Responsibilities: coordinate notification workflow delegate actual sending to notification implementations update notification history separately Implement: void processNotification(NotificationSender sender, String recipient, String message, String channel)

 **Expected Workflow** 

- The workflow should execute in this order: send notification using sender create history record store history record support all notification types without modifying workflow logic

 **Constraints** 

- Do NOT use: multithreading, databases, file handling, networking libraries and advanced frameworks
- Use only: interfaces, classes, strings, collections and console output

 **Example** 

 **Flow** 

```
EMAIL -> codechef@gmail.com -> Order Placed
SMS -> 9876543210 -> OTP Generated
PUSH -> DEVICE_101 -> Payment Successful

```

 **Output** 

```
EMAIL sent to codechef@gmail.com: Order Placed
SMS sent to 9876543210: OTP Generated
PUSH sent to DEVICE_101: Payment Successful

=== Notification History ===
EMAIL -> codechef@gmail.com
SMS -> 9876543210
PUSH -> DEVICE_101

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:54:27.548Z  

```cpp

// ================= EMAIL NOTIFICATION =================
/*
Responsibilities:
- Send email notifications
*/
class EmailNotification implements NotificationSender {

    @Override
    public void send(String recipient, String message) {

        System.out.println(
                "EMAIL sent to " +
                recipient +
                ": " +
                message
        );
}

    void send(String recipient, String message);
interface NotificationSender {

*/
Responsibilities:
- Represent generic notification sending behavior
/*
// ================= NOTIFICATION SENDER =================
import java.util.*;

```

---

[View on CodeChef](https://www.codechef.com/problems/SOLIDONE10)