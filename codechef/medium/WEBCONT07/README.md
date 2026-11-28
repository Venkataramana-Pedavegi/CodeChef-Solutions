# WEBCONT07

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### JSP Standard Actions - Page Inclusion

Large web applications often reuse common sections such as headers, footers, menus, and navigation bars across multiple pages. JSP Standard Actions provide an easy way to include reusable content dynamically.

Your task is to develop a JSP application that demonstrates the use of the  **JSP Include Standard Action**.

 **Requirements** 
Create two JSP pages:

 **1. `header.jsp`** 
This page should display:

```
Welcome to Student Portal

```

 **2. `index.jsp`** 
This page should:

- Include header.jsp using the JSP standard action tag <jsp:include>
- Display the following student details: Student ID: S101 Student Name: John Doe Department: Computer Science

 **Test the Application in Terminal** 

```
curl http://localhost:8080/JSPIncludeApp-1.0/index.jsp

```

 **Expected Result** 

```
<html>
<head>
    <title>JSP Include Demo</title>
</head>
<body>

    <!-- Include header.jsp using JSP standard action -->
    <h2>Welcome to Student Portal</h2>

    <!-- Display student details -->
    <p>Student ID: S101</p>
    <p>Student Name: John Doe</p>
    <p>Department: Computer Science</p>

</body>

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T10:36:25.803Z  

```cpp
<body>

    <jsp:include page="header.jsp" />

    <p>Student ID: S101</p>

    <p>Student Name: John Doe</p>

    <p>Department: Computer Science</p>

</body>
</html>
```

---

[View on CodeChef](https://www.codechef.com/problems/WEBCONT07)