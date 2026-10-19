  res.end('Message file not found. Please create the file message.txt.');
  } else { 
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.writeHead(500, { 'Content-Type': 'text/plain' });
    res.end('500 Internal Server Error');
    }
    } else {
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end(data);
    }
    });
    } else{
  res.writeHead(200, { 'Content-Type': 'text/plain' });
  // File does not exist
  if (err) {
  if (err.code === 'ENOENT') {
  fs.readFile(filePath, 'utf8', (err, data) => {

else if (req.url === '/message') {
  const filePath = path.join(__dirname, 'message.txt');
//   add your else if block here
  } 
    res.end('Welcome to the server!');
const http = require('http');
const fs = require('fs');
const path = require('path');

const server = http.createServer((req, res) => {
  if (req.url === '/') {
    res.writeHead(200, { 'Content-Type': 'text/plain' });