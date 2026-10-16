import React from 'react';
import './App.css';

function CustomInput({ label, id, type, value, required, maxLength, onChange, placeholder }) {
  const generatedId = React.useId();
    const finalId = id || generatedId;

      return (
          <div className="custom-input">
                <label htmlFor={finalId}>{label}</label>
                      <input
                              id={finalId}
                                      type={type}
                                              value={value}
                                                      required={required}
                                                              maxLength={maxLength}
                                                                      onChange={onChange}
                                                                              placeholder={placeholder}
                                                                                    />
                                                                                        </div>
                                                                                          );
                                                                                          }

                                                                                          export default CustomInput;