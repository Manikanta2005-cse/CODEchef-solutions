# DSAAGP1098 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Aggressive Cows

Farmer John has built a new long barn, with $N$ stalls. The stalls are located along a straight line at positions $x_1... x_N$.

His $C$ cows don't like this barn layout and become aggressive towards each other once put into a stall. To prevent the cows from hurting each other, Farmer John wants to assign the cows to stalls, such that the minimum distance between any two of them is as large as possible. What is the largest minimum distance?

Take some time to think about how you can use predicate binary search to solve this problem and then continue reading.

This problem can be broken into two parts.

- Check if keeping a certain distance $d$ he can assign a stall to each cow.
- Find the minimum $d$ so that he can assign a stall to each cow.

Let's first focus on the first part of the problem.

### Task

You are given a function $check$ with the array of positions of stalls, the size of the array $n$, the number of cows $c$, and a distance $d$. You have to return a boolean value denoting if all the cows can be assigned a stall such that the minimum distance between them is $d$ or not. The array passed in the $check$ function is  **sorted**.

### Constraints
- $2 \leq N \leq 10^5$
- $2 \leq C \leq N$
- $0 \leq x_i \leq 10^9$
### Sample 1:
Input
Output

```
5 3
1 2 4 8 9
```

```
3
```

### Explanation:

We can place three cows in the stalls at positions x = 1, x = 4, and x = 9, ensuring that the maximum gap between them is 3.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-02T16:10:41.367Z  

```java
public static boolean check(int[] arr, int d, int n, int c) {
    c--;
    int prev = arr[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] - prev >= d) {
            c--;
            prev = arr[i];
        }
        if (c == 0) return true;
    }
    return false;
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAAGP1098)