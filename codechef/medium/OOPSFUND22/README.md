# OOPSFUND22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Delivery Service Management

A logistics company provides two types of delivery services: Standard Delivery and Express Delivery. Both services calculate delivery charges based on distance and package weight, but their pricing rules and delivery limits differ.

Your task is to implement a delivery management system using abstraction, inheritance, method overriding, and runtime polymorphism.

 **1. DeliveryService Interface** 

- Create an abstract type named DeliveryService that declares the following public methods: MethodReturn typeDescriptionCalculate_Cost()64-bit integerReturn the total delivery chargeDelivery_Status()StringReturn Available or Unavailable
- The DeliveryService type must define the common method contract without implementing either calculation. It must not be instantiated directly.

 **2. StandardDelivery Class** 

- Create a class named StandardDelivery that implements the DeliveryService contract.
- The class must contain two private data members: distance — 64-bit integer representing delivery distance in kilometres. weight — 64-bit integer representing package weight in kilograms.
- Implement a constructor StandardDelivery(distance, weight) that initializes both members.
- Delivery charge Standard delivery costs 5 units per kilometre and 2 units per kilogram. $\text{Cost} = 5 \times \text{distance} + 2 \times \text{weight}$
- Delivery availability Return Available if both conditions are satisfied: Distance is at most 50 kilometres. Package weight is at most 20 kilograms. Otherwise, return Unavailable.

 **3. ExpressDelivery Class** 

- Create a class named ExpressDelivery that implements the DeliveryService contract.
- The class must contain two private data members: distance — 64-bit integer. weight — 64-bit integer.
- Implement a constructor ExpressDelivery(distance, weight) that initializes both members.
- Delivery charge Express delivery costs 8 units per kilometre, 4 units per kilogram, and an additional fixed charge of 30 units. $\text{Cost} = 8 \times \text{distance} + 4 \times \text{weight} + 30$
- Delivery availability Return Available if both conditions are satisfied: Distance is at most 100 kilometres. Package weight is at most 10 kilograms. Otherwise, return Unavailable.

 **Implementation Requirements** 

- Implement the complete DeliveryService, StandardDelivery, and ExpressDelivery types.
- Keep the specified data members private and the required methods public.
- Use an interface or abstract base class for the common DeliveryService contract.
- Use inheritance or interface implementation to establish the relationship between the types.
- Override both methods in each delivery class.
- Ensure the methods support runtime polymorphism through the common DeliveryService type.
- Calculate the delivery charge even when the delivery status is Unavailable.
- Both methods must return values without printing output.
- Implement all required types in a single source file above the locked main function.
### Input Format
- The first line contains an integer T, denoting the number of delivery requests.
- Each of the next T lines contains three space-separated values:

`type distance weight`

Where:

- type is either STANDARD or EXPRESS.
- distance is the delivery distance in kilometres.
- weight is the package weight in kilograms.
### Output Format

For each delivery request, print exactly one line:

```
type Cost: C Status: S

```

Where:

- type is STANDARD or EXPRESS, as provided in the input.
- C is the delivery charge returned by Calculate_Cost().
- S is Available or Unavailable, as returned by Delivery_Status().
### Constraints
- $1 \le T \le 500$
- $0 \le \text{distance} \le 200$
- $0 \le \text{weight} \le 40$
- type is either STANDARD or EXPRESS.
### Sample 1:
Input
Output

```
6
STANDARD 10 3
EXPRESS 10 3
STANDARD 60 5
EXPRESS 90 12
STANDARD 50 20
EXPRESS 100 10
```

```
STANDARD Cost: 56 Status: Available
EXPRESS Cost: 122 Status: Available
STANDARD Cost: 310 Status: Unavailable
EXPRESS Cost: 798 Status: Unavailable
STANDARD Cost: 290 Status: Available
EXPRESS Cost: 870 Status: Available
```

### Explanation:

Request 1: Standard delivery costs $5(10) + 2(3) = 56$. Both limits are satisfied.

Request 2: Express delivery costs $8(10) + 4(3) + 30 = 122$. Both limits are satisfied.

Request 3: Standard delivery costs 310, but the distance of 60 km exceeds the 50 km limit.

Request 4: Express delivery costs 798, but the weight of 12 kg exceeds the 10 kg limit.

Requests 5 and 6: Both requests satisfy their respective limits exactly, so both are available.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:34:50.845Z  

```java

import java.util.*;

// Implement the following types:
// 1. DeliveryService
// 2. StandardDelivery
// 3. ExpressDelivery
interface DeliveryService {
    long Calculate_Cost();
    String Delivery_Status();
}

class StandardDelivery implements DeliveryService {
    private long distance;
    private long weight;

    public StandardDelivery(long distance, long weight) {
        this.distance = distance;
        this.weight = weight;
    }

    @Override
    public long Calculate_Cost() {
        return 5 * distance + 2 * weight;
    }

    @Override
    public String Delivery_Status() {
        if (distance <= 50 && weight <= 20) {
            return "Available";
        }
        return "Unavailable";
    }
}

class ExpressDelivery implements DeliveryService {
    private long distance;
    private long weight;

    public ExpressDelivery(long distance, long weight) {
        this.distance = distance;
        this.weight = weight;
    }

    @Override
    public long Calculate_Cost() {
        return 8 * distance + 4 * weight + 30;
    }

    @Override
    public String Delivery_Status() {
        if (distance <= 100 && weight <= 10) {
            return "Available";
        }
        return "Unavailable";
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            long distance = sc.nextLong();
            long weight = sc.nextLong();

            DeliveryService service;

            if (type.equals("STANDARD")) {
                service = new StandardDelivery(
                    distance, weight
                );
            } else {
                service = new ExpressDelivery(
                    distance, weight
                );
            }

            output.append(type)
                  .append(" Cost: ")
                  .append(service.Calculate_Cost())
                  .append(" Status: ")
                  .append(service.Delivery_Status())
                  .append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND22)