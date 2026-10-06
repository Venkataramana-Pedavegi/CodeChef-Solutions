# OJJAR67

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Task

In this task, you will create a  **Profile Card**  component using React. This will involve  **JSX, React components, props, and basic CSS styling**.

#### 1. Create a ProfileCard Component
- This component should receive the following props: name → The person’s name bio → A short description about the person avatarUrl → URL of the person's profile image
- Inside the component, display these props properly using JSX.
#### 2. Use the ProfileCard Component inside App.js
- Inside the App component, render the ProfileCard component.
- Pass appropriate values for name, bio, and avatarUrl (make sure name, bio, avatarUrl not be null).

your final project should be like this

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T09:40:19.307Z  

```cpp
                                                                                                                      <h1 style={{ textAlign: "center", fontFamily: "Arial, sans-serif" }}>
                                                                                                                              Profile Card
                                                                                                                                    </h1>

                                                                                                                                          <ProfileCard
                                                                                                                                                  name = {name}
                                                                                                                                                          bio = {bio}
                                                                                                                                                                  avatarUrl={avatarUrl}
                                                                                                                                                                        />
                                                                                                                                                                            </div>
                                                                                                                                                                              );
                                                                                                                                                                              };

                                                                                                                                                                              export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR67)