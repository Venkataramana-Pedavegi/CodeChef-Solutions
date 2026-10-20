


// Add Note Logic
router.post('/add', (req, res) => {

    const { title, content } = req.body;
    if (!title || !content) return res.send('Missing fields');

    const filePath = path.join(notesDir, `${title}.txt`);
    fs.writeFile(filePath, content, err => {
    if (err) return res.status(500).send('Failed to save note');
    return res.status(200).send('Note saved'); 
    });
    });




    });
router.get('/add', (req, res) => {
    res.render('add-note');
// Form Page to Add Note
 
const notesDir = path.join(__dirname, '..', 'notes');

module.exports = router;
