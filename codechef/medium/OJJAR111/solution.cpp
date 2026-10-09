                                    return () => {
                                          clearTimeout(timeoutId);
                                                window.removeEventListener("resize", handleResize);
                                                    };
                                                      }, [delay]);

                                                        return width;
                                                        };


                                                        const ResponsiveComponent = () => {
                                                          const width = useWindowWidth();

                                                            return (
                                                                <div style={{ padding: "20px", textAlign: "center" }}>
                                                                      <h2>Current Window Width:</h2>
                                                                            <p style={{ fontSize: "24px", fontWeight: "bold", color: "blue" }}>
                                                                                    {width}px
                                                                                          </p>
                                                                                              </div>
                                                                                                );
                                                                                                };

                                                                                                export default ResponsiveComponent;
                                                                                                