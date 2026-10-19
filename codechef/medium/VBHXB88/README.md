# VBHXB88

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Serve a JSON file

Now that you have learned how to serve static files like HTML, CSS, and JavaScript using `express.static()`, let’s try serving a JSON file. This is a common task when building APIs or serving configuration data to your front-end applications.

### Task:

Write in the `index.js` file to serve the `books.json` file (and other static files in the `public` directory) using `express.static()`. When a user visits `/books.json` in their browser, they should see the JSON data.

Remember to use the `path` module to correctly join the directory paths.

Write the `index.js` file including importing the necessary modules (`express` and `path`), creating an Express application, defining the port, using `express.static()` middleware to serve the `public` directory, and starting the server.

After writing the code "RUN" the code and change the url in the browser that is opened to `/books.json` to see the json file content on the browser.

 **Expected Output in your browser**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T16:48:17.563Z  

```cpp

const app = express();
const port = 3000;

app.use(express.static(path.join(__dirname, 'public')));

    app.listen(port, () => {
        console.log(`Server is running at http://localhost:${port}`);

        });
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB88)