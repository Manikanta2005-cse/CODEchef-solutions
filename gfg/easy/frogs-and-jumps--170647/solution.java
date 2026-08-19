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