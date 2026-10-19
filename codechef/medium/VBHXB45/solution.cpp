    }

      return console.error('Error writing file:', err);
    if (err) {
  fs.writeFile(outputFile, result, 'utf8', (err) => {

  console.log('Writing filtered fruits to filtered_fruits.txt...');
  const result = filtered.join('\n');

  // Step 3: Join back into string

  const filtered = fruits.filter(fruit => !fruit.toLowerCase().startsWith('b'));
  // Step 2: Filter fruits that don't start with 'b' or 'B'
  const fruits = data.split('\n').map(fruit => fruit.trim());


  // Step 1: Split into lines
  }
fs.readFile(inputFile, 'utf8', (err,data) =>{
  if (err) {
    return console.error('Error reading file:', err);
// complete the code to read the inputFile

console.log('Reading fruits.txt...');
const path = require('path');

const inputFile = path.resolve(__dirname, 'fruits.txt');
const outputFile = path.resolve(__dirname, 'filtered_fruits.txt');

    console.log('Filtered fruits written successfully!');