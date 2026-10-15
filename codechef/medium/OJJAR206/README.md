# OJJAR206

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementing Tile Merging

Okay, let's implement the core merging logic for the 2048 game!

 **Goal:**  Modify your 2048 game to enable tiles to merge. When two tiles with the same number collide during a move, they should merge into a single tile with the sum of their values.

 **Tasks:** 

- Implement the merge(board) Function: This function will be responsible for merging adjacent identical tiles in each row. It should be defined outside your App component. The function takes the current game board (a 2D array) as an argument. It should iterate through each row of the board. For each row, it should iterate through the cells from left to right, up to the second-to-last cell (i.e., c < SIZE - 1). Inside the inner loop, check if the current cell board[r][c] is not 0 AND is equal to the cell immediately to its right board[r][c + 1]. If they are equal and not zero: Double the value of the current cell: board[r][c] *= 2; Set the cell to its right to 0: board[r][c + 1] = 0; The function should return the modified board. Note: This function will mutate the board it receives.
- Integrate merge into moveLeft(board): The moveLeft function needs to be updated to incorporate the merging logic. The correct sequence of operations within moveLeft should be: compress(board): Slide all tiles to the left. merge(compressedBoard): Merge adjacent identical tiles. compress(mergedBoard): Slide tiles again to close any gaps created by merging. Update your moveLeft function to follow this sequence.
- Verify Other Moves: Since moveRight, moveUp, and moveDown are implemented using moveLeft along with transpose and reverse, they should automatically benefit from the merge logic once moveLeft is correctly updated. No direct changes to these other move functions should be necessary for merging.

 **Your app should be work like that at the end** 

 **Hints:** 

- merge(board) function structure: function merge(board) { for (let r = 0; r < SIZE; r++) { for (let c = 0; c < SIZE - 1; c++) { if (board[r][c] !== 0 && board[r][c] === board[r][c + 1]) { board[r][c] *= 2; board[r][c + 1] = 0; } } } return board; }

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T06:38:29.137Z  

```cpp
import { useEffect, useState } from 'react';
import './App.css';

const SIZE = 4;

function getEmptyBoard() {
  return Array(SIZE).fill().map(() => Array(SIZE).fill(0));
}

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

function addRandomTile(board) {
  const emptyTiles = [];
  for (let r = 0; r < SIZE; r++) {
    for (let c = 0; c < SIZE; c++) {
      if (board[r][c] === 0) emptyTiles.push([r, c]);
    }
  }
  if (emptyTiles.length === 0) return board;
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  board[r][c] = Math.random() < 0.9 ? 2 : 4;
  return board;
}

function transpose(board) {
  const newBoard = getEmptyBoard();
  for (let r = 0; r < SIZE; r++) {
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR206)