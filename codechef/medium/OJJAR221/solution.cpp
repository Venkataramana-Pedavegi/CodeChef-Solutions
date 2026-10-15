import { createPortal } from 'react-dom';

// TASK 2: Get the DOM element with the ID 'toast-root'
const toastRootElement = document.getElementById('toast-root');

function Toast({ message, onClose }) {

  // Basic structure for the toast's content
  const toastContent = (
    <div className="toast-notification">
      <span>{message}</span>
      {/* Optional close button */}
       <button onClick={onClose} className="toast-close-button" aria-label="Close toast">
         ×
       </button>
    </div>
  );

  // TASK 3: Use createPortal to render `toastContent` into the `toastRootElement`
  // Handle the case where toastRootElement might not be found (e.g., during SSR or testing)
  if (!toastRootElement) {
    console.error("Toast root element '#toast-root' not found.");
    return null; // Don't render anything if the target doesn't exist
  }

  // Use the portal!
  return createPortal(toastContent, toastRootElement);

}