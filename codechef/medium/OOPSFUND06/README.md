# OOPSFUND06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Lab - Employee Salary Management System

Hello Developers! 👋 Welcome to the  **Employee Salary Management System**  lab!

In this lab, you will apply  **inheritance in Java**  to manage different types of employees. You will implement a base `Employee` class and extend it to create `FullTimeEmployee` and `SalesEmployee` classes, each with its own salary calculation.

#### Project Structure

You are given the following file:

- Codechef.java → Contains TODOs for implementing the employee classes, constructors, getters, and salary calculations. This is the only file you need to edit.
#### Task

Complete the TODOs in `Codechef.java` by implementing the following functionality:

 **1. Implement the Base Employee Class** 

- Store the employee ID, name, and base salary using private fields.
- Initialize employee details through a constructor.
- Reject null or blank IDs and names, and negative or non-finite base salaries.
- Provide getter methods to access employee details.
- Implement calculateSalary() to return the base salary.

 **2. Implement the Full-Time Employee Class** 

- Extend the Employee class.
- Store the employee's bonus.
- Initialize inherited fields using the parent class constructor.
- Reject negative or non-finite bonus values.
- Provide a getter for the bonus.
- Override calculateSalary() to return the base salary plus the bonus.

 **3. Implement the Sales Employee Class** 

- Extend the Employee class.
- Store the sales amount and commission rate.
- Initialize inherited fields using the parent class constructor.
- Reject negative or non-finite sales amounts.
- Ensure the commission rate is between 0 and 1, inclusive, and is finite.
- Provide getter methods for the sales amount and commission rate.
- Implement calculateCommission() to calculate the commission based on sales and the commission rate.
- Override calculateSalary() to return the base salary plus the commission.
#### Important Rules
- Do not change class or method names.
- Maintain the inheritance relationship between Employee, FullTimeEmployee, and SalesEmployee.
- Use the parent class constructor to initialize inherited employee details.
- Override calculateSalary() in both subclasses.
- Complete the implementation in Codechef.java.
- Ensure invalid constructor arguments are rejected using IllegalArgumentException.
#### Expected Output

```
Full-Time Employee: Aman
Employee ID: E101
Base Salary: 40000.0
Bonus: 5000.0
Total Salary: 45000.0

Sales Employee: Sara
Employee ID: E102
Base Salary: 30000.0
Sales Commission: 5000.0
Total Salary: 35000.0

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T14:23:06.315Z  

```cpp
        return employeeId;
    }

    public String getName() {
        return name;

        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getEmployeeId() {
            throw new IllegalArgumentException("Invalid base salary");
        }
        if (!Double.isFinite(baseSalary) || baseSalary < 0) {

        }
            throw new IllegalArgumentException("Invalid employee name");
        if (name == null || name.isBlank()) {

        }
            throw new IllegalArgumentException("Invalid employee ID");
        if (employeeId == null || employeeId.isBlank()) {
    public Employee(String employeeId, String name, double baseSalary) {

    private double baseSalary;
    private String name;
    private String employeeId;
class Employee {
```

---

[View on CodeChef](https://www.codechef.com/problems/OOPSFUND06)