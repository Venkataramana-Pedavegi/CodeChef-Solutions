# OJJAR90

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Create Simple Todo List

Create a React todo list that allows users to:

- Add new todos through an input field
- Mark todos as completed
- See all todos in a list
- Display a message when no todos exist
#### Requirements

 **1. State Initialization (Critical)** 

- Initialize todos state as empty array
- Initialize newTodo state as empty string

 **2. Form Submission Handling (`handleSubmit`)** 

- Prevent default form behavior with e.preventDefault()
- Validate input: reject empty/whitespace-only submissions
- Add new todo object with: Unique id (use Date.now()) text (trimmed input value) completed: false initial state
- Clear input field after submission

 **3. Todo Completion Toggle (`toggleComplete`)** 

- Implement state update logic using map()
- Toggle completed property for matching todo ID
- Ensure immutability (no direct state mutation)

 **4. UI Implementation** 

- Form Requirements: Add onSubmit={handleSubmit} Input field must have: value={newTodo} binding onChange handler for state updates Placeholder text
- Todo List Display: Show "No todos" message when array is empty (use empty-message class) For each todo: Add key={todo.id} Implement dynamic className: todo-item ${todo.completed ? 'completed' : ''} Create checkbox with: type="checkbox" checked={todo.completed} onChange handler for completion toggle
- Styling Requirements
- Ensure CSS classes exist:.todo-item.completed for strikethrough effects.empty-message for empty state styling
#### Your App should be look like this

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-18T14:58:43.833Z  

```cpp
                                                                                                                                                                                                                    {todos.length === 0 ? (
                                                                                                                                                                                                                            <p className="empty-message">No todos</p>
                                                                                                                                                                                                                                  ) : (
                                                                                                                                                                                                                                          <ul className="todo-list">
                                                                                                                                                                                                                                                    {todos.map((todo) => (
                                                                                                                                                                                                                                                                <li
                                                                                                                                                                                                                                                                              key={todo.id}
                                                                                                                                                                                                                                                                                            className={`todo-item ${todo.completed ? 'completed' : ''}`}
                                                                                                                                                                                                                                                                                                        >
                                                                                                                                                                                                                                                                                                                      <input
                                                                                                                                                                                                                                                                                                                                      type="checkbox"
                                                                                                                                                                                                                                                                                                                                                      checked={todo.completed}
                                                                                                                                                                                                                                                                                                                                                                      onChange={() => toggleComplete(todo.id)}
                                                                                                                                                                                                                                                                                                                                                                                    />
                                                                                                                                                                                                                                                                                                                                                                                                  <span>{todo.text}</span>
                                                                                                                                                                                                                                                                                                                                                                                                              </li>
                                                                                                                                                                                                                                                                                                                                                                                                                        ))}
                                                                                                                                                                                                                                                                                                                                                                                                                                </ul>
                                                                                                                                                                                                                                                                                                                                                                                                                                      )}
                                                                                                                                                                                                                                                                                                                                                                                                                                          </div>
                                                                                                                                                                                                                                                                                                                                                                                                                                            );
                                                                                                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                                                                                                            export default App;
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR90)