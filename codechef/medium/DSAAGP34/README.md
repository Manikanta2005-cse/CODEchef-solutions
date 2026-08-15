# DSAAGP34

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Using Hashing to Optimize counting frequency

In the previous problem, to calculate the frequencies of elements in array A, a basic approach is to iterate over the array and count occurrences of each element, which takes  **O(N^2)**  time. However, we can optimize this using hashing.

Optimized Approach Using Hashing:

- Find the maximum value in $A$. This will determine the size of the $Hash$ array.
- Declare a $Hash$ array of size max(A) + 1, and initialize all elements to $0$.
- Iterate through $A$ and for each element $A_i$, increment the corresponding index in the Hash array.

Example: For the array A = [1, 2, 2, 2, 3, 1, 2]: Maximum value: 3 $Hash$ array of size 4: [0, 0, 0, 0] After iterating through $A$:

```
index    0  1  2  3
        [0, 0, 0, 0]
1 ->    [0, 1, 0, 0]
2 ->    [0, 1, 1, 0]
2 ->    [0, 1, 2, 0]
2 ->    [0, 1, 3, 0]
3 ->    [0, 1, 3, 1]
1 ->    [0, 2, 3, 1]
2 ->    [0, 2, 4, 1]

```

Now, the Hash array represents the frequencies of elements in $A$.

This approach has a time complexity of  **O(N + max(A))**, which is significantly more efficient than  **O(N^2)**.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T15:53:06.239Z  

```cpp
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> freqMap = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
                
                freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0) + 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(freqMap.get(arr[i]) + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DSAAGP34)