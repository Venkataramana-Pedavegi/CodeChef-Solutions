# OJJAR105

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
**Submitted:** 2026-10-07T06:43:07.320Z  

```cpp
                                        height: window.innerHeight
                                              });
                                                  }

                                                      window.addEventListener('resize', handleResize);
                                                          
                                                            }, []);

                                                              return (
                                                                  <div>
                                                                        <p>Window Width: {windowSize.width}px</p>
                                                                              <p>Window Height: {windowSize.height}px</p>
                                                                                  </div>
                                                                                    );
                                                                                    }

                                                                                    export default function App() {
                                                                                      const [showTracker, setShowTracker] = useState(true);

                                                                                        return (
                                                                                            <div>
                                                                                                  <button onClick={() => setShowTracker(!showTracker)}>
                                                                                                          Toggle Window Tracker
                                                                                                                </button>
                                                                                                                      {showTracker && <WindowTracker />}
                                                                                                                          </div>
                                                                                                                            );
                                                                                                                            }
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR105)