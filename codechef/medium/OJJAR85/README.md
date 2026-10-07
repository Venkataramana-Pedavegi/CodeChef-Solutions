# OJJAR85

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Forms in React

 **Your goal** : Complete this React component to create a live typing display that also responds to button clicks. When finished:

- Whatever users type should instantly appear in both the input field AND the display below
- Clicking the button should update BOTH the input field and displayed text with random characters

Certainly! Let's simplify it:

### Steps to Create a Live Typing Display in React
- Setup State Use useState to create a value variable and setValue function. Start value as an empty string ("").
- Input Field Add value={value} to the <input> to show the current value. Use onChange={(e) => setValue(e.target.value)} to update value as you type. Add a placeholder like "Type something...".
- Random Text Generator Complete the generateRandomString function with: const randomStr = Math.random().toString(36).substring(2, 8); Then use setValue(randomStr) to update both the input and display
- Display Value Use <p>Live Display: {value}</p> inside a div to show the current text.
- Button Add onClick={generateRandomString} to the button. Label the button "Generate Random String".

Now you have a component that displays what you type and can generate random text with a click!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-07T05:40:40.595Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR85)