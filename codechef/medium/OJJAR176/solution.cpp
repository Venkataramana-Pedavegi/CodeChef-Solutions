import LinkButton from "./LinkButton";
import "./App.css";

function App() {
  return (
    <div className="app">
      <LinkButton href="/reports" className="linkButton">
        View Reports
      </LinkButton>

      <LinkButton type="button" className="linkButton" onClick={() => alert(`You clicked on Download Invoice`)}>
        Download Invoice
      </LinkButton>

      <LinkButton type="button" className="linkButton" onClick={() => alert(`You clicked on Create New Invoice`)}>
        Create New Invoice
      </LinkButton>
    </div>
  );
}

export default App;
