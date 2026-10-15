# OJJAR204

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementing Move Right

 **Goal:**  Extend your 2048 game to support the "move right" action. When the right arrow key is pressed, all tiles on the board should slide as far right as possible in their respective rows, merge if applicable, and a new tile should appear if the board changed.

 **Feature Requirements:** 

- Sliding Tiles Right: All tiles should move to the rightmost available positions in their rows. For example, a row [2, 0, 2, 0] moved right should become [0, 0, 2, 2] (before merging).

 **The Core Idea: Re-using "Move Left" Logic** 

We already have a way to slide tiles to the left. Imagine you want to slide tiles to the right in a row like this: `[2, 0, 4, 0]` If you move these right, it should become: `[0, 0, 2, 4]`

Now, think about this: What if you took that original row `[2, 0, 4, 0]` and looked at it from the other end? You could achieve this by  **reversing**  the row. Reversed row: `[0, 4, 0, 2]`

Now, if you apply your "slide left" logic (which we'll call `compress` for now, as it just pushes non-zero numbers to the left and fills the rest with zeros) to this  *reversed*  row `[0, 4, 0, 2]`: The `compress` function would turn `[0, 4, 0, 2]` into `[4, 2, 0, 0]`.

Okay, so we have `[4, 2, 0, 0]`. This isn't our "move right" result yet. But what if we  **reverse this result again** ? Reversing `[4, 2, 0, 0]` gives us `[0, 0, 2, 4]`.

And that's exactly what we wanted for moving `[2, 0, 4, 0]` to the right!

 **So, the logic for moving tiles right (just sliding, no merging yet) is:** 

- Take the board (or a single row).
- Reverse it. Imagine flipping it horizontally.
- Apply the "slide left" logic (our compress function) to this reversed board/row. This will push all the numbers to the "new" left (which was the original right).
- Reverse the result back. Flip it horizontally again.

 **Now try to implement it, or you can go another way as well** 

 **Your app should be work like that at the end** 

- Press $←$ or $→$ and all tiles slide in that direction.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T06:37:16.080Z  

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

function compress(board) {
  let newBoard = board.map(row => {
    let newRow = row.filter(val => val !== 0);
```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR204)