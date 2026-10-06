export function WelcomeMessage({ isLoggedIn, isPremiumUser }) {
    return (
        <>
              <h1>My React App</h1>
                    {isLoggedIn && isPremiumUser ? (
                            <p>Welcome to Premium Content! 🎉</p>
                                  ) : (
                                          <p>Please log in and upgrade to premium...</p>
                                                )}
                                                    </>
                                                      );
                                                      }

                                                      export default function App() {
                                                        const isLoggedIn = true;  // Change these values to test
                                                          const isPremiumUser = false;   // Change these values to test

                                                            return (
                                                                <WelcomeMessage isLoggedIn={isLoggedIn} isPremiumUser={isPremiumUser} />
                                                                  );
                                                                  }

