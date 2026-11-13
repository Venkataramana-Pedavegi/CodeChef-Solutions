# OOPSFUND05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Bank Account Management System

Hello Developers! 👋 Welcome to the  **Bank Account Management System**  lab!

In this lab, you will apply  **encapsulation in Java**  to manage bank account information securely. You will implement a `BankAccount` class that protects its data and controls how account information is accessed and modified.

#### Project Structure

You are given the following files:

- BankAccount.java → Contains TODOs for implementing the account fields, constructor, getters, name update method, deposit, and withdrawal operations. This is the only file you need to edit.
- BankAccountDemo.java → Demonstrates account creation, balance updates, and transaction handling.
#### Task

Complete the TODOs in `BankAccount.java` by implementing the following functionality:

 **1. Encapsulate Account Data** 

- Store the account number, account holder's name, and balance.
- Restrict direct access to these fields.
- Ensure the account number cannot be changed after initialization.

 **2. Initialize and Access Account Details** 

- Initialize an account using its account number, account holder's name, and initial balance.
- Reject invalid account details and negative or non-finite initial balances.
- Provide getter methods to retrieve the account details.

 **3. Update Account Holder Information** 

- Allow the account holder's name to be updated.
- Reject null, empty, or blank names by throwing an IllegalArgumentException.
- Ensure the existing name remains unchanged when an invalid name is provided.

 **4. Implement Deposit** 

- Accept valid positive, finite deposit amounts.
- Update the balance only when the deposit is valid.
- Reject invalid amounts and deposits that would cause the balance to become non-finite.

 **5. Implement Withdrawal** 

- Allow withdrawals only when the amount is positive, finite, and does not exceed the available balance.
- Reject invalid withdrawals without changing the balance.
#### Important Rules
- Do not change class or method names.
- Do not modify BankAccountDemo.java.
- Complete the implementation in BankAccount.java.
#### Expected Output

```
Account Number: ACC101
Account Holder: Aman
Initial Balance: 5000.0
Deposit Successful: true
Balance After Deposit: 6500.0
Withdrawal Successful: true
Balance After Withdrawal: 4500.0
Invalid Withdrawal Successful: false
Final Balance: 4500.0

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:22:36.478Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND05)