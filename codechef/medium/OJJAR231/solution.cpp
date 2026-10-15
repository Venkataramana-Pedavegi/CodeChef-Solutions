                                                                                                  );
                                                                                                </ThemeProvider>
                                                                                            <MainContent />
                                                                                <ThemeProvider>
                                                                                      <Header />
                                                                            return (

                                                                          export default function App() {
                                                                          }
                                                                          );
                                                                        </div>
                                                                    <p>This content changes dynamically based on the active theme context.</p>
                                                              <h2>Current Theme: {theme.toUpperCase()}</h2>
                                                        >
                                                    }}
                                              padding: "20px",
                                      color: theme === "light" ? "#333333" : "#f9f9f9",
import React from "react";
import { ThemeProvider, useTheme } from "./ThemeContext";
import Header from "./Header";

function MainContent() {
  const { theme } = useTheme();

    return (
        <div
              style={{
                      minHeight: "80vh",
                              backgroundColor: theme === "light" ? "#f9f9f9" : "#1a1a1a",