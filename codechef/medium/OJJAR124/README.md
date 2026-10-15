# OJJAR124

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementing Direct Tab Navigation via Headers

Allow users to directly jump to a specific tab ("Personal Info", "Experience", "Review") by clicking on its corresponding header button.

 **Current Situation:**  You have functional "Previous" and "Next" buttons. The `App` component manages the `activeTabIndex` state and passes it down, along with `onNext` and `onPrevious` handlers, to the `Tabs` component. The tab headers visually indicate the active tab but are not clickable.

 **Your Task:** 

- Create a Tab Click Handler in App.js: Inside the App component, define a new function called handleTabClick. This function should accept one argument: the index of the tab that was clicked. Inside handleTabClick, use the setActiveTabIndex function (from your useState hook) to directly set the active tab index to the index received as an argument.
- Pass the Handler to Tabs: In the App.js return statement, find where you render the <Tabs /> component. Add a new prop called onTabClick and pass the handleTabClick function you just created as its value.
- Update Tabs.js to Receive and Use the Handler: Modify the Tabs function signature to accept the new onTabClick prop, alongside the existing props (activeTabIndex, onPrevious, onNext). Locate the <button> elements for the tab headers ("Personal Info", "Experience", "Review") within the tab-headers div. For each header button: Add an onClick attribute. Set the value of the onClick attribute to an arrow function that calls the onTabClick prop function, passing the correct index for that specific tab. For "Personal Info", call onTabClick(0). For "Experience", call onTabClick(1). For "Review", call onTabClick(2).

 **Why an Arrow Function in `onClick`?**  We use `() => onTabClick(index)` instead of just `onTabClick(index)` directly in the `onClick`. If we did the latter, the `onTabClick` function would be  *called immediately*  when the component renders, not when the button is clicked. The arrow function ensures `onTabClick` is only called  *when*  the click event happens.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T15:42:00.099Z  

```cpp
                                                                                                                                                        </div>

                                                                                                                                                              <div className="navigation-buttons">
                                                                                                                                                                      <button
                                                                                                                                                                                disabled={activeTabIndex === 0}
                                                                                                                                                                                          onClick={onPrevious}
                                                                                                                                                                                                  >
                                                                                                                                                                                                            Previous
                                                                                                                                                                                                                    </button>
                                                                                                                                                                                                                            <button
                                                                                                                                                                                                                                      disabled={activeTabIndex === totalTabs - 1}
                                                                                                                                                                                                                                                onClick={onNext}
                                                                                                                                                                                                                                                        >
                                                                                                                                                                                                                                                                  Next
                                                                                                                                                                                                                                                                          </button>
                                                                                                                                                                                                                                                                                </div>
                                                                                                                                                                                                                                                                                    </div>
                                                                                                                                                                                                                                                                                      );
                                                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                                      export default Tabs;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR124)