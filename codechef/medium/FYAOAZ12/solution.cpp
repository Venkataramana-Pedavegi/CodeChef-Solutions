const express = require('express');
const app = express();

// Set EJS as the view engine
app.set('view engine', 'ejs');

// Middleware to use layouts (if using express-ejs-layouts)
const expressLayouts = require('express-ejs-layouts');
app.use(expressLayouts);
app.set('layout', 'layout'); // layout.ejs

// complete the home route with exporting current year to the footer file




app.listen(3000, () => {
  console.log('Server running on http://localhost:3000');
});
