import { useState, useEffect, useRef } from 'react';
import './App.css';

// Utility function to get random position for a circle
const getRandomPosition = () => {
  const x = Math.floor(Math.random() * 90); // % position for left
    const y = Math.floor(Math.random() * 80); // % position for top
      return { x, y };
      };

      // Circle component
      function Circle({ x, y, onClick }) {
        return (
            <div
                  className="circle"
                        data-testid="circle"
                              style={{ left: `${x}%`, top: `${y}%` }}
                                    onClick={onClick}
                                        ></div>
                                          );
                                          }

                                          function App() {
                                            // TODO 1: Initialize circles, score, and timeLeft state variables
                                              const [circles, setCircles] = useState([getRandomPosition()]);
                                                const [score, setScore] = useState(0);
                                                  const [timeLeft, setTimeLeft] = useState(10);

                                                    // TODO 2: Create a ref using useRef to store the interval ID