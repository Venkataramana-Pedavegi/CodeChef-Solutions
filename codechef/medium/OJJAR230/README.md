# OJJAR230

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tab Switch

In this task, you'll build a  **Switch Tab Interface**  using React. Tabs are a common UI pattern used to organize content into different sections on the same page.

You are given the basic setup of a React project with 3 tabs:

- Frontend
- Backend
- Full Stack

Your goal is to complete the functionality so that:

- Clicking on a tab should make it active.
- The content below the tabs should update based on the active tab.
- The active tab should appear highlighted to indicate selection.

 **Files Provided** 

- App.js
- Tab.js

Some parts of the code are marked with `// TODO:` comments. You need to complete these parts to make the tab switcher work correctly.

 **What You Need to Do** 

- Use React’s useState hook to keep track of the active tab.
- Render the appropriate content based on the active tab.
- Highlight the selected tab to show which tab is active.
- Update the active tab when a different tab is clicked.

 **Expected Behavior** 

 **Helpful Resources** 

Here are some beginner-friendly links to help you solve this challenge:

- 🔗 Codechef React course
- 🔗 React Docs: useState
- 🔗 React Docs: Handling Events
- 🔗 React Docs: Conditional Rendering
- 🔗 React Props Explained

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-20T06:38:34.782Z  

```cpp
                padding: '10px 20px',
                cursor: 'pointer',
                backgroundColor: isActive ? '#333' : '#eee',
                color: isActive ? '#fff' : '#000',
                border: 'none',
                borderRadius: '5px',
                fontWeight: isActive ? 'bold' : 'normal',
                }}
                >
                {label}
                </button>
                );
                };

                export default Tab;




```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR230)