# SOLIDONE11

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Coding - Design Logistics Fleet Management System

A logistics company is building a delivery management platform that supports multiple types of delivery partners.

The system should allow different delivery partners to perform deliveries while keeping the delivery workflow flexible, extensible and easy to maintain.

Currently, the company wants to support:

- Bike delivery partners
- Truck delivery partners
- Drone delivery partners

In future, additional delivery partner types may be added without changing existing workflow logic.

 **System Goals** 

- The delivery system should: support multiple delivery partner implementations allow interchangeable delivery behavior separate workflow coordination from delivery execution support future delivery partner extensions easily maintain clean abstraction-driven design

 **Design Expectations** 

The system must follow:

- OCP (Open Closed Principle)
- LSP (Liskov Substitution Principle)
- polymorphism using abstraction
- interchangeable object-oriented design

 **Implementation Flow** 

- 1. DeliveryPartner Interface Create an interface: DeliveryPartner This interface should represent generic delivery behavior. Implement the method: void deliver(String packageName) All delivery partner types must implement this interface.
- 2. BikePartner Class Create a class: BikePartner This class must implement the DeliveryPartner interface. Output format: Bike Partner delivered package: Mobile Phone
- 3. TruckPartner Class Create a class: TruckPartner This class must implement the DeliveryPartner interface. Output format: Truck Partner delivered package: Washing Machine
- 4. DronePartner Class Create a class: DronePartner This class must implement the DeliveryPartner interface. Output format: Drone Partner delivered package: Medicine Box
- 5. DeliveryService Class Implement: DeliveryService Responsibilities: coordinate delivery workflow delegate delivery execution to partner implementations support interchangeable delivery partners safely Implement: void processDelivery(DeliveryPartner partner, String packageName)

 **Constraints** 

- Do NOT use: multithreading, databases, file handling, networking libraries and advanced frameworks
- Use only: interfaces, classes, strings and console output

 **Example** 

 **Input Flow** 

```
Bike -> Mobile Phone
Truck -> Washing Machine
Drone -> Medicine Box

```

 **Output** 

```
Bike Partner delivered package: Mobile Phone
Truck Partner delivered package: Washing Machine
Drone Partner delivered package: Medicine Box

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:55:18.529Z  

```cpp
    }
}


// ================= MAIN =================
public class Codechef {

    public static void main(String[] args) {

        DeliveryService service = new DeliveryService();

        DeliveryPartner bike = new BikePartner();

        DeliveryPartner truck = new TruckPartner();

        DeliveryPartner drone = new DronePartner();

        service.processDelivery(bike, "Mobile Phone");

        service.processDelivery(truck, "Washing Machine");

        service.processDelivery(drone, "Medicine Box");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/SOLIDONE11)