# HASHP03 - Rating 1696

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Subarray Sum equals k

Given an array of integers $nums$ and an integer $k$, return the total number of subarrays whose sum equals to $k$.

Note: A  **subarray**  is a contiguous non-empty sequence of elements within an array.

### Function Declaration
#### Function Name

$subarraySum$ – This function computes the total number of continuous subarrays whose sum is exactly equal to $k$.

### Parameters
- $nums$ : An array of integers of length $n$, representing the input array.
- $n$ : An integer representing the size of the array.
- $k$ : An integer representing the target sum.
### Return Value

Returns a single integer — the total number of continuous subarrays whose sum equals $k$. If no such subarray exists, the function returns $0$.

### Constraints
- $1 \le N \le 2*10^4$
- $-1000 \le nums[i] \le 1000$
- $-10^7 \le k \le 10^7$
### Input Format
- The first line contains n the length of an array.
- The second line contains an array of length n
- The third line contains an integer representing the target sum.
### Output Format
- Output the total number of subarrays whose sum equals to $k$.
### Sample 1:
Input
Output

```
3
1 1 1
2
```

```
2
```

### Explanation:

There are two subarrays whose sum equals 2:

- [1, 1] (starting at index 0, ending at index 1)
- [1, 1] (starting at index 1, ending at index 2)
### Sample 2:
Input
Output

```
3
1 2 3
3
```

```
2
```

### Explanation:

There are two subarrays whose sum equals 3:

- [1, 2] (starting at index 0, ending at index 1)
- [3] (starting at index 2, ending at index 2)

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:13:10.886Z  

```java
public int subarraySum(int[] nums, int n, int k) {
    int count = 0, sum = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);  

    for (int i = 0; i < n; i++) {
        sum += nums[i];
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);  
        }
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count; 
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HASHP03)