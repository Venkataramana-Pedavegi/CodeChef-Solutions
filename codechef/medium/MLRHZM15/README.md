# MLRHZM15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Product ID

An e-commerce application assigns a unique product ID to every product.

Validate a given product ID using a custom checked exception. A valid product ID must satisfy all of the following conditions:

- It must contain exactly $8$ characters long.
- First $3$ characters are uppercase English letters (A-Z).
- Last $5$ characters are digits (0-9).

 **Example:**  `ABC12345` is a valid product ID.

 **Task** 
Complete the following:

- The InvalidProductIDException class
- The validateProductID(String productID) method of the ProductValidation class.
### Sample 1:
Input
Output

```
ABC12345
```

```
Valid Product ID
```

### Sample 2:
Input
Output

```
abc12345
```

```
Invalid Product ID
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-21T13:57:04.915Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class InvalidProductIDException extends Exception
{
    InvalidProductIDException(String message)
    {
        super(message);
    }
}

class ProductValidation
{
    void validateProductID(String productID) throws InvalidProductIDException
    {
        if (!productID.matches("[A-Z]{3}[0-9]{5}"))
        {
            throw new InvalidProductIDException("Invalid Product ID");
        }
    }
}



class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String productID = sc.next();

        ProductValidation validator = new ProductValidation();

        try
        {
            validator.validateProductID(productID);
            System.out.println("Valid Product ID");
        }
        catch (InvalidProductIDException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MLRHZM15)