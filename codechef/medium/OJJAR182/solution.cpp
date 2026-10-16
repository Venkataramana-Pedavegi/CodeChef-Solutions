import { useContext } from "react";
import { UserContext } from "../context/UserContext";

const Modal = ({ onClose }) => {
  // Access context values needed for this component
    const { user } = useContext(UserContext);

      return (
          <div className="modal-backdrop">
                <div className="modal">
                        {/* Display personalized welcome message */}
                                <h2>👋 Hello, {user?.name}</h2>
                                        <p>Welcome to the app. We're glad you're here!</p>
                                                
                                                        {/* Button to close modal by updating context state */}
                                                                <button className="modal-button" onClick={onClose}>
                                                                          Close
                                                                                  </button>
                                                                                        </div>
                                                                                            </div>
                                                                                              );
                                                                                              };

                                                                                              export default Modal;