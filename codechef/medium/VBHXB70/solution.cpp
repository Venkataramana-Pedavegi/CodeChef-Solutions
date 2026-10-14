// write your code here.
const express = require('express');
const app = express();

const greeting = 'Hello, there!';

app.get('/', (req, res) => {
  res.send(greeting);
  });

  const PORT = 3000;
  app.listen(PORT, () => {
    console.log(`Server is running on port ${PORT}`);
    });
