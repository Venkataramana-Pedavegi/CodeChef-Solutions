# WEBCONT06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Employee Salary Slip using JSP

Organizations generate salary slips for employees by calculating allowances and benefits based on their basic salary.  **JavaServer Pages (JSP)**  can be used to perform calculations and dynamically display the results on a web page.

Your task is to develop a JSP application that generates an  **employee salary slip**.

 **Requirements** 

 **Employee Information** 
Declare and initialize the following variables:

Variable	Value
Employee ID	E101
Employee Name	John Doe
Basic Salary	50000

 **Salary Calculation** 
Calculate the following values:

Component	Formula
HRA	20% of Basic Salary
DA	10% of Basic Salary
Gross Salary	Basic Salary + HRA + DA

 **Display Information** 
Display the following details on the JSP page:

- Employee ID
- Employee Name
- Basic Salary
- HRA
- DA
- Gross Salary
- The values should be displayed dynamically using JSP expressions.

 **Example Output** 

```
<html>
<head>
    <title>Employee Salary Slip</title>
</head>
<body>

<h1>Employee Salary Slip</h1>

<p>
    Employee ID:
    E101
</p>

<p>
    Employee Name:
    John Doe
</p>

<p>
    Basic Salary:
    50000.0
</p>

<p>
    HRA:
    10000.0
</p>

<p>
    DA:
    5000.0
</p>

<p>
    Gross Salary:
    65000.0
</p>

</body>

```

 **Test Using curl** 

```
curl http://localhost:8080/EmployeeSalaryJSPApp-1.0/index.jsp

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T10:35:15.475Z  

```cpp
<p>
    DA:
    <%= da %>
</p>

<p>
    Gross Salary:
    <%= grossSalary %>
</p>

</body>
</html>
```

---

[View on CodeChef](https://www.codechef.com/problems/WEBCONT06)