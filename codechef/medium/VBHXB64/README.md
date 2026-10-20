# VBHXB64

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product Details Server

You are tasked with creating a simple server that provides product details based on the product ID provided in the URL.

Here's the scenario:

We want our server to respond with different product details based on the URL.

- If the user visits /product?id=123, the server should respond with "Product ID: 123, Name: Example Product, Price: $25".
- If the user visits /product?id=456, the server should respond with "Product ID: 456, Name: Another Product, Price: $50".
- If the user visits just /product, or /product?id=, the server should respond with "Error: Product ID is required".
- If the user visits any other path, the server should respond with a 404 "Not Found" error.

The product details are hardcoded within the server.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:30:24.134Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB64)