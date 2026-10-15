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