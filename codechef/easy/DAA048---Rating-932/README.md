# DAA048 - Rating 932

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Uniqueness of an arary

Consider this problem, you are given an array $A$, determine if all the values present in $A$ are unique or not.

A value in an array is unique if and only if the frequency of its occurrence is exactly one.

If all the values are unique print `YES` else print `NO`.

### Concept

To solve this problem, you can fix one element and search the array if it exists at another index.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases. The description of the test cases follows.
- The first line of each test case contains a single integer $N$, denoting the length of array $A$.
- The second line of each test case contains $N$ space-separated integers $A_1, A_2, \ldots, A_N$ — denoting the array $A$.
### Output Format

For each test case, output `YES` if all the values in the array are unique, else output `NO`.

### Constraints
- $1 \leq T \leq 100$
- $2 \leq N \leq 10^3$
- $1 \leq A_i \leq 10^9$
- The sum of $N$ across all test cases does not exceed $10^3$
### Sample 1:
Input
Output

```
2
4
1 2 1 3
4
1 2 5 3
```

```
NO
YES
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:53:49.468Z  

```java
import java.util.Scanner;

public class Main {

    // Node structure for the custom Hash Map's linked list
    static class Node {
        int key;
        Node next;

        Node(int key) {
            this.key = key;
            this.next = null;
        }
    }

    // Custom Hash Map implementation
    static class CustomHashMap {
        private final int SIZE = 1007; // Prime bucket size for better distribution
        private Node[] table;

        public CustomHashMap() {
            table = new Node[SIZE];
        }

        // Hash function to map key to bucket index
        private int hash(int key) {
            return Math.abs(key % SIZE);
        }

        // Inserts key if not present; returns true if insert succeeded, false if duplicate found
        public boolean insert(int key) {
            int index = hash(key);
            Node current = table[index];

            // Check if key already exists in the bucket
            while (current != null) {
                if (current.key == key) {
                    return false; // Duplicate detected!
                }
                current = current.next;
            }

            // Insert new key at the head of the chain
            Node newNode = new Node(key);
            newNode.next = table[index];
            table[index] = newNode;
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            CustomHashMap map = new CustomHashMap();
            boolean isUnique = true;

            for (int i = 0; i < n; i++) {
                int val = scanner.nextInt();
                if (isUnique) {
                    // Try inserting into custom map
                    if (!map.insert(val)) {
                        isUnique = false; // Found a duplicate
                    }
                }
            }

            if (isUnique) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/DAA048)