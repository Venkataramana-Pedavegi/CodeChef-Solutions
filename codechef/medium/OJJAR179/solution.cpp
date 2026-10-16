import UserContext from './UserContext';
import './App.css';
import Layout from './Layout';

function App() {
  const user = {
    name: 'Sarah',
    progress: 'Module 3',
  };

  return (
    <UserContext.Provider value={user}>
      <Layout />
    </UserContext.Provider>
  );
}

export default App;