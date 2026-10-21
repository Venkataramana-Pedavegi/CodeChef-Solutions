# PREACT057

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Cleanup in React
#### Task: Window Size Tracker

Create a component that displays and updates the window size when the user resizes the browser. Follow these steps:

- Display Initial Size: Show the current window width and height when the component loads.
- Update on Resize: Automatically update the displayed size when the window is resized.

A toggle button is provided to show/hide your component. (Write code in the  **`WindowTracker`**  component where indicated)

 **Hint:**  Use  **`window.addEventListener('resize',...)`** .

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-21T03:00:57.791Z  

```cpp
                                                                window.removeEventListener('resize', handleResize);
                                                                    };
                                                                      }, []);

                                                                        return (
                                                                            <div>
                                                                                  <p>Window Width: {windowSize.width}px</p>
                                                                                        <p>Window Height: {windowSize.height}px</p>
                                                                                            </div>
                                                                                              );
                                                                                              }

                                                                                              export default function App() {
                                                                                                const [show, setShow] = useState(true);

                                                                                                  return (
                                                                                                      <div>
                                                                                                            <button onClick={() => setShow((prev) => !prev)}>
                                                                                                                    Toggle Window Tracker
                                                                                                                          </button>
                                                                                                                                {show && <WindowTracker />}
                                                                                                                                    </div>
                                                                                                                                      );
                                                                                                                                      }
```

---

[View on CodeChef](https://www.codechef.com/problems/PREACT057)