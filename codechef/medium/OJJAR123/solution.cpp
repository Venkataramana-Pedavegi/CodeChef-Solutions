    return (
        <div className="tabs-container">
              {/* Add your tab headers and content rendering here */}

                    <div className="navigation-buttons">
                            <button 
                                      onClick={onPrevious} 
                                                disabled={activeTabIndex === 0}
                                                        >
                                                                  Previous
                                                                          </button>
                                                                                  
                                                                                          <button 
                                                                                                    onClick={onNext} 
                                                                                                              disabled={activeTabIndex === totalTabs - 1}
                                                                                                                      >
                                                                                                                                Next
                                                                                                                                        </button>
                                                                                                                                              </div>
                                                                                                                                                  </div>
                                                                                                                                                    );
                                                                                                                                                    }

                                                                                                                                                    export default Tabs;

function Tabs({ activeTabIndex, onNext, onPrevious }) {
  const totalTabs = 3;

import React from 'react';