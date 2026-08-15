# HSH10 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Built-In Hashing Data Structures

Most programming languages offer built-in data structures that implement hashing. For example, C++ has `std::unordered_map`, Java provides `HashSet` and `HashMap`, and Python has dictionaries.

These built-in hash maps also come with mechanisms to handle collisions efficiently.

### Task

Execute the code given in the IDE to explore how these built-in hashing data structures function.

### Sample 1:
Input
Output

```
6
213512345
1234123
1000000000
987987435
134604389
23

```

```
0 1 2 3 4 5 

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:07:20.849Z  

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            mp.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(mp.get(arr[i]) + " ");
        }
        System.out.println();
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/HSH10)