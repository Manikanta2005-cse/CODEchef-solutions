# Count Elements With Strictly Smaller and Greater Elements

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums`, return  *the number of elements that have  **both**  a strictly smaller and a strictly greater element appear in* `nums`.

 

 **Example 1:** 

```
Input: nums = [11,7,2,15]
Output: 2
Explanation: The element 7 has the element 2 strictly smaller than it and the element 11 strictly greater than it.
Element 11 has element 7 strictly smaller than it and element 15 strictly greater than it.
In total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.

```

 **Example 2:** 

```
Input: nums = [-3,3,3,90]
Output: 2
Explanation: The element 3 has the element -3 strictly smaller than it and the element 90 strictly greater than it.
Since there are two elements with the value 3, in total there are 2 elements having both a strictly smaller and a strictly greater element appear in nums.

```

 

 **Constraints:** 

- 1 <= nums.length <= 100
- -105 <= nums[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.5 MB (beats 73.57%)  
**Submitted:** 2026-08-22T16:03:57.736Z  

```java
class Solution {
    public int countElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }

        int count = 0;
        for (int num : nums) {
            if (num > min && num < max) {
                count++;
            }
        }

        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-elements-with-strictly-smaller-and-greater-elements/)