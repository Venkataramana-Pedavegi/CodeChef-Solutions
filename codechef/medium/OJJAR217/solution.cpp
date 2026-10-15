                                                      }
                                                        // --- Your Code Ends Here ---
                                                        }

                                                        // 3. The Counter Component
                                                        function Counter() {
                                                          const [state, dispatch] = useReducer(reducer, initialState);

                                                            return (
                                                                <div className="counter">
                                                                      <h2>Counter</h2>
                                                                            <p className="count-display">Count: {state.count}</p>
                                                                                  <div className="button-group">
                                                                                          <button onClick={() => dispatch({ type: 'DECREMENT' })}>-</button>
                                                                                                  <button onClick={() => dispatch({ type: 'RESET' })}>Reset</button>
                                                                                                          <button onClick={() => dispatch({ type: 'INCREMENT' })}>+</button>
                                                                                                                </div>
                                                                                                                    </div>
                                                                                                                      );
                                                                                                                      }

                                                                                                                      export default function App() {
                                                                                                                        return <Counter />;
                                                                                                                        }