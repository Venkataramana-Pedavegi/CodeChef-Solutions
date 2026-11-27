# EMPLOYEEPER

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Layered Properties Manager

A company stores the performance records of N employees. Each employee has:

- A unique employee name
- A performance score
- A number of completed projects

The company applies the following filtering rules:

- Remove every employee whose performance score is strictly less than P.
- Remove every employee whose number of completed projects is strictly less than M.

After removing the ineligible employees, sort the remaining employees using the following rules:

- Higher performance score comes first.
- If two employees have the same score, the employee with more completed projects comes first.
- If both score and project count are equal, sort their names lexicographically.

Print the remaining employees in the required order.

Note: Use an Iterator to safely remove employees from the collection and a Comparator to sort the remaining employees.

### Input Format
- The first line contains three integers: N, P, and M — representing the total number of employees, the minimum required performance score, and the minimum required number of completed projects, respectively. The next N lines each contain:
- name score projects
### Output Format
- Print every eligible employee on a new line in the following format: name score projects
- If no employee remains after filtering, print: NO EMPLOYEE
### Constraints
- 1 <= N <= 100000
- 0 <= P <= 100
- 0 <= M <= 100000
- 0 <= score <= 100
- 0 <= projects <= 100000
- 1 <= length of name <= 20
- Employee names contain only uppercase and lowercase English letters.
### Sample 1:
Input
Output

```
5 50 2 
Zoya 70 4 
Amit 70 4 
Neeraj 70 5 
Bhavna 80 2 
Chetan 50 10
```

```
Bhavna 80 2
Neeraj 70 5
Amit 70 4
Zoya 70 4
Chetan 50 10
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-27T13:52:59.289Z  

```java
import java.io.*;
import java.util.*;

public class Main {

    static class Employee {
        String name;
        int score;
        int projects;

        Employee(String name, int score, int projects) {
            this.name = name;
            this.score = score;
            this.projects = projects;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int minimumScore = Integer.parseInt(st.nextToken());
        int minimumProjects = Integer.parseInt(st.nextToken());

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            int projects = Integer.parseInt(st.nextToken());

            employees.add(new Employee(name, score, projects));
        }

        // Safely remove ineligible employees using Iterator.
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (employee.score < minimumScore
                    || employee.projects < minimumProjects) {
                iterator.remove();
            }
        }

        // Custom sorting using Comparator.
        employees.sort((first, second) -> {
            // Higher score first.
            if (first.score != second.score) {
                return Integer.compare(second.score, first.score);
            }

            // More completed projects first.
            if (first.projects != second.projects) {
                return Integer.compare(
                        second.projects,
                        first.projects
                );
            }

            // Lexicographically smaller name first.
            return first.name.compareTo(second.name);
        });

        if (employees.isEmpty()) {
            System.out.println("NO EMPLOYEE");
            return;
        }

        StringBuilder output = new StringBuilder();

        for (Employee employee : employees) {
            output.append(employee.name)
                  .append(' ')
                  .append(employee.score)
                  .append(' ')
                  .append(employee.projects)
                  .append('\n');
        }

        System.out.print(output);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EMPLOYEEPER)