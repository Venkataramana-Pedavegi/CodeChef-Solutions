# VBHXB101

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Validate Contact Form Data

Okay, let's practice input validation with a common scenario: a contact form. Imagine you're building a website and you have a contact form where users can submit their name, email, and message. We need to validate this data before processing it.

Here's the problem:

We want to create an Express route that handles contact form submissions. The route should:

- Check if the name, email, and message fields are present in the request body.
- Check if the name and message are strings and are not empty.
- Check if the email is a string and contains the "@" symbol. This is a very basic email validation; a more robust solution would use regular expressions, but for simplicity, we'll stick to this check for now.

If any of these checks fail, the route should send a 400 "Bad Request" status code with a descriptive error message. If all checks pass, it should log the received data to the console and send a "Data received successfully!" message.

Let's break down how to approach this. We'll start with the basic Express setup, including the `express.json()` middleware to parse JSON request bodies. Then, we'll add our route for handling the form submission and implement the validation logic step by step.

### Main Parts of the Code:

Inside the `/contact` route:

- The req.body object is destructured to extract name, email, and message submitted by the client.
- The first check ensures all three fields are present. If any of them are missing, the server responds with a 400 status and an error message.
- The second check ensures both name and message are non-empty strings. This avoids accepting blank or invalid values.
- The third check validates that the email is a string and includes the @ symbol to catch obviously invalid emails.
- If all validations pass, the server logs the submitted data to the console and sends back a success response to the client.
#### Task:

Complete the code to parse `json` middleware.

#### Note:

How to use the mini postman in the web.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T17:05:21.939Z  

```cpp
  const express = require('express');
  const app = express();

  // Middleware to parse JSON request bodies


  app.post('/contact', (req, res) => {
    const { name, email, message } = req.body;

    // Check if required fields are present
    if (!name || !email || !message) {
      return res.status(400).send('Name, email, and message are required.');
    }

    // Check if name and message are strings and not empty
    if (typeof name !== 'string' || name.trim() === '' || typeof message !== 'string' || message.trim() === '') {
      return res.status(400).send('Name and message must be non-empty strings.');
    }

    // Check if email is a string and contains "@"
    if (typeof email !== 'string' || !email.includes('@')) {
      return res.status(400).send('Invalid email format.');
    }

    // If all checks pass
    console.log('Received data:', { name, email, message });
    res.send('Data received successfully!');
  });

  app.listen(8080, () => {
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB101)