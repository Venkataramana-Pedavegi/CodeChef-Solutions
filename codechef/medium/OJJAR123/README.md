# OJJAR123

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementing Tab Navigation

Based on our decisions, we'll now make the "Previous" and "Next" buttons actually switch between the tabs in the form.

 **Recap of Decisions:** 

- The state controlling the active tab (activeTabIndex) will live in the App component.
- App will define functions (handleNext, handlePrevious) to update this state.
- These functions will be passed down as props (onNext, onPrevious) to the Tabs component.
- The Tabs component will call these functions when the buttons are clicked and use the activeTabIndex prop to determine which tab content to show and when to disable the buttons.

 **Your Task:** 

- Manage Active Tab State in App.js: Import useState from react. Inside the App component, create a state variable called activeTabIndex and its setter function (e.g., setActiveTabIndex) using useState. Initialize the state to 0. Define a constant totalTabs (set it to 3 for now) within App for easy reference.
- Create Navigation Handler Functions in App.js: Create an arrow function named handleNext. Inside this function: Use setActiveTabIndex to update the state. Calculate the new index by taking the previous index (prevIndex) and adding 1. Use Math.min() to ensure the new index doesn't exceed totalTabs - 1. Create an arrow function named handlePrevious. Inside this function: Use setActiveTabIndex to update the state. Calculate the new index by taking the previous index (prevIndex) and subtracting 1. Use Math.max() to ensure the new index doesn't go below 0.
- Pass State and Handlers to Tabs: Modify the <Tabs /> component rendering within App.js: Pass the handleNext function as a prop named onNext. Pass the handlePrevious function as a prop named onPrevious.
- Update Tabs.js to Use Props: Modify the Tabs function signature to accept the new props: { activeTabIndex, onPrevious, onNext }. Inside the Tabs component, define totalTabs = 3. Calculate boolean constants isFirstTab (activeTabIndex === 0) and isLastTab (activeTabIndex === totalTabs - 1). Ensure all conditional logic (for header active class and tab-content display) now uses the activeTabIndex prop instead of currentActiveTab.
- Connect Buttons in Tabs.js: Find the "Previous" button in the tab-navigation section. Add an onClick attribute and set it to the onPrevious prop. Add a disabled attribute and set it to the isFirstTab constant. Find the "Next" button. Add an onClick attribute and set it to the onNext prop. Add a disabled attribute and set it to the isLastTab constant.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T15:31:18.501Z  

```cpp
import { useState } from 'react';
import Tabs from './Tabs';
import './App.css';

function App() {
  const [activeTabIndex, setActiveTabIndex] = useState(0);
    const totalTabs = 3;

      const handleNext = () => {
          setActiveTabIndex((prevIndex) => Math.min(prevIndex + 1, totalTabs - 1));
            };

              const handlePrevious = () => {
                  setActiveTabIndex((prevIndex) => Math.max(prevIndex - 1, 0));
                    };

                      return (
                          <div className="App">
                                <h1>Job Application Form</h1>
                                      <Tabs 
                                              activeTabIndex={activeTabIndex} 
                                                      onNext={handleNext} 
                                                              onPrevious={handlePrevious} 
                                                                    />
                                                                        </div>
                                                                          );
                                                                          }

                                                                          export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR123)