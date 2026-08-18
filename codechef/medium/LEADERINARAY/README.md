# LEADERINARAY

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Leaders in an array

You are given an integer array $nums$. An element in the array is called a  **leader**  if it is  **strictly larger than every element to its right**. The last element in the array is always considered a leader.

Return a list of all such leaders, preserving the order in which they appear in the original array.

## Function Declaration
### Function Name

$findLeaders$ – This function identifies all  *leader elements*  in the given array.
An element is considered a  **leader**  if it is strictly greater than every element to its right.
The last element of the array is always a leader.

### Parameters
- $nums$ : A reference to an integer array of size $n$.
### Return Value
- Returns a list of all leader elements preserving their order as in the original array.
## Constraints
- $1 \leq nums.length \leq 10^5$
- $-10^4 \leq nums[i] \leq 10^4$
### Input Format
- The first line contains a single integer $T$ — the number of test cases.
- For each test case: The first line contains an integer $n$ — the size of the array. The second line contains $n$ integers representing the array $nums$.
### Output Format
- For each test case, print all leader elements in the same order they appear in the array, separated by spaces.
### Sample 1:
Input
Output

```
1
6
10 7 8 3 5 2
```

```
10 8 5 2

```

### Explanation:
- 2 is the rightmost element, so it is a leader.
- 5 is greater than everything after it, so it’s a leader.
- 8 is greater than [3, 5, 2], so it’s a leader.
- 10 is greater than everything to its right.
### Sample 2:
Input
Output

```
1
5
6 -2 9 4 1
```

```
9 4 1
```

### Explanation:
- 1 is the rightmost -> leader.
- 4 > [1] -> leader.
- 9 > [4, 1] -> leader.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-18T16:29:14.004Z  

```java
import java.util.*;

class Solution {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public List<Integer> findLeaders(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        int maxSoFar = Integer.MIN_VALUE;
        Node head = null;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxSoFar) {
                maxSoFar = nums[i];
                Node newNode = new Node(nums[i]);
                newNode.next = head;
                head = newNode;
            }
        }

        List<Integer> result = new ArrayList<>();
        Node current = head;
        while (current != null) {
            result.add(current.data);
            current = current.next;
        }

        return result;
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/LEADERINARAY)