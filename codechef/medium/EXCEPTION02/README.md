# EXCEPTION02

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Todo List Application - Validate Date

A task-management system associates each task with a deadline. Before accepting a deadline, the application must verify that the supplied value represents a valid calendar date in the required format.

Complete the `validateDate()` method so that it correctly validates the given deadline.

### Requirements

A deadline is valid only if it:

- Follows the exact format DD-MM-YYYY.
- Represents an actual calendar date.
- Correctly handles month lengths and leap years.
- Contains no missing, additional, or malformed characters.

 **Valid Examples:** 

- 15-03-2025
- 29-02-2024
- 01-12-2030

 **Invalid Examples:** 

- 31-02-2025
- 29-02-2025
- 1-03-2025
- 15/03/2025
- 15-13-2025
- 15-03-2025abc
- hello
### Task

Complete the following method:

```
public static Date validateDate(String deadline)

```

 **If the deadline is valid:** 

- Return the corresponding Date object.
- do not print anything inside validateDate().

 **If the deadline is invalid:** 

- Print exactly: Invalid date format! Please enter the deadline in DD-MM-YYYY format.
- Return null
### Sample 1:
Input
Output

```
15-03-2025

```

```
Valid date: 15-03-2025
```

### Sample 2:
Input
Output

```
15/03/2025
```

```
Invalid date format! Please enter the deadline in DD-MM-YYYY format.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:56:13.930Z  

```java
import java.util.*;
import java.text.*;

class Codechef
{
    public static Date validateDate(String deadline)
    {
        String errorMessage =
            "Invalid date format! Please enter the deadline in DD-MM-YYYY format.";

        if (deadline == null ||
            !deadline.matches("\\d{2}-\\d{2}-\\d{4}"))
        {
            System.out.println(errorMessage);
            return null;
        }

        SimpleDateFormat sdf =
            new SimpleDateFormat("dd-MM-yyyy");

        sdf.setLenient(false);

        try
        {
            return sdf.parse(deadline);
        }
        catch (ParseException e)
        {
            System.out.println(errorMessage);
            return null;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String deadline = sc.nextLine();

        Date result = validateDate(deadline);
        if (result != null) {
            System.out.println("Valid date: " + deadline);
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EXCEPTION02)