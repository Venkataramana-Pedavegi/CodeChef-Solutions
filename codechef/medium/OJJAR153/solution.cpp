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