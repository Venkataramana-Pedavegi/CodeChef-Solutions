# OJJAR141

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Nested Routing- Practice Problem

You are building a small  **Dashboard App**. The app has:

- A Home page at /
- A Dashboard at /dashboard with two nested child routes: /dashboard/profile → Profile /dashboard/settings → Settings

Some parts are missing. Fill in the blanks (`___`) to complete the setup.

 **Expected Behavior** 

- / → Shows Home page
- /dashboard → Shows Dashboard layout, but no child yet
- /dashboard/profile → Shows Dashboard layout + Profile content
- /dashboard/settings → Shows Dashboard layout + Settings content

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T04:51:42.384Z  

```cpp
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
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR141)