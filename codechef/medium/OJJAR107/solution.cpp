
function LightSwitch() {
  const [isOn, setIsOn] = useState(false);

    useEffect(() => {
        const handleKeyPress = (e) => {
              if (e.code === 'KeyL') {
                      // Use functional update to avoid stale values
                              setIsOn((current) => !current);
                                    }
                                        };

                                            window.addEventListener('keydown', handleKeyPress);
                                                return () => window.removeEventListener('keydown', handleKeyPress);
                                                  }, []); // Empty dependency array is fine now

                                                    return (
                                                        <div>
                                                              <button onClick={() => setIsOn(!isOn)}>
                                                                      Toggle Light (Button)
                                                                            </button>
                                                                                  <p>Light is {isOn ? "ON 🌟" : "OFF 🌑"}</p>
                                                                                        <small>Press "L" key to toggle!</small>
                                                                                            </div>
                                                                                              );
                                                                                              }

                                                                                              export default LightSwitch;