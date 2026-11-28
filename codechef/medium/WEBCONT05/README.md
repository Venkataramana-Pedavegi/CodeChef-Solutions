# WEBCONT05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Student Grade Calculator Servlet

Educational portals often calculate student results based on marks entered by users. Servlets can process user input and generate dynamic responses based on the submitted data.

Your task is to develop a servlet-based application that calculates the  **average marks**  and  **grade**  of a student.

 **Requirements** 

- Handle HTTP POST requests
- Read the following values from the request: Student Name Subject 1 Marks Subject 2 Marks Subject 3 Marks

 **Calculate:** 

- Total Marks
- Average Marks

 **Determine the Grade** 
Use the following criteria:

Average Marks	Grade
90 and above	A
75 - 89	B
60 - 74	C
Below 60	D
- Display the result as an HTML page

 **Input Example** 

```
Student Name: John Doe
Subject 1: 95
Subject 2: 88
Subject 3: 91

```

 **Expected Output** 

```
<html>
<head>
<title>Student Result</title>
</head>
<body>
<h2>Student Result</h2>
<p>Student Name: John Doe</p>
<p>Total Marks: 274</p>
<p>Average Marks: 91.33</p>
<p>Grade: A</p>
</body>
</html>

```

 **Test the Servlet** 

```
curl -X POST \
  -d "studentName=John Doe&subject1=95&subject2=88&subject3=91" \
  http://localhost:8080/GradeCalculatorApp-1.0/result

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-28T10:34:31.372Z  

```cpp
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Result</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h2>Student Result</h2>");

        out.println("<p>Student Name: "
                + studentName + "</p>");

        out.println("<p>Total Marks: "
                + total + "</p>");

        out.println("<p>Average Marks: "
                + String.format("%.2f", average)
                + "</p>");

        out.println("<p>Grade: "
                + grade + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/WEBCONT05)