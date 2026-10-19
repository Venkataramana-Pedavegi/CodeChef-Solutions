const path = require('path');

const app = express();

// Middleware to parse URL-encoded form data
app.use(express.urlencoded({ extended: false }));

// Middleware to parse JSON data
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));

// Route to handle form submissions
app.post('/add-todo-form', (req, res) => {
console.log('Form To-Do received:');
console.log(req.body); // Should contain { task: 'Your task' }
res.send('To-Do added!');
});
app.post('/add-todo-json', (req, res) => {
  console.log('JSON To-Do received:');
  console.log(req.body); // Should contain { task: 'Your task' }
  res.json({ message: 'To-Do added!' });
  });
  const PORT = 3000;
  app.listen(PORT, () => {
  console.log(`Server listening on port ${PORT}`);
})

const express = require('express');