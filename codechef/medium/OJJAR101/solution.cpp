                              return (
                                  <div className="container">
                                        <input
                                                ref={inputRef} // Attach ref
                                                        type="text"
                                                                className={`input-field ${isFocused ? 'input-focused' : ''}`}
                                                                        placeholder="Click buttons to focus/blur"
                                                                              />
                                                                                    
                                                                                          <div className="button-group">
                                                                                                  <button className="action-button" onClick={handleFocus}>
                                                                                                            Focus Input
                                                                                                                    </button>

                          setIsFocused(false);
                            };
                      inputRef.current.blur(); // DOM manipulation
                  const handleBlur = () => {

                };
              setIsFocused(true);
          inputRef.current.focus(); // DOM manipulation
      const handleFocus = () => {
    const inputRef = useRef(null); // Create ref

function FocusManager() {
  const [isFocused, setIsFocused] = useState(false);
import './App.css';

import { useState, useRef } from 'react';