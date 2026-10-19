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