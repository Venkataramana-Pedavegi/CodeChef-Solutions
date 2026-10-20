const products = {
'123': { name: 'Example Product', price: '\$25' },
'456': { name: 'Another Product', price: '\$50' }
};

const server = http.createServer((req, res) => {
  const parsedUrl = url.parse(req.url, true);
  const path = parsedUrl.pathname;
  const id = parsedUrl.query.id;

  if (path === '/product') {
  if (id && products[id]) {
  const product = products[id];
  res.writeHead(200, { 'Content-Type': 'text/plain' });

const http = require('http');
const url = require('url');