# EMPBONUS

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Performance Bonus

A company calculates the annual bonus of its employees according to their department and performance rating.

Each employee belongs to one of the following departments:

- $\texttt{TECH}$
- $\texttt{HR}$
- $\texttt{SALES}$

The bonus percentage is calculated according to these rules:

 **TECH Department** 

Performance rating	Bonus
Less than $3$	$5\%$
$3$ or $4$	$10\%$
$5$	$15\%$

 **HR Department** 

Performance rating	Bonus
Less than $3$	$3\%$
$3$ or $4$	$7\%$
$5$	$10\%$

 **SALES Department** 

Performance rating	Bonus
Less than $3$	$8\%$
$3$ or $4$	$12\%$
$5$	$20\%$

For every employee, calculate: $\text{Bonus Amount} = \frac{\text{Salary} \times \text{Bonus Percentage}}{100}$

and: $\text{Final Salary} = \text{Salary} + \text{Bonus Amount}$

If the department is not $\texttt{TECH}$, $\texttt{HR}$, or $\texttt{SALES}$, print $\texttt{INVALID}$.

 **Task** 

Complete the given Java program by implementing the missing parts.

- Define the static method isValidDepartment() inside the BonusPolicy interface to check whether the department is valid.
- Declare the abstract method getBonusPercentage() inside the BonusPolicy interface.
- Implement the default method calculateFinalSalary() to calculate and return the employee's final salary after adding the bonus.
- Store all employee details in a suitable Java collection.
- Use the provided BonusPolicy lambda expression to determine the bonus percentage based on department and rating.
- Process all employees using the forEach() method and generate the required output.
- Do not use a normal for loop while processing the final employee results.

A normal $\texttt{for}$ loop must not be used for processing the final employee results.

### Input Format
- The first line contains an integer $N$, representing the number of employees.
- The next $N$ lines contain four space-separated values: $\text{name} \quad \text{department} \quad \text{salary} \quad \text{rating}$

Where:

- $\texttt{name}$ is the employee's name without spaces.
- $\texttt{department}$ is the employee's department.
- $\texttt{salary}$ is the employee's current salary.
- $\texttt{rating}$ is the employee's performance rating.
### Output Format
- For every employee with a valid department, print: $\text{name} \quad \text{bonusPercentage} \quad \text{bonusAmount} \quad \text{finalSalary}$ All decimal values must be printed up to two decimal places.
- For an employee with an invalid department, print: $\text{name} \quad \text{INVALID}$
### Constraints
- $1 \le \text{salary} \le 10^7$
- $1 \le \text{rating} \le 5$

The department name is case-sensitive. Therefore:

- $\texttt{TECH}$ is valid
- $\texttt{Tech}$ and $\texttt{tech}$ are invalid.
### Sample 1:
Input
Output

```
6
Aman TECH 50000 5
Riya HR 40000 4
Karan SALES 30000 2
Neha TECH 60000 3
Rahul FINANCE 70000 5
Simran SALES 50000 5
```

```
Aman 15.00 7500.00 57500.00
Riya 7.00 2800.00 42800.00
Karan 8.00 2400.00 32400.00
Neha 10.00 6000.00 66000.00
Rahul INVALID
Simran 20.00 10000.00 60000.00
```

### Explanation:
#### Aman

Aman belongs to the $\texttt{TECH}$ department and has a rating of $5$. Therefore, the bonus percentage is $15\%$. $\text{Bonus amount} = 50000 \times \frac{15}{100} = 7500$ $\text{Final salary} = 50000 + 7500 = 57500$

#### Riya

Riya belongs to the $\texttt{HR}$ department and has a rating of $4$. Therefore, the bonus percentage is $7\%$. $\text{Bonus amount} = 40000 \times \frac{7}{100} = 2800$ $\text{Final salary} = 40000 + 2800 = 42800$

#### Rahul

$\texttt{FINANCE}$ is not a valid department. Therefore, the output is: $\texttt{Rahul INVALID}$

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:54:36.301Z  

```java
import java.io.*;
import java.util.*;

public class Main {

    // 1. Mandatory Interface
    interface BonusPolicy {
        // 2. Static method
        static boolean isValidDepartment(String dept) {
            return "TECH".equals(dept) || "HR".equals(dept) || "SALES".equals(dept);
        }

        // 3. Abstract method
        double getBonusPercentage(String dept, int rating);

        // 4. Default method
        default double calculateFinalSalary(double salary, double bonusAmount) {
            return salary + bonusAmount;
        }
    }

    // Record or Class for Employee data
    static class Employee {
        String name, dept;
        double salary;
        int rating;

        Employee(String name, String dept, double salary, int rating) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
            this.rating = rating;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        if (firstLine == null || firstLine.trim().isEmpty()) return;
        
        int n = Integer.parseInt(firstLine.trim());

        // 5. Store employees in a collection
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            employees.add(new Employee(st.nextToken(), st.nextToken(), 
                          Double.parseDouble(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        // Concrete implementation of BonusPolicy using standard rules
        BonusPolicy policy = (dept, rating) -> {
            switch (dept) {
                case "TECH":
                    return rating < 3 ? 5.0 : (rating <= 4 ? 10.0 : 15.0);
                case "HR":
                    return rating < 3 ? 3.0 : (rating <= 4 ? 7.0 : 10.0);
                case "SALES":
                    return rating < 3 ? 8.0 : (rating <= 4 ? 12.0 : 20.0);
                default:
                    return 0.0;
            }
        };

        StringBuilder output = new StringBuilder();

        // 6. Process collection strictly using forEach()
        employees.forEach(emp -> {
            if (!BonusPolicy.isValidDepartment(emp.dept)) {
                output.append(emp.name).append(" INVALID\n");
            } else {
                double bonusPct = policy.getBonusPercentage(emp.dept, emp.rating);
                double bonusAmt = emp.salary * bonusPct / 100.0;
                double finalSalary = policy.calculateFinalSalary(emp.salary, bonusAmt);

                output.append(String.format(Locale.US, "%s %.2f %.2f %.2f\n", 
                        emp.name, bonusPct, bonusAmt, finalSalary));
            }
        });

        System.out.print(output);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EMPBONUS)