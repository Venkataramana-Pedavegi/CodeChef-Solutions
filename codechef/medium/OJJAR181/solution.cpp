import { useEffect } from 'react';
import FocusLock from 'react-focus-lock'; // For trapping focus
import { RemoveScroll } from 'react-remove-scroll'; // For disabling background scroll
import './Modal.css'; // Styles for the modal

function Modal({ isOpen, onClose, title, children }) {

  // Effect to handle the 'Escape' key press
  useEffect(() => {
    // Function to call when a key is pressed
    const handleKeyDown = (event) => {
      if (event.code === 'Escape') {
        onClose(); // Call the onClose function passed as a prop
      }
    };

    // Add event listener only when the modal is open
    if (isOpen) {
      window.addEventListener('keydown', handleKeyDown);
    }

    // Cleanup function: Remove the event listener when the modal closes or component unmounts
    return () => {
      window.removeEventListener('keydown', handleKeyDown);
    };
  }, [isOpen, onClose]); // Re-run the effect if isOpen or onClose changes

  // If the modal is not open, don't render anything
  if (!isOpen) {