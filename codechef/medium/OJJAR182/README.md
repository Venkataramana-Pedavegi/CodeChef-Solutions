# OJJAR182

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create a React App with User Greeting Modal

Build an app that shows a welcome popup when a user logs in. The popup can be closed and reopened manually.

#### Step-by-Step Implementation
- Set Up User Context (File: context/UserContext.jsx) Purpose Share user data and modal state across components (completed).
- Fetch User Data (File: hooks/useFetchUser.js) Purpose: Simulate fetching user data (e.g., from an API) (completed).
- Build the Modal (File: components/Modal.jsx) Purpose: Display a welcome message with the user’s name (Need to update). What you need to do: Use useContext(UserContext) to access: - user (to display the name). - setIsModalOpen (to close the modal). Add a Close Button that sets isModalOpen to false when clicked.
- Update the Main App (File: App.jsx) Wrap the App: Use UserProvider in the main App component (Already done). InnerApp Component: Use useContext(UserContext) to access user, isModalOpen, and setIsModalOpen. Call useFetchUser() to trigger user data fetching. Conditional Rendering: - Show the Modal only if isModalOpen is true and user exists. - Add a "Show Welcome Again" button that sets isModalOpen to true when clicked (visible only when the modal is closed).

That's it! Try solving this challenge by implementing the remaining parts and running the app to test if the  **welcome popup**  behaves as expected. Make sure your code works correctly—if the popup closes and reopens with the right user info, you're good to go.
✅ Once it's working, go ahead and  **submit**  it!

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:15:38.518Z  

```cpp
import { useContext } from "react";
import { UserContext } from "../context/UserContext";

const Modal = ({ onClose }) => {
  // Access context values needed for this component
    const { user } = useContext(UserContext);

      return (
          <div className="modal-backdrop">
                <div className="modal">
                        {/* Display personalized welcome message */}
                                <h2>👋 Hello, {user?.name}</h2>
                                        <p>Welcome to the app. We're glad you're here!</p>
                                                
                                                        {/* Button to close modal by updating context state */}
                                                                <button className="modal-button" onClick={onClose}>
                                                                          Close
                                                                                  </button>
                                                                                        </div>
                                                                                            </div>
                                                                                              );
                                                                                              };

                                                                                              export default Modal;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR182)