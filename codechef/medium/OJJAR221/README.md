# OJJAR221

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Portal-Based Toast Notification

Understand how and why to use React Portals to render UI elements outside their parent component's DOM hierarchy.

 **Task Statement** 

You are given a simple feedback form. Currently, when you submit the form, nothing happens visually besides a console log.

Your task is to:

- Identify the Portal Target: In public/index.html, notice the <div id="toast-root"></div>. This is where we want our toast notifications to appear in the final HTML, separate from the main application in <div id="root">.
- Modify the Toast Component (src/Toast.js): Import createPortal from react-dom. (Look here: // TASK 1:...) Get a reference to the <div id="toast-root"> DOM element. (Look here: // TASK 2:...) Modify the Toast component's return statement to use createPortal. You need to wrap the existing JSX (or the JSX you create for the toast) inside createPortal, telling it to render into the #toast-root element you found. (Look here: // TASK 3:...)
- Style the Toast: Add CSS rules in src/index.css to make the div with the class toast-notification (which you'll use inside Toast.js) look like a toast (e.g., fixed position at the bottom-right, background color, padding). (Look near: / *--- TASK 4: Add Toast Styles Below ---* /)
- Observe: After implementing the portal and CSS, submit the form. The toast should appear floating in the bottom-right corner, even though the <Toast> component is rendered conditionally within the App component in your React code. Inspect the browser's Elements panel to see the toast's HTML inside <div id="toast-root">.

 **Why Portals Here?**  Imagine the main `#root` container had some weird `transform` or `z-index` CSS applied. A normally positioned toast  *inside*  `#root` might get clipped or hidden unexpectedly. By porting the toast to `#toast-root` (a direct child of `<body>`), we ensure it renders in its own stacking context, avoiding potential CSS conflicts with the main app structure.

 **Your App should be look like this at the end**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T07:05:43.864Z  

```cpp
import { createPortal } from 'react-dom';

// TASK 2: Get the DOM element with the ID 'toast-root'
const toastRootElement = document.getElementById('toast-root');

function Toast({ message, onClose }) {

  // Basic structure for the toast's content
  const toastContent = (
    <div className="toast-notification">
      <span>{message}</span>
      {/* Optional close button */}
       <button onClick={onClose} className="toast-close-button" aria-label="Close toast">
         ×
       </button>
    </div>
  );

  // TASK 3: Use createPortal to render `toastContent` into the `toastRootElement`
  // Handle the case where toastRootElement might not be found (e.g., during SSR or testing)
  if (!toastRootElement) {
    console.error("Toast root element '#toast-root' not found.");
    return null; // Don't render anything if the target doesn't exist
  }

  // Use the portal!
  return createPortal(toastContent, toastRootElement);

}
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR221)