# VBHXB43

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### File Organizer Script

You're building a simple script to organize files. The script should take a file name as input.

### Here's the problem:

Your script should first check if a file with the given name exists. If the file  *doesn't*  exist, it should create it.
Then, regardless of whether it was created or already existed, the script should add the text use `appendFileSync(file_name, "text to be added")` to add the text in the file.

```
"File organized!"

```

Finally, the script should rename the file to `organized_file.txt`. And the output strings should show the name of the files dynamically.

The output should look like the image given below:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T08:14:57.412Z  

```cpp
const initialFilePath = path.resolve(__dirname, initialFileName);
const organizedFilePath = path.resolve(__dirname, organizedFileName);

try {
  // Step 1: Check if the file exists
    if (!fs.existsSync(initialFilePath)) {
        // Create the file if it doesn't exist
            fs.writeFileSync(initialFilePath, '');
                console.log(`Created new file: ${initialFileName}`);
                  } else {
                      console.log(`File already exists: ${initialFileName}`);
                        }

                          // Step 2: Append text to the file
                            fs.appendFileSync(initialFilePath, 'File organized!\n');
                              console.log(`Appended "File organized!" to ${initialFileName}`);

                                // Step 3: Rename the file
                                  fs.renameSync(initialFilePath, organizedFilePath);
                                    console.log(`File renamed to ${organizedFileName}`);

                                    } catch (error) {
                                      console.error('An error occurred:', error);
                                      }
                                      
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB43)