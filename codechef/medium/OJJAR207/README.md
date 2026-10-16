# OJJAR207

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementing Game Over Logic

Okay, great! We’ve finished merging the logic for all arrow keys. I’ve now added a bit more code to the `handleKeyDown` function:

```
if (JSON.stringify(board) !== JSON.stringify(processedBoard)) {
   const boardWithNewTile = addRandomTile(processedBoard);
   setBoard(boardWithNewTile);
}

```

This ensures that a new random tile is added only when the board actually changes.

Now, let's add the Game Over condition to your 2048 game!

 **Goal:**  Determine when the game is over and display a "Game Over" message to the player. Once the game is over, no further moves should be possible.

 **Requirements:** 

- Implement isGameOver(board) Function: It needs to determine if the game has reached a state where no more valid moves can be made. The game is over if: There are no empty cells (all cells are filled with numbers). AND there are no adjacent cells (horizontally or vertically) with the same value that could be merged. The function should return true if the game is over, and false otherwise.
- Display "Game Over" Message: Conditionally render a div with the text "Game Over" and the class name game-over when the game is over.
- Prevent Moves When Game Over: In the handleKeyDown function, if the game is over, immediately return and do not process any key presses for moves.

 **Your app should look like this when the game ends.**

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-16T16:38:33.944Z  

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
  const newBoard = board.map(row => [...row]);
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;
  return newBoard;
}

function transpose(board) {
  const newBoard = getEmptyBoard();
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR207)