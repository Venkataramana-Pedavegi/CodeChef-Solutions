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
