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