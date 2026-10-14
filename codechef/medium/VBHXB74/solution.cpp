// write your code here.
const express = require('express');
const app = express();

app.get('/', (req, res) => {
  res.send('Welcome to our services page!');
  });

  app.get('/web', (req, res) => {
    res.send('We specialize in Web Development.');
    });

    app.get('/mobile', (req, res) => {
      res.send('We also offer Mobile App Development.');
      });

      const PORT = process.env.PORT || 3000;
      app.listen(PORT, () => {
        console.log(`Server is running on port ${PORT}`);
        });

