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