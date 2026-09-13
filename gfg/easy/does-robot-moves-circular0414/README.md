# Does Robot Move Circular

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s** representing a sequence of robot moves, determine whether the robot follows a  **circular**  path. A path is considered circular if the robot ends at the same position from which it started.

The possible moves are:

- 'G' - Move one unit forward.
- 'L' - Turn left.
- 'R' - Turn right.

 **Examples:** 

```
Input: s = "GLGLGLG"
Output: true
Explanation: If we start form (0,0) in a plane then we will back to (0,0) by the end of the sequence.

```

```
Input: s = "GGGGL"
Output: false
Explanation: We can't return to same place at the end of the path.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:10:18.992Z  

```java
class Solution {
    public boolean isCircular(String s) {
        int x = 0, y = 0;
        int dir = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for (int i = 0; i < s.length(); i++) {
            char move = s.charAt(i);
            if (move == 'R') {
                dir = (dir + 1) % 4;
            } else if (move == 'L') {
                dir = (dir + 3) % 4;
            } else if (move == 'G') {
                x += dx[dir];
                y += dy[dir];
            }
        }

        return x == 0 && y == 0;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/does-robot-moves-circular0414/1)