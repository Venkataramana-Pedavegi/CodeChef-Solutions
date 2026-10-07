    </div>
        placeholder="Enter a task..."
      />
      <button onClick={() => { addTask(task); setTask(""); }}>Add</button>
        type="text"
        value={task}
        onChange={(e) => setTask(e.target.value)}
      <input
    <div>
  return (

  const [task, setTask] = useState("");
function TaskInput({ addTask }) {
}

// Component for input field
      <TaskList tasks={tasks} removeTask={removeTask} />
    </div>
  );
    <div style={{ textAlign: "center", marginTop: "50px" }}>
      <h2>📝 To-Do List</h2>
      <TaskInput addTask={addTask} />
  function removeTask(index) {
    setTasks(tasks.filter((_, i) => i !== index));
  };

  return (

  // Function to remove a task
    }
  };
    if (task.trim() !== "") {
      setTasks([...tasks, task]);
  function addTask(task) {