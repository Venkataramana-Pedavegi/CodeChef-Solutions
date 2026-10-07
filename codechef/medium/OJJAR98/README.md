# OJJAR98

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Rules of Hooks
#### Task: Fix the Hook Usage

In our IDE you are given a component that violates the Rules of Hooks. Identify the mistake and correct the code.

Once done, submit your solution to verify correctness.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T06:20:32.452Z  

```cpp
                      setName(""); // Clear the input fields
                          setEmail("");
                            }

                              return (
                                  <form className="simple-form" onSubmit={handleSubmit}>
                                        <label htmlFor={`${uniqueId}-name`}>Name:</label>
                                              <input
                                                      type="text"
                                                              id={`${uniqueId}-name`}
                                                                      className="input-field"
                                                                              value={name}
                                                                                      onChange={(e) => setName(e.target.value)}
                                                                                            />

                                                                                                  <label htmlFor={`${uniqueId}-email`}>Email:</label>
                                                                                                        <input
                                                                                                                type="email"
                                                                                                                        id={`${uniqueId}-email`}
              event.preventDefault();
                  console.log("Submitted:", { name, email });
          function handleSubmit(event) {

      // Call useId at the top level of the component (outside of any conditional blocks)
        const uniqueId = useId();

    const [email, setEmail] = useState(initialEmail || "");
  const [name, setName] = useState(initialName || "");
export default function SimpleForm({ name: initialName, email: initialEmail }) {

// eslint-disable-next-line react/prop-types
import "./App.css";
import { useState, useId } from "react";
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR98)