# OJJAR89

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Complex State

 **Task: Implement State Update Functions in React** 

In this task, you'll practice updating state in React, including handling nested objects. Here's what you need to do:

- Complete the 3 update functions in the ProfileUpdater component: updateName: Update the user's name using the nameInput value updateAge: Update the user's age using the ageInput value updateCity: Update the city in the user's address using the cityInput value

 **Requirements:** 

- All updates should maintain immutability (create new objects)
- After updating, clear the corresponding input field
- For age: Convert input to a number and validate it's a number
- For name/city: Only update if input is not empty
- For city: Remember the address is a nested object!

 **Step-by-Step Guide:** 

- Update Name: Use the nameInput value to update user.name Use the spread operator (...) to copy previous state Reset nameInput to empty string after update
- Update Age: Convert ageInput to a number first Check if the conversion is valid (using isNaN()) Update user.age only if valid Reset ageInput after update
- Update City (Nested Object): Update the city property inside address Copy both the main user object AND the address object Use nested spread operators to maintain immutability Reset cityInput after update

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-19T03:29:57.317Z  

```cpp
                                                                                                                                                                                      city: cityInput
                                                                                                                                                                  address: {
                                                                                                                                                                            ...prevUser.address,

                                                                                                                                        const updateCity = () => {
                                                                                                                                            if (cityInput.trim()) {
                                                                                                                                                  setUser((prevUser) => ({
                                                                                                                                                          ...prevUser,
                                                                                                                                setAgeInput("");
                                                                                                                                    }
                                                                                                                                      };
                                                                                                                    age: ageNumber
                                                                                                                          }));
                                                                                                    setUser((prevUser) => ({
                                                                                                            ...prevUser,

                                                                                              if (ageInput !== "" && !isNaN(ageNumber)) {
                                                                                          const ageNumber = Number(ageInput);

                                                                                      const updateAge = () => {
                                                                                    };
                                                                                  }
                                                                              setNameInput("");
                                                                        }));
                                                                  name: nameInput
                                                          ...prevUser,
                                                  setUser((prevUser) => ({
                                            if (nameInput.trim()) {
                                        const updateName = () => {

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR89)