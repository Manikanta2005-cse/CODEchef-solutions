# Frogs and Jumps

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Frogs are positioned at one end of a pond, and each wants to reach the other end. The pond has some leaves arranged in a straight line.

Each frog has a strength  **s**, meaning it jumps exactly  **s** leaves at a time - for example, a frog with strength 2 visits leaves 2, 4, 6, and so on while crossing the pond.

Given the strength of each frog (as an array  **arr[]**) and the total number of leaves  **k**, find how many leaves are not visited by any frog after all frogs have crossed the pond.

 **Examples:** 

```
Input: arr[] = [3, 2, 4], k = 4
Output: 1
Explanation: Frog with strength 3 visits leaf 3. Frog with strength 2 visits leaves 2, 4. Frog with strength 4 visits leaf 4. Leaf 1 is never visited by any frog.
```

```
Input: arr[] = [1, 3, 5], k = 6
Output: 0
Explanation: Frog with strength 1 visits leaves 1, 2, 3, 4, 5, 6 every leaf. All leaves are already covered, so none are left unvisited.
```

 **Constraints:** 
1 ≤ n, k, arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-19T10:20:44.627Z  

```java
#include <iostream>
#include <vector>
using namespace std;

// Function to count the number of unvisited leaves.
int unvisitedLeaves(vector<int> &arr, int k)
{
    // visited[i] stores whether the ith leaf has been
    // visited by any frog or not.
    vector<bool> visited(k + 1, false);

    // Process every frog one by one.
    for (int strength : arr)
    {

        // Check every leaf in the pond.
        for (int leaf = 1; leaf <= k; leaf++)
        {

            // If the leaf number is divisible by the frog's
            // strength, then the frog visits this leaf.
            if (leaf % strength == 0)
            {
                visited[leaf] = true;
            }
        }
    }

    // Count the leaves that were never visited.
    int unvisitedCount = 0;
    for (int leaf = 1; leaf <= k; leaf++)
    {
        if (!visited[leaf])
        {
            unvisitedCount++;
        }
    }

    return unvisitedCount;
}

// Driver code
int main()
{
    vector<int> arr = {3, 6, 2};
    int k = 6;

    cout << unvisitedLeaves(arr, k) << endl;

    return 0;
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/frogs-and-jumps--170647/1)