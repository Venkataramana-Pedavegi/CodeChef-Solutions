# VBHXB22

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Simulate File Processing with Error Handling

Let's practice how to handle errors in using different functions:

### Task:
- Complete the code to handle errors using async/await.
- Complete the code to handle errors using.then()/.catch().
- Complete the code to handle errors using callback function and print the result or error in the given way:

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T07:42:57.005Z  

```cpp
                                                                                                          const success = Math.random() > 0.5;

                                                                                                              if (success) {
                                                                                                                    callback(null, `File "${fileName}" processed successfully.`);
                                                                                                                        } else {
                                                                                                                              callback(`Error: Failed to process file "${fileName}".`, null);
                                                                                                                                  }
                                                                                                                                    }, 100);
                                                                                                                                    }

                                                                                                                                    function processFileCallback(fileName) {
                                                                                                                                      processFileWithCallback(fileName, (err, result) => {
                                                                                                                                          if (err) {
                                                                                                                                                console.error("Callback Error:", err);
                                                                                                                                                    } else {
                                                                                                                                                          console.log("Callback:", result);
                                                                                                                                                              }
                                                                                                                                                                });
                                                                                                                                                                }

                                                                                                                                                                // Example usage
                                                                                                                                                                processFileAsync("document.pdf");
                                                                                                                                                                processFilePromise("report.txt");
                                                                                                                                                                processFileCallback("image.png");
```

---

[View on CodeChef](https://www.codechef.com/problems/VBHXB22)