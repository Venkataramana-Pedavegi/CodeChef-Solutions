# OJJAR227

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Countdown Begins!

You're provided with a partially implemented `CountdownTimer` component. Your task is to complete the countdown logic using  **React hooks**  so that the timer behaves correctly when users interact with it.

This challenge is perfect for reinforcing your understanding of:

- useState for managing state
- useEffect for side effects and intervals
- Controlled user interaction (start, pause, reset)

 **Your Tasks** 

Complete the `CountdownTimer` component so that it:

- Starts counting down every second when isRunning is true.
- Pauses the countdown when isRunning becomes false.
- Stops automatically at 0 seconds, and sets isRunning to false.
- Cleans up the interval when the component is unmounted or paused to avoid memory leaks.

 **Example** 

 **Learning Resources** 

- React Docs – useEffect https://reactjs.org/docs/hooks-effect.html
- React Docs – useState https://reactjs.org/docs/hooks-state.html
- MDN – setInterval() https://developer.mozilla.org/en-US/docs/Web/API/setInterval

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T07:31:57.153Z  

```cpp
                                                                                                      });
                                                                                                            }, 1000);
                                                                                                                }

                                                                                                                    return () => clearInterval(timer);
                                                                                                                      }, [isRunning]);

                                                                                                                        return (
                                                                                                                            <div className="timer">
                                                                                                                                  <h2>Time Left: {timeLeft}s</h2>
                                                                                                                                        <TimerControls 
                                                                                                                                                isRunning={isRunning}
                                                                                                                                                        onStart={() => setIsRunning(true)}
                                                                                                                                                                onPause={() => setIsRunning(false)}
                                                                                                                                                                        onReset={() => {
                                                                                                                                                                                  setIsRunning(false);
                                                                                                                                                                                            setTimeLeft(10);
                                                                                                                                                                                                    }}
                                                                                                                                                                                                          />
                                                                                                                                                                                                              </div>
                                                                                                                                                                                                                );
                                                                                                                                                                                                                }

                                                                                                                                                                                                                export default CountdownTimer;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR227)