import { useState } from 'react';
import './App.css'; 

const SIZE = 4;

function getEmptyBoard() {
  return Array(SIZE).fill(null).map(() => Array(SIZE).fill(0));
}

// --- TODO: Implement Part 2: Spawning New Tiles ---

// STEP 1: Helper function to get a Random Integer
// This function should take a 'max' number and return a random integer
// between 0 (inclusive) and max (exclusive).
// Hint: Use Math.random() and Math.floor()
function getRandomInt(max) {
  // YOUR CODE HERE
  // Example: return Math.floor(Math.random() * max);
  return ;
}

// STEP 2: Function to Add a Random Tile (`addRandomTile`)
// This function will take the current 'board' as an argument.
// It should:
//   1. Create a *copy* of the board (important for React state!).
//      Hint: `board.map(row => [...row])`
//   2. Find all empty cells (cells with value 0). Store their [row, col] coordinates.
//   3. If there are no empty cells, return the copied board as is.
//   4. Randomly select one of the empty cells using `getRandomInt`.