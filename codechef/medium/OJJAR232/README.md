# OJJAR232

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Improve your aim
- In this game, colored circles appear randomly on the screen every second. Your goal is to click on them to increase your score before they disappear. The game ends after a fixed time.
- Your task is to complete the given React project using useState, useEffect, and useRef.

 **Functionality** 

- Circles appear in random locations every second.
- Each circle disappears automatically after 1 second.
- Clicking a circle increases your score by 1.
- A countdown timer shows how much time is left.
- After time runs out, the game stops and shows the final score.

 **TODOs in Code** 

- Initialize the following state variables using useState: circles: an array of circle objects score: number, initial value 0 timeLeft: number, initial value (10)
- Create a useRef hook to store the circle generation interval ID.
- Implement the handleCircleClick(id) function: Use setScore to increase the score. Use setCircles to remove the clicked circle by filtering it out.
- Inside the first useEffect, set up a timer using setInterval to generate one random circle every second. Store the interval ID in intervalRef.current. Clear the interval on cleanup.
- Provide the correct dependency array for the above useEffect (should rerun when timeLeft changes).
- Inside the second useEffect, implement a countdown timer using setInterval that decreases timeLeft by 1 every second. Stop the timer when time reaches 0. Clear the interval on cleanup.

 **What’s Provided** 

- Prebuilt Circle component for rendering.
- getRandomPosition() utility function for generating random coordinates.
- Game UI structure is already written for you.
- Styling is provided in App.css.

 **Output Example** 

 **Helpful Resources** 

- Codechef React course
- React useState Docs
- React useEffect Docs
- React useRef Docs
- setInterval – MDN
- Array.prototype.filter – MDN

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T07:52:12.994Z  

```cpp
                                                                                                                                                                                            <h2>Time Left: {timeLeft}s</h2>
                                                                                                                                                                                                  </div>

                                                                                                                                                                                                        <div className="play-area">
                                                                                                                                                                                                                {timeLeft > 0 &&
                                                                                                                                                                                                                          circles.map((pos, index) => (
                                                                                                                                                                                                                                      <Circle
                                                                                                                                                                                                                                                    key={index}
                                                                                                                                                                                                                                                                  x={pos.x}
                                                                                                                                                                                                                                                                                y={pos.y}
                                                                                                                                                                                                                                                                                              onClick={handleCircleClick}
                                                                                                                                                                                                                                                                                                          />
                                                                                                                                                                                                                                                                                                                    ))}
                                                                                                                                                                                                                                                                                                                          </div>

                                                                                                                                                                                                                                                                                                                                {/* Game over message */}
                                                                                                                                                                                                                                                                                                                                      {timeLeft === 0 && (
                                                                                                                                                                                                                                                                                                                                              <h2 className="end-msg">Game Over! Final Score: {score}</h2>
                                                                                                                                                                                                                                                                                                                                                    )}
                                                                                                                                                                                                                                                                                                                                                        </div>
                                                                                                                                                                                                                                                                                                                                                          );
                                                                                                                                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                                                                                                                                          export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR232)