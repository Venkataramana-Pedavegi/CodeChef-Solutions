const path = require('path');
const os = require('os');

const filePath = '/users/john/documents/report.txt';

const fileName = path.basename(filePath);
const platform = os.platform();

console.log('Extracted filename:', fileName);
console.log('Operating System Platform:', platform);