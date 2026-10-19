# VBHXB45

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Async Read, Filter, and Write

Let's create a program that asynchronously reads a list of fruits from a file named `fruits.txt`, filters out the fruits that start with the letter "b", and then writes the remaining fruits to a new file named `filtered_fruits.txt`.

The file named `fruits.txt` contains the following content:

```
apple
banana
orange
blueberry
grape

```

Here's how the code will work:

- Read the content of fruits.txt asynchronously.
- Split the content into an array of fruits (assuming each fruit is on a new line).
- Filter the array to keep only fruits that do not start with "b".
- Join the filtered array back into a string, with each fruit on a new line.
- Write the filtered string to filtered_fruits.txt asynchronously.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T15:48:29.762Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB45)