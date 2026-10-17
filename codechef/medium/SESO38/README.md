# SESO38

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Bubble Sort Algorithm Analysis
### Time Complexity
- Worst Case: O(n2)(when the list is sorted in reverse order)
- Best Case: O(n)(when the list is already sorted)
- Average-case: O(n2)
### Space Complexity
- Bubble sort is an in-place sorting algorithm, so it requires 𝑂(1) additional space.
### Characteristics
- Stability: Bubble sort is a stable sorting algorithm, meaning that it maintains the relative order of items with equal keys.
- Adaptive: While not adaptive by default, it can be made adaptive by adding a flag to detect if any swaps were made in a pass. If no swaps were made, the algorithm can terminate early.

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-17T15:18:16.157Z  

```cpp
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

[View on CodeChef](https://www.codechef.com/problems/SESO38)