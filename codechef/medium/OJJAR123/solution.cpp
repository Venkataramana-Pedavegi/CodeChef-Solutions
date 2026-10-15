import { useState } from 'react';
import Tabs from './Tabs';
import './App.css';

function App() {
  const [activeTabIndex, setActiveTabIndex] = useState(0);
    const totalTabs = 3;

      const handleNext = () => {
          setActiveTabIndex((prevIndex) => Math.min(prevIndex + 1, totalTabs - 1));
            };

              const handlePrevious = () => {
                  setActiveTabIndex((prevIndex) => Math.max(prevIndex - 1, 0));
                    };

                      return (
                          <div className="App">
                                <h1>Job Application Form</h1>
                                      <Tabs 
                                              activeTabIndex={activeTabIndex} 
                                                      onNext={handleNext} 
                                                              onPrevious={handlePrevious} 
                                                                    />
                                                                        </div>
                                                                          );
                                                                          }

                                                                          export default App;