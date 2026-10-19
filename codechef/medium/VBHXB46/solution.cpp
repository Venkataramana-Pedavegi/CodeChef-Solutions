
console.log('Reading words.txt...');

fs.readFile(inputFile, 'utf8', (err, data) => {
if (err) {
return console.error('Error reading file:', err);
}

// Step 1: Split by new lines and trim
const words = data.split('\n').map(word => word.trim());
const shortWords = words.filter(word => word.length <= 5);

// Step 3: Join back to a string
const result = shortWords.join('\n');

console.log('Writing short words to short_words.txt...');

fs.writeFile(outputFile, result, 'utf8', (err) => {
if (err) {
return console.error('Error writing file:', err);
}

console.log('Short words written successfully!');
});
});