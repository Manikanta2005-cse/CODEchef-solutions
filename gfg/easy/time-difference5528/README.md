# Time Difference

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given the start time  **st**  and end time  **et**  of a race in the format  **hh:mm:ss**. Return the time taken to complete the race.

 **Examples:** 

```
Input: st = "13:50:45", et = "14:55:50"
Output: "01:05:05"
Explanation: The time gap is 1 hour 5 minutes and 5 seconds.
```

```
Input: st = "12:00:00", et = "24:00:00"
Output: "12:00:00"
Explanation: The time gap is of 12 hours.
```

 **Constraints:** 
0 ≤ hh ≤ 24
0 ≤ mm ≤ 59
0 ≤ ss ≤ 59
|st| = |et| = 8

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-13T16:21:26.527Z  

```java
class Solution {
    public String timeGap(String st, String et) {
        int stSeconds = parseToSeconds(st);
        int etSeconds = parseToSeconds(et);

        int diffSeconds = etSeconds - stSeconds;
        if (diffSeconds < 0) {
            diffSeconds += 24 * 3600;
        }

        int hrs = diffSeconds / 3600;
        int mins = (diffSeconds % 3600) / 60;
        int secs = diffSeconds % 60;

        return String.format("%02d:%02d:%02d", hrs, mins, secs);
    }

    private int parseToSeconds(String time) {
        String[] parts = time.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/time-difference5528/1)