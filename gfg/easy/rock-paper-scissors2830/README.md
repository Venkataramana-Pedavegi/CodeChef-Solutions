# Rock Paper Scissors!

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Two players,  **a**  and  **b**, are playing a series of Rock-Paper-Scissors games.

- Player a's and b's moves are given by strings a and b respectively.
- Each character in the strings is one of 'R', 'P', or 'S', representing Rock, Paper, and Scissors respectively.
- A total of k games are played. In the i-th game, each player uses the next character from their respective string.
- If a player reaches the end of their string, they continue again from the beginning of the same string.

The winner of a game is determined using the standard Rock-Paper-Scissors rules:

- Rock defeats Scissors.
- Scissors defeats Paper.
- Paper defeats Rock.

If both players choose the same move, the game is considered a  **draw**.

Given the strings  **a**,  **b**, and an integer  **k**, find the number of games won by each player after  **exactly k**  games have been played.

 **Examples:** 

```
Input: a = "RPS", b = "SR", k = 7
Output: [3, 2]
Explanation: Since the strings are used cyclically, the sequence of moves played is (R,S), (P,R), (S,S), (R,R), (P,S), (S,R), and (R,S). Player A wins the 1st, 2nd, and 7th games, while Player B wins the 5th and 6th games. 
The 3rd and 4th games end in a draw. Hence, Player A wins 3 games and Player B wins 2 games.

```

```
Input: a = "RP", b = "SRS", k = 8
Output: [5, 2]
Explanation: The strings repeat after reaching their ends, producing the sequence of games (R,S), (P,R), (R,S), (P,S), (R,R), (P,S), (R,S), and (P,R). 
Player A wins the 1st, 2nd, 3rd, 7th, and 8th games, while Player B wins the 4th and 6th games. 
The 5th game is a draw. Therefore, Player A wins 5 games and Player B wins 2 games.

```

 **Constraints:** 
1 ≤ |a|, |b| ≤ 103
1 ≤ k ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T05:30:15.133Z  

```java
class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n = a.length();
               int m = b.length();

               int cycle = lcm(n, m);

               int aWin = 0;
               int bWin = 0;

               for (int i = 0; i < cycle; i++) {
                   char x = a.charAt(i % n);
                   char y = b.charAt(i % m);

                   if ((x == 'R' && y == 'S') ||
                       (x == 'S' && y == 'P') ||
                       (x == 'P' && y == 'R')) {
                       aWin++;
                   }
                   else if ((y == 'R' && x == 'S') ||
                            (y == 'S' && x == 'P') ||
                            (y == 'P' && x == 'R')) {
                       bWin++;
                   }
               }

               int fullCycles = k / cycle;
               int remaining = k % cycle;

               int totalA = aWin * fullCycles;
               int totalB = bWin * fullCycles;

               for (int i = 0; i < remaining; i++) {
                   char x = a.charAt(i % n);
                   char y = b.charAt(i % m);

                   if ((x == 'R' && y == 'S') ||
                       (x == 'S' && y == 'P') ||
                       (x == 'P' && y == 'R')) {
                       totalA++;
                   }
                   else if ((y == 'R' && x == 'S') ||
                            (y == 'S' && x == 'P') ||
                            (y == 'P' && x == 'R')) {
                       totalB++;
                   }
               }

               return new int[]{totalA, totalB};
           }

           int gcd(int a, int b) {
               while (b != 0) {
                   int temp = a % b;
                   a = b;
                   b = temp;
               }
               return a;
           }

           int lcm(int a, int b) {
               return (a / gcd(a, b)) * b;
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rock-paper-scissors2830/1)