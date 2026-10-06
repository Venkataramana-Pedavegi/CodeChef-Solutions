// This component displays the light status based on the `isLightOn` prop.
export function LightStatus({ isLightOn }) {
  return (
      <>
            {isLightOn ? <h1>Lights ON</h1> : <h1>Lights OFF</h1>}
                </>
                  );
                  }

                  // Main App component
                  export default function App() {
                    return (
                        <LightStatus isLightOn={true} />
                          );
                          }
                          