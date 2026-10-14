# VBHXB92

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Middleware Execution Order: Header Addition

To understand how middleware functions execute in sequence within an Express application, let's walk through a simple example that demonstrates two middleware functions: one that logs the requested path and another that modifies the incoming request object.

### The Setup:

We’ve built a simple Express server with one route (`/`) and two middleware functions. The goal is to observe how the order in which we register these middleware affects the behavior of our application.

### 1. Logging the Request Path

The first middleware is called `logPathMiddleware`. This function logs the path of every incoming request to the console. It’s registered using `app.use()`, meaning it applies to  **all routes**.

```
const logPathMiddleware = (req, res, next) => {
  console.log(`Requested Path: ${req.path}`);
  next();
};

```

- It accesses req.path and prints it.
- Then, it calls next() to pass control to the next middleware in line.
### 2. Adding a Custom Message to the Request Object

The second middleware is `addCustomMessageMiddleware`. It adds a new property, `customMessage`, to the `req` object.

```
const addCustomMessageMiddleware = (req, res, next) => {
  req.customMessage = 'Welcome to our API!';
  next();
};

```

- This middleware enriches the request object with additional data.
- This data (req.customMessage) can then be accessed by any subsequent middleware or route handler.
### 3. Registering Middleware in the Correct Order

We register both middleware functions before the route handler:

```
app.use(logPathMiddleware);
app.use(addCustomMessageMiddleware);

```

This order is crucial. If `addCustomMessageMiddleware` were placed  **after**  the route handler, then the route wouldn't have access to `req.customMessage`, and the message wouldn't appear in the response.

### 4. The Route Handler

Finally, we define a route for GET requests to `/`:

```
app.get('/', (req, res) => {
  res.send(`Hello World! ${req.customMessage}`);
});

```

This handler sends a plain text response including the message set by the second middleware.

### What Happens When You Visit /?

When a client sends a GET request to `/`, here's the flow:

- logPathMiddleware logs the path / to the console.
- addCustomMessageMiddleware adds req.customMessage = 'Welcome to our API!'.
- The route handler reads that value and sends: Hello World! Welcome to our API!
### Conclusion

This example shows how middleware functions in Express execute  **in the order they’re defined**, and how you can use that sequence to manipulate request or response objects before they reach the route handler. Middleware is a powerful pattern for building scalable and readable web applications.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-14T10:40:01.014Z  

```cpp
const app = express();
const port = 3000;

// Middleware 1: Logs the request path
const logPathMiddleware = (req, res, next) => {
  console.log(`Requested Path: ${req.path}`);
  next();
};

// Middleware 2: Adds a custom message to the request object
const addCustomMessageMiddleware = (req, res, next) => {
  req.customMessage = 'Welcome to our API!';
  next();
};

// Order matters here!
app.use(logPathMiddleware);
app.use(addCustomMessageMiddleware);

// Route handler
app.get('/', (req, res) => {
  res.send(`Hello World! ${req.customMessage}`);
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});

```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB92)