import { useState, useRef, useEffect } from 'react';
import styles from './styles.module.css'; // Import CSS module

function App() {
  const [count, setCount] = useState(0); // State for the counter
  const [flingMessage, setFlingMessage] = useState(''); // State for the temporary message
  const flingTimeoutRef = useRef(null); // Ref to store the timeout ID

  // Handler function to increment the count and show the fling message
  const handleIncrement = (amount) => {
    const message = `+${amount}`;

    // 1. Update the count state
    setCount(prevCount => prevCount + amount);

    // 2. Set the fling message to make it appear
    setFlingMessage(message);

    // 3. Clear any existing timeout to prevent premature message clearing
    if (flingTimeoutRef.current) {
      clearTimeout(flingTimeoutRef.current);
    }

    // 4. Set a new timeout to clear the message after a delay
    flingTimeoutRef.current = setTimeout(() => {
      setFlingMessage(''); // Clear the message
      flingTimeoutRef.current = null; // Reset the ref
    }, 1200); 
