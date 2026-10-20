# FYAOAZ09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Display a Motivational Quote

Let's build an application that displays a motivational quote. This will give you further practice in passing data to views within an Express application using EJS.

We'll create a route that selects a quote from a predefined list and passes it to an EJS template for display.

### Task:
- Complete the index.js file to store the quotes and randomly selecting one of the quote and sending it to the quote.ejs file.
- Complete the quote.ejs file to show the quotes on the webpage.

 **Hint** : You can use the following code to generate a random index between `0` (inclusive) and `quotes.length` (exclusive):

```
const randomIndex = Math.floor(Math.random() * quotes.length);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T05:39:14.192Z  

```cpp
const express = require('express');
const app = express();

// Set the view engine to ejs


app.get('/', (req, res) => {
  // Array of motivational quotes
  const quotes = [
    "I am build upon the small things I do everyday and the end results are no more than a byproduct of that. -Shinsuke Kita",
    "Strive not to be a success, but rather to be of value. - Albert Einstein",
    "The future belongs to those who believe in the beauty of their dreams. - Eleanor Roosevelt",
    "Discipline is doing what you hate to do, but do it like you love it. -Mike Tyson"
  ];

  // Select a random quote


  // Pass the quote to the 'quote' view
  

  
});

app.listen(3000, () => {
  console.log('Server is running on port 3000');
});

```

---

[View on CodeChef](https://www.codechef.com/problems/FYAOAZ09)