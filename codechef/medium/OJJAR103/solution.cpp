
function BackgroundChanger() {
  const [count, setCount] = useState(0);

    // Add useEffect to detect changes in the count state
      useEffect(() => {
          if (count >= 5) {
                document.body.style.backgroundColor = "lightblue";
                    } else {
                          document.body.style.backgroundColor = "";
                              }
                                }, [count]); // Add count as a dependency

                                  return (
                                      <div className="container">
                                            <h1>Count: {count}</h1>
                                                  <button className="btn" onClick={() => setCount(count + 1)}>Increase Count</button>
                                                        <button className="btn reset-btn" onClick={() => setCount(0)}>Reset</button>
                                                            </div>
                                                              );
                                                              }

                                                              export default BackgroundChanger;
import './App.css';
import { useState, useEffect } from "react";