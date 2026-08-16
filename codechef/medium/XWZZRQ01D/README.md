# XWZZRQ01D

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ - Find the difference

What will be the output of the following Java program?

```
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Initialize an ArrayList with elements
        ArrayList<Integer> values = new ArrayList<>();
        values.add(20);
        values.add(15);
        values.add(10);
        values.add(5);
        values.add(0);

        int difference = values.get(values.size() - 1);  // Start with 0

        for (int i = values.size() - 2; i >= 0; i--) {
            difference -= values.get(i);
        }

        System.out.println("Difference: " + difference);
    }
}

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:01:23.716Z  

```cpp
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Declare and initialize ArrayList
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);
        scores.add(88);

        // Loop through ArrayList elements
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ01D)