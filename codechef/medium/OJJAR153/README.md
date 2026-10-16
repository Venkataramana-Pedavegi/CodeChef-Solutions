# OJJAR153

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task Statement

 **Problem:** 
We have a parent component (**`ParentComponent`**) that updates a counter. However, every time the counter changes, it causes the child component (**`ExpensiveOperationChild`**) to re-render unnecessarily, even though the child's props never change. This child component simulates a heavy computation (like processing a large list) with a loop, making unnecessary re-renders costly.

 **Your task**  is to optimize this using  **`React.memo`**  so that the child component only re-renders when its props actually change.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T05:10:36.084Z  

```cpp
                return (
                    <div className="child-container">
                          Heavy Calculation Result: {sum} (Data: {data})
                              </div>
                                );
                                });

                                // Parent Component
                                function ParentComponent() {
                                  const [count, setCount] = useState(0);
                                    return (
                                        <div className="parent-container">
                                              <button 
                                                      className="counter-button"
                                                              onClick={() => setCount(c => c + 1)}
                                                                    >
                                                                            Click to Increment: {count}
                                                                                  </button>
              console.log('Child rendered!');
          sum += i;
            }
    let sum = 0;
      for (let i = 0; i < 1000000; i++) {
// Child Component optimized with React.memo
const ExpensiveOperationChild = memo(function ExpensiveOperationChild({ data }) {
  // Heavy computation simulation
import './App.css';

import { useState, memo } from 'react';
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR153)