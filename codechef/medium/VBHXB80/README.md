# VBHXB80

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Serve a Static Site with Assets Subdirectory

You've learned how to serve static files using Express. Now, let's practice serving static files from a subdirectory within your `public` directory. This is a common way to organize assets like images, CSS, and JavaScript files in a web project.

### Task:
- Import the express module.
- Create an Express application.
- Use express.static to serve static files from the public directory.
- Start the server on port 3000.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T09:59:24.125Z  

```cpp
const express = require('express');
const app = express();

app.use(express.static('public'));

app.listen(3000, () => {
    console.log('Server is running on port 3000');
    });


```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB80)