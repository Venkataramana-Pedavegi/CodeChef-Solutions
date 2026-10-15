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