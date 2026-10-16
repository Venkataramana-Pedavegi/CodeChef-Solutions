import { Routes, Route } from "react-router-dom";
import Home from "./Home";
import Dashboard from "./Dashboard";
import Profile from "./Profile";
import Settings from "./Settings";

function App() {
  return (
      <Routes>
            {/* Root Home route */}
                  <Route path="/" element={<Home />} />

                        {/* Parent Dashboard route */}
                              <Route path="/dashboard" element={<Dashboard />}>
                                      {/* Nested child routes */}
                                              <Route path="profile" element={<Profile />} />
                                                      <Route path="settings" element={<Settings />} />
                                                            </Route>
                                                                </Routes>
                                                                  );
                                                                  }

                                                                  export default App;