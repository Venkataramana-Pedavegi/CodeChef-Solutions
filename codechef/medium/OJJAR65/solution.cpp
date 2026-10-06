                                                                                fontSize: "20px"
                                                                                    };

                                                                                        return (
                                                                                                <div style={cardStyle}>
                                                                                                            {/* Greeting message */}
                                                                                                                        <h2 style={headingStyle}>{greeting}</h2>

                                                                                                                                    {/* Displaying dynamic values */}
                                                                                                                                                <p>Hello, my name is {name}.</p>
                                                                                                                                                            <p>I am {age} years old.</p>

                                                                                                                                                                        {/* Expression slot example - current year */}
                                                                                                                                                                                    <p>Year: {new Date().getFullYear()}</p>

                                                                                                                                                                                                <p>Enjoy your day! 🎉</p>
                                                                                                                                                                                                        </div>
                                                                                                                                                                                                            );
                                                                                                                                                                                                            }

                                                                                                                                                                                                            // App component: Using multiple instances of GreetingCard with different values
                                                                                                                                                                                                            export function App() {
                                                                                                                                                                                                                return (
                                                                                                                                                                                                                        <GreetingCard name="Alice" age={30} greeting="Happy Birthday, Alice!" />
                                                                                                                                                                                                                            );
                                                                                                                                                                                                                            }

                                                                                                                                                                                                                            export default App;