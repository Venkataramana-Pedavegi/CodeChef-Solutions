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
