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
**Submitted:** 2026-09-13T16:05:45.558Z  

```java
class Solution {
    public int[] solveRPS(String a, String b, int k) {
        int n1 = a.length();
        int n2 = b.length();
        int period = n1 * n2;

        int winsA_period = 0;
        int winsB_period = 0;

        int limit = Math.min(k, period);
        for (int i = 0; i < limit; i++) {
            char ca = a.charAt(i % n1);
            char cb = b.charAt(i % n2);

            if (ca != cb) {
                if ((ca == 'R' && cb == 'S') || (ca == 'S' && cb == 'P') || (ca == 'P' && cb == 'R')) {
                    winsA_period++;
                } else {
                    winsB_period++;
                }
            }
        }

        if (k <= period) {
            return new int[]{winsA_period, winsB_period};
        }

        long fullCycles = (long) k / period;
        int remainder = k % period;

        long totalWinsA = fullCycles * winsA_period;
        long totalWinsB = fullCycles * winsB_period;

        for (int i = 0; i < remainder; i++) {
            char ca = a.charAt(i % n1);
            char cb = b.charAt(i % n2);

            if (ca != cb) {
                if ((ca == 'R' && cb == 'S') || (ca == 'S' && cb == 'P') || (ca == 'P' && cb == 'R')) {
                    totalWinsA++;
                } else {
                    totalWinsB++;
                }
            }
        }

        return new int[]{(int) totalWinsA, (int) totalWinsB};
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/rock-paper-scissors2830/1)