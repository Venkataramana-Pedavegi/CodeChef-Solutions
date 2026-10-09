# OJJAR101

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Refs in React

Create a component with an input field and two buttons. One button should focus the input using  **`useRef`**, and the other should blur it. Demonstrate how DOM manipulation works without re-renders!

#### Step-by-Step Instructions
- Import useRef Import useRef along with useState like this { useState, useRef }
- Create Ref Use useRef to make an input reference
- Connect Ref to Input Add ref={yourRef} to the input element
- Implement Button Actions Focus: yourRef.current.focus() Blur: yourRef.current.blur()

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-09T16:12:30.216Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR101)