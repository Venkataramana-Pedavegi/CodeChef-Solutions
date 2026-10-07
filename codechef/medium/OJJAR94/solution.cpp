    // 1. State is lifted here!
      const [sharedText, setSharedText] = useState('');

        // 2. Handler function lives in the parent
          const handleTextChange = (event) => {
              setSharedText(event.target.value); // Updates the parent's state
                };

                  return (
                      <div>
                            <h2>Type in either box:</h2>
                                  {/* 3. Pass state value AND handler function down as props */}
                                        <TextInput value={sharedText} onChange={handleTextChange} />
                                              <br />
                                                    <TextInput value={sharedText} onChange={handleTextChange} />
                                                          <p>Current Shared Text: {sharedText}</p>
                                                              </div>
                                                                );
                                                                }

                                                                export default App;
  function App() {
  }

  // Parent Component: Now holds the state and the logic to update it
  return <input value={value} onChange={onChange} />;
// It receives the value and the function to call when it changes.
function TextInput({ value, onChange }) {

// Child Component: Now "controlled" by the parent
import React, { useState } from 'react';