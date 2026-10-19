
fs.mkdir(dirName, { recursive: true }, (err) => {
  if (err) {
    return console.error('Error creating directory:', err);
  }

  console.log(`Directory "${dirName}" created successfully.`);

  fs.readdir('.', (err, files) => {
    if (err) {
      return console.error('Error reading current directory:', err);
    }

    console.log('Contents of current directory:');
    // write code to print all the files in the directory
    files.forEach(file => {
    
      console.log(file);
      });
    })
  });



  


const dirName = 'my_directory';
const path = require('path');
const fs = require('fs');