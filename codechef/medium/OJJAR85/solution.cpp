                const randomStr = Math.random().toString(36).substring(2, 8);
                    // Update the state variable 'value' with the random string
                        setValue(randomStr);
                          };

                            return (
                                <div className="container">
                                      <h2>useState Form Value Demo</h2>
                                            {/* Update the input field bound to the state variable 'value' */}
                                                  <input
                                                          type="text"
                                                                  value={value}
                                                                          // Update the state when the input changes
                                                                                  onChange={(e) => setValue(e.target.value)}
                                                                                          placeholder="Type something..."
                                                                                                  className="input-field"
                                                                                                        />
                                                                                                              {/* Update Display the live value from the state */}
                                                                                                                    <div className="output-box">
                                                                                                                            <p>Live Display: {value}</p>
                                                                                                                                  </div>
                                                                                                                                        {/* Update the Button to generate a random string */}
                                                                                                                                              <button onClick={generateRandomString}>
                                                                                                                                                      Generate Random String
                                                                                                                                                            </button>
                                                                                                                                                                </div>
                                                                                                                                                                  );
                                                                                                                                                                  }