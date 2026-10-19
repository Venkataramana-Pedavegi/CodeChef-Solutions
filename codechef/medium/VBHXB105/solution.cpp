// write your code here
const express = require('express');
const app = express();

// Root route: HTML welcome message
app.get('/', (req, res) => {
  res.send('<h1>Welcome to the Book Store!</h1>');
    });

      // /books route: Return book data as JSON
      app.get('/books', (req, res) => {
        const books = [
            { id: 1, title: "The Hitchhiker's Guide to the Galaxy", author: "Douglas Adams" },
            { id: 2, title: "Pride and Prejudice", author: "Jane Austen" },
            { id: 3, title: "1984", author: "George Orwell" }
            ];

            res.json(books);
            });
            const PORT = 3000;
            app.listen(PORT, () => {
            console.log(`Server is running on http://localhost:${PORT}`);
            });
        