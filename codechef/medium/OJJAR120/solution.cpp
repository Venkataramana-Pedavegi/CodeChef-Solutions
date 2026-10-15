// Receive currentActiveTab prop
function Tabs({ currentActiveTab = 0 }) {
  return (
      <div className="tabs-container">
            <div className="tab-headers">
                    {/* Placeholder Headers */}
                            <button className={`tab-header ${currentActiveTab === 0 ? 'active' : ''}`}>
                                      Personal Info
                                              </button>
                                                      <button className={`tab-header ${currentActiveTab === 1 ? 'active' : ''}`}>
                                                                Experience
                                                                        </button>
                                                                                <button className={`tab-header ${currentActiveTab === 2 ? 'active' : ''}`}>
                                                                                          Review
                                                                                                  </button>
                                                                                                        </div>

                                                                                                              <div className="tab-content">
                                                                                                                      {/* Conditional Rendering based on currentActiveTab */}

                                                                                                                              {/* Show this content only if currentActiveTab is 0 */}
                                                                                                                                      {currentActiveTab === 0 && (
                                                                                                                                                <div>
                                                                                                                                                            <h2>Personal Information</h2>
                                                                                                                                                                        <p>Content for the personal info tab goes here.</p>
                                                                                                                                                                                  </div>
                                                                                                                                                                                          )}

                                                                                                                                                                                                  {/* Show this content only if currentActiveTab is 1 */}