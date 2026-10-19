const port = 3000;

// Route: GET /books/:bookId
app.get('/books/:bookId', (req, res) => {
    const bookId = req.params.bookId;   // Route parameter
        const chapter = req.query.chapter;  // Query parameter

            // Build response object
   let responseText = `Book ID: ${bookId}`;
   if (chapter) {
   responseText += `, Chapter: ${chapter}`;
   }

   res.send(responseText);
   });

   app.listen(port, () => {
   console.log(`Server listening on port ${port}`);
   });             