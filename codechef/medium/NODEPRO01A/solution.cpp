app.set('view engine', 'ejs');
app.set('views', path.join(__dirname, 'views'));

// Routes
app.get('/', (req, res) => {
    res.render('index');
    });

    // Create notes folder if it does not exist

      if (!fs.existsSync('./notes')) fs.mkdirSync('./notes');

        // Start server
        app.listen(PORT, () => {
            console.log(`Server running at http://localhost:${PORT}`);
      
// View engine