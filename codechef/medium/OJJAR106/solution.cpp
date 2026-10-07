    useEffect(() => {
        const timerID = setInterval(() => {
              setCount(c => c + 1);
                  }, 1000);
                    
                        // Cleanup function
                            return () => {
                                  clearInterval(timerID);     
                                      };
                                        }, []);
                                          

                                            return <h2>Count: {count}</h2>;
                                            }

                                            export default function App() {
                                              const [showTimer, setShowTimer] = useState(true);

                                                return (
                                                    <div>
                                                          <button onClick={() => setShowTimer(!showTimer)}>
                                                                  Toggle Timer
                                                                        </button>
                                                                              {showTimer && <Timer />}
                                                                                  </div>
                                                                                    );
                                                                                    }
                                                                                    