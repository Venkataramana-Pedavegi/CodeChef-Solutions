# NODEPRO01B

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add new notes

Now moving further we would start building our APIs and functionalities.

First we would make the note adding feature.

#### Task:
- Add the frontend file add-note.ejs for /add route.
- Complete the logic to add notes in the route /add: The frontend file have 2 inputs title and content, so check if any of these inputs are missing and if missing response Missing fields. Make a new file with name user input Title +.txt file format and save it in the notes folder. If everything work correctly send response Note saved.
- Add the /notes routes in the server.js to serve all the routes in notes.js file.
### APIs Notes:
Endpoint	Method	Description
`/notes/add`	POST	Adds a new note (from user input)
#### Expected output after clicking on the add-note button:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:10:43.789Z  

```cpp



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

```

---

[View on CodeChef](https://www.codechef.com/problems/NODEPRO01B)