# VBHXB102

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Product Data

Let's solidify your understanding of input validation with another practical scenario: validating product data for an e-commerce application.

Here's the problem:

You need to create an Express route that handles requests to add a new product. The route should:

- Check if the name, price, and quantity fields are present in the request body.
- Check if the name is a string and is not empty.
- Check if the price is a number and is greater than 0.
- Check if the quantity is an integer and is greater than or equal to 0.

If any of these checks fail, the route should send a 400 "Bad Request" status code with a descriptive error message.

If all checks pass, it should log the received data to the console and send a `Product added successfully!` message.

Remember the basic Express setup, including the `express.json()` middleware for parsing JSON. You'll create a route for handling the product data submission and implement the validation logic step by step.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T17:08:39.355Z  

```cpp
  // Validate quantity
  if (!Number.isInteger(quantity) || quantity < 0) {
  return res.status(400).send('Quantity must be an integer greater than or equal to 0.');
  }
  console.log('Product received:', { name, price, quantity });
  res.send('Product added successfully!');
  });

  app.listen(8080, () => {
  console.log('Server listening on port 8080');
  });

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB102)