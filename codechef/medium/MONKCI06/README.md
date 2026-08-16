# MONKCI06

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### MCQ

What is the result of the following code?

```
ArrayList<Integer> nums = new ArrayList<>();
nums.add(0, 10);
nums.add(1, 20);
nums.add(1, 15);
System.out.println(nums);

```

## Solution

**Language:** C++  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:05:49.701Z  

```cpp
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        // Add "Math" at the end
        subjects.add("Math");

        // Add "English" at the end
        subjects.add("English");

        // Add "Science" at index 1
        subjects.add(1, "Science");

        // Add "History" at index 2
        subjects.add(2, "History");

        // Add "Art" at index 0
        subjects.add(0, "Art");

        // Print the final list
        System.out.println(subjects);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI06)