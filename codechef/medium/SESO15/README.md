# SESO15

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Implementation of Bubble Sort

Sorting the array [6,5,3,1] using bubble sort.

### Initial List
- [6,5,3,1]
### First Pass:
- Compare 6 and 5, swap -> [5,6,3,1]
- Compare 6 and 3, swap -> [5,3,6,1]
- Compare 6 and 1, swap -> [5,3,1,6]
### Second Pass
- Compare 5 and 3, swap -> [3,5,1,6]
- Compare 5 and 1, swap -> [3,1,5,6]
### Third Pass
- Compare 3 and 1, swap -> [1,3,5,6]
### The list is now sorted.
- [1,3,6,5]
## Task
- Given a program to sort using bubble sort.
- Analyze the code for bubble sort and submit.
### Sample 1:
Input
Output

```
6 5 3 1 8 7 2 4
```

```
1 2 3 4 5 6 7 8

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:11:05.491Z  

```java
class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1, 8, 7, 2, 4};
        bubbleSort(arr);
        printArray(arr);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SESO15)