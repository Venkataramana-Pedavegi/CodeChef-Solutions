            <p>Primary Button (should have classes "btn btn-primary"):</p>
            <Button
            className="btn-primary"
            onClick={() => alert('Primary clicked!')}
            >
            Primary Button
            </Button>
            <p>Button trying to override type (should remain type="button"):</p>
            <Button
            className="btn-secondary"
            type="submit" // This prop is passed but ignored for the 'type' attribute
            onClick={() => alert('Secondary clicked!')}
            >
            Secondary (Still a Button)
            </Button>
            <p>Disabled Button (should have "btn" class and be disabled):</p>
            <Button disabled>
            Disabled Button
            </Button>
            </div>
            );
            }

            export default App;
