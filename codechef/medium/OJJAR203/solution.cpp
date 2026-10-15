import { useState, useEffect } from 'react'; // useEffect is crucial here
import './App.css';

// (Previous code for SIZE, getEmptyBoard, getRandomInt, addRandomTile remains the same)
const SIZE = 4;

function getEmptyBoard() {
  return Array(SIZE).fill(null).map(() => Array(SIZE).fill(0));
}

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

function addRandomTile(board) {
  const newBoard = board.map(row => [...row]);
  const emptyTiles = [];
  for (let r = 0; r < SIZE; r++) {
    for (let c = 0; c < SIZE; c++) {
      if (newBoard[r][c] === 0) {
        emptyTiles.push([r, c]);
      }
    }
  }
  if (emptyTiles.length === 0) {
    return newBoard;
  }
  const [r, c] = emptyTiles[getRandomInt(emptyTiles.length)];
  newBoard[r][c] = Math.random() < 0.9 ? 2 : 4;