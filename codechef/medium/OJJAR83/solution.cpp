                                                                                                                      <div className={styles.controls}>
                                                                                                                </div>
                                        } else {
                                              // Convert Fahrenheit to Celsius: (F - 32) * 5/9
                                                    setTemperature((prev) => ((prev - 32) * 5) / 9);
                                                          setUnit("C");
                                                              }
                                                                };

                                                                  return (
                                                                      <div className={styles.wrapper}>
                                                                            <h1>Temperature Converter</h1>
                                                                                  <div className={styles.display}>
                                                                                          {/* Display the current temperature with the appropriate unit */}
                                                                                                  {temperature.toFixed(2)}
                                                                                                          <span>°{unit}</span>
                        // Convert Celsius to Fahrenheit: (C * 9/5) + 32
                              setTemperature((prev) => (prev * 9) / 5 + 32);
                                    setUnit("F");
                  if (unit === "C") {
          const [unit, setUnit] = useState("C");

            // Function to convert temperature between Celsius and Fahrenheit
              const convertTemperature = () => {
      
        // State to track the current unit ("C" or "F")
  // State to store the current temperature value
    const [temperature, setTemperature] = useState(defaultTemperature);
import styles from "./App.module.css";

export function Temperature({ defaultTemperature = 0 }) {

import { useState } from "react";