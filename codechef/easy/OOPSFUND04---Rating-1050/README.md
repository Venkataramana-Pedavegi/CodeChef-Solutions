# OOPSFUND04 - Rating 1050

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Smart City Energy Grid Optimization Using OOP

A smart city monitors electricity consumption across buildings. Each building has an ID, a name, electricity consumption in kWh, and a rate per kWh.

Develop an object-oriented solution using  **classes, objects, and parameterized constructors**  to calculate the original electricity bill, optimized electricity bill, and total savings.

 **Task** 

Complete the `EnergyGrid` class only.

 **1. Class Attributes** 

Declare four private instance variables:

- int buildingId — Unique building ID.
- string buildingName — Building name.
- double unitsConsumed — Electricity consumption in kWh.
- double ratePerUnit — Electricity cost per kWh.

 **2. Parameterized Constructor** 

Implement a public constructor accepting the following parameters:

- int id
- string name
- double units
- double rate

Initialize all four instance variables with the corresponding parameters.

 **3. calculateBill()** 

Implement a method named `calculateBill()` returning a `double`.

Calculate and return:

`unitsConsumed * ratePerUnit`

 **4. calculateOptimizedBill()** 

Implement a method named `calculateOptimizedBill()` returning a `double`.

- If unitsConsumed > 500, reduce the electricity consumption by 10% before calculating the bill.
- Otherwise, calculate the bill without reduction.
- Do not modify the original unitsConsumed value.

 **5. displayDetails()** 

Implement a method named `displayDetails()` returning `void`.

The method must:

- Calculate the original bill using calculateBill().
- Calculate the optimized bill using calculateOptimizedBill().
- Calculate savings as originalBill - optimizedBill.
- Print the building details using the specified output format.
### Input Format
- The first line contains an integer N, representing the number of buildings.
- The next N lines each contain buildingId buildingName unitsConsumed ratePerUnit, separated by spaces.
- Building names contain no spaces.
### Output Format

For each building, display:

```
Building ID: <buildingId>
Building Name: <buildingName>
Original Bill: <originalBill>
Optimized Bill: <optimizedBill>
Savings: <savings>

```

Print all monetary values with exactly  **one digit after the decimal point**, rounded to the nearest tenth.

### Constraints
- 1 ≤ N ≤ 100
- 1 ≤ buildingId ≤ 10000
- 0 ≤ unitsConsumed ≤ 100000
- 0 ≤ ratePerUnit ≤ 1000
- Building names contain no spaces.
- Building IDs are unique.
### Sample 1:
Input
Output

```
3
101 Hospital 800 6
102 School 400 5
103 Mall 1200 8
```

```
Building ID: 101
Building Name: Hospital
Original Bill: 4800.0
Optimized Bill: 4320.0
Savings: 480.0
Building ID: 102
Building Name: School
Original Bill: 2000.0
Optimized Bill: 2000.0
Savings: 0.0
Building ID: 103
Building Name: Mall
Original Bill: 9600.0
Optimized Bill: 8640.0
Savings: 960.0
```

### Explanation:
- Hospital: Consumes 800 units. After a 10% reduction, optimized consumption is 720 units. The optimized bill is 4320.0, saving 480.0.
- School: Consumes 400 units. No optimization applies, so the bill remains 2000.0.
- Mall: Consumes 1200 units. Optimized consumption is 1080 units, giving an optimized bill of 8640.0 and savings of 960.0.

The 10% reduction is a simplified assumption for this programming assessment.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:18:59.483Z  

```java
import java.util.*;

class EnergyGrid {
    private int buildingId;
    private String buildingName;
    private double unitsConsumed;
    private double ratePerUnit;

    public EnergyGrid(int id, String name, double units, double rate) {
        this.buildingId = id;
        this.buildingName = name;
        this.unitsConsumed = units;
        this.ratePerUnit = rate;
    }

    public double calculateBill() {
        return unitsConsumed * ratePerUnit;
    }

    public double calculateOptimizedBill() {
        double optimizedUnits = unitsConsumed;

        if (unitsConsumed > 500) {
            optimizedUnits *= 0.90;
        }

        return optimizedUnits * ratePerUnit;
    }

    public void displayDetails() {
        double original = calculateBill();
        double optimized = calculateOptimizedBill();

        System.out.println("Building ID: " + buildingId);
        System.out.println("Building Name: " + buildingName);

        System.out.printf(Locale.US,
                "Original Bill: %.1f%n", original);

        System.out.printf(Locale.US,
                "Optimized Bill: %.1f%n", optimized);

        System.out.printf(Locale.US,
                "Savings: %.1f%n", original - optimized);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int id = sc.nextInt();
            String name = sc.next();
            double units = sc.nextDouble();
            double rate = sc.nextDouble();

            EnergyGrid building =
                new EnergyGrid(id, name, units, rate);

            if (i > 0) System.out.println();
            building.displayDetails();
        }

        sc.close();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND04)