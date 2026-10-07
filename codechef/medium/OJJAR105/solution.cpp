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