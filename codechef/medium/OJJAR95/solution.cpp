                                                                  return (
                                                                      <div>
                                                                            <input
                                                                                    type="text"
                                                                                            value={task}
                                                                                                    onChange={(e) => setTask(e.target.value)}
                                                                                                            placeholder="Enter a task..."
                                                                                                                  />
                                                                                                                        <button onClick={() => { addTask(task); setTask(""); }}>Add</button>
                                                                                                                            </div>
                                                                                                                              );
                                                                                                                              }

                                                                                                                              // Component to display the list of tasks
                                                                                                                              function TaskList({ tasks, removeTask }) {
                                                                                                                                return (
                                                                                                                                    <ul>
                                                                                                                                          {tasks.map((task, index) => (
                                                                                                                                                  <li key={index}>
                                                                                                                                                            {task} <button onClick={() => removeTask(index)}>Remove</button>
                                                                                                                                                                    </li>
                                                                                                                                                                          ))}
                                                                                                                                                                              </ul>
                                                                                                                                                                                );
                                                                                                                                                                                }

                                                                                                                                                                                export default App;
                                                                                                                                                                                