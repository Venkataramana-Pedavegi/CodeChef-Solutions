# OJJAR65

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Props in React

We have already created a greeting card in the last lesson! Now, we will use  **components and props**  to make the solution more efficient and reusable.

#### Your Task:
- Create a reusable component <GreetingCard /> that takes name, age, and greeting as props.
- Use instances of <GreetingCard /> inside the App component with values for name, age, and greeting.
- Make sure not change the messages.

 **Note - Make sure to take the** `styles` **and** `jsx` **from the App component.** 
Once you're done, submit your solution and check it's correct not.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T09:34:01.104Z  

```cpp
                                                                                fontSize: "20px"
                                                                                    };

                                                                                        return (
                                                                                                <div style={cardStyle}>
                                                                                                            {/* Greeting message */}
                                                                                                                        <h2 style={headingStyle}>{greeting}</h2>

                                                                                                                                    {/* Displaying dynamic values */}
                                                                                                                                                <p>Hello, my name is {name}.</p>
                                                                                                                                                            <p>I am {age} years old.</p>

                                                                                                                                                                        {/* Expression slot example - current year */}
                                                                                                                                                                                    <p>Year: {new Date().getFullYear()}</p>

                                                                                                                                                                                                <p>Enjoy your day! 🎉</p>
                                                                                                                                                                                                        </div>
                                                                                                                                                                                                            );
                                                                                                                                                                                                            }

                                                                                                                                                                                                            // App component: Using multiple instances of GreetingCard with different values
                                                                                                                                                                                                            export function App() {
                                                                                                                                                                                                                return (
                                                                                                                                                                                                                        <GreetingCard name="Alice" age={30} greeting="Happy Birthday, Alice!" />
                                                                                                                                                                                                                            );
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                            export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR65)