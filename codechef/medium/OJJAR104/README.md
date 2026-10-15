# OJJAR104

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Interacting with the DOM element

Now we learn how to interact with DOM elements and handle side effects in React using  **`useRef`**  and  **`useEffect`**.

#### 1. Auto-Focusing Inputs

 **Problem:** 
We want an input field to automatically receive focus when a component loads.

 **Solution:** 

- useRef Hook: Create a reference to access DOM elements
- useEffect Hook: Trigger actions after component renders

```
function SearchForm() {
  const inputRef = useRef(null);

  useEffect(() => {
    inputRef.current.focus();
  }, []); // Empty array = run once after initial render

  return <input ref={inputRef} />;
}

```

 **Why Not HTML autofocus?** 
React components often render dynamically after initial page load. The  **`autofocus`**  attribute only works on initial page load, making it unreliable in React apps.

#### 2. Tracking Mouse Position

 **Problem** :
We want to track cursor position anywhere on the screen.

 **Solution:** 

- Add global event listener when component mounts

```
function MouseTracker() {
  const [position, setPosition] = useState({ x: 0, y: 0 });

  useEffect(() => {
    const handleMove = (e) => {
      setPosition({ x: e.clientX, y: e.clientY });
    };

    window.addEventListener('mousemove', handleMove);
  }, []);

  return <div>Cursor at ({position.x}, {position.y})</div>;
}

```

#### Key Takeaways
- useRef Gives direct access to DOM elements Create with const ref = useRef(null) Assign to elements with ref={ref}
- useEffect Handles side effects (DOM interactions, API calls, subscriptions) Runs after render Cleanup function prevents memory leaks Empty dependency array [] = run once
- Event Listeners Always clean up global listeners Use state updater in event handlers

Now, just try writing the code, modifying it, and Check on browser how it works.

If you understand this, submit it to continue learning and move on to the next problem.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T04:30:31.332Z  

```cpp
                                            <h1>Count: {count}</h1>
                                      <div className="container">
                                  return (
                                }, [count]); // Add count as a dependency

                          document.body.style.backgroundColor = "";
                              }
                    } else {
      useEffect(() => {
          if (count >= 5) {
                document.body.style.backgroundColor = "lightblue";
  const [count, setCount] = useState(0);

    // Add useEffect to detect changes in the count state
function BackgroundChanger() {

import { useState, useEffect } from "react";
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR104)