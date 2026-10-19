# VBHXB49

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Analyze and Modify Book File Paths

Okay, let's test your understanding of the `path` module with a new challenge!

Imagine you're building a program to manage a digital library. You need to process file paths for book files.

### Task:
- Construct a file path by combining the directory books, a sub-directory representing the genre fiction, and a filename representing the book title The_Great_Novel.pdf. Assume you're starting from the project's root directory.
- Convert the constructed path into an absolute path based on the current location of the script.
- From the absolute path, extract the filename, change its extension from.pdf to.epub, and create a new path using the updated filename and the same directory.
- Print both the original absolute path and the new absolute path with the changed extension to the console.

The final output should look like this:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:54:00.126Z  

```cpp
const path = require('path');

// 1. Construct the original file path
const baseDir = 'books';
const genreDir = 'fiction';
const originalFile = 'The_Great_Novel.pdf';

const relativePath = path.join(baseDir, genreDir, originalFile);

// 2. Convert to absolute path
const originalAbsolutePath = path.resolve(relativePath);

// 3. Change the file extension from .pdf to .epub
const fileNameWithoutExt = path.basename(originalAbsolutePath, '.pdf');
const newFileName = fileNameWithoutExt + '.epub';

// 4. Construct the new absolute path
const originalDir = path.dirname(originalAbsolutePath);
const newAbsolutePath = path.join(originalDir, newFileName);

// 5. Print the results
console.log('Original Absolute Path:', originalAbsolutePath);
console.log('New Absolute Path:', newAbsolutePath);
// write your code here
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB49)