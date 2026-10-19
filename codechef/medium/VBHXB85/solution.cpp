const http = require('http');
const productsRouter = require('./products');
const categoriesRouter = require('./categories');

const app = express();

app.use('/products', productsRouter);
app.use('/categories', categoriesRouter);

app.get('/', (req, res) => {
  res.send('Welcome to the Product Catalog API!');
});

const PORT = 3000;
const server = http.createServer(app);

server.listen(PORT, () => {
  console.log(`Server running on http://localhost:${PORT}`);
});
