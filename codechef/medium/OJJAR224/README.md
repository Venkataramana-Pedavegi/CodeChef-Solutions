# OJJAR224

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Tic-tac-toe 2

In this component, you will implement the core logic that determines the winner of a Tic-Tac-Toe game.

The function `calculateWinner(squares)` takes an array of 9 elements (each representing a square) and returns:

- 'X' if player X has won
- 'O' if player O has won
- null if there is no winner yet

This function will be used by the game to display the winner once any winning condition is met.

 **Requirements** 

You need to:

- Define all possible winning line combinations (rows, columns, and diagonals).
- Check each combination to see if it contains the same non-null symbol ('X' or 'O').
- Return the symbol ('X' or 'O') if a winning combination is found.
- If no winner exists after checking all lines, return null.

 **Example** 

 **Helpful Resources** 

- React Tic-Tac-Toe Tutorial (Official) https://reactjs.org/tutorial/tutorial.html#declaring-a-winner
- Array Destructuring in JS https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment
- Looping through Arrays https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/for...of

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-15T07:24:29.552Z  

```cpp
export function calculateWinner(squares) {
    const lines = [
        [0, 1, 2],
            [3, 4, 5],
                [6, 7, 8],
                    [0, 3, 6],
                        [1, 4, 7],
                            [2, 5, 8],
                                [0, 4, 8],
                                    [2, 4, 6],
                                      ];
                                        for (let i = 0; i < lines.length; i++) {
                                            const [a, b, c] = lines[i];
                                                if (squares[a] && squares[a] === squares[b] && squares[a] === squares[c]) {
                                                      return squares[a];
                                                          }
                                                            }
                                                              return null;
                                                              }

```

---

[View on CodeChef](https://www.codechef.com/problems/OJJAR224)