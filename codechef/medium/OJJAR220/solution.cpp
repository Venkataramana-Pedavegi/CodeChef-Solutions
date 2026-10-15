import { useState } from 'react';
import Modal from './Modal'; // Import the Modal component

function App() {
  // State to control whether the modal is visible or not
  const [isModalOpen, setIsModalOpen] = useState(false);

  // Function to open the modal
  const handleOpenModal = () => {
    setIsModalOpen(true);
  };

  // Function to close the modal
  const handleCloseModal = () => {
    setIsModalOpen(false);
  };

  return (
    <div>
      <h1>React Portal Demo App</h1>
      <p>
        This button is part of the main application rendered inside #root.
        Clicking it will open a modal.
      </p>
      <button onClick={handleOpenModal}>Open Modal</button>

      <p style={{ marginTop: '20px' }}>
        Notice the light gray background? That's the #root div.
        If you inspect the elements, the modal will appear OUTSIDE this div,