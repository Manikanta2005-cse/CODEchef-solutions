# XWZZRQ03C

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Worked Example - Iterating Arrays with For Loop

In this example, we demonstrate how to iterate through an integer ArrayList using a `for` loop in Java. This technique is useful when you need to access or process each element in an array individually.

 **When executed, the code will show:** 

```
Score 1: 85  
Score 2: 90  
Score 3: 78  
Score 4: 92  
Score 5: 88  

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:00:31.175Z  

```java
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

[View on CodeChef](https://www.codechef.com/problems/XWZZRQ03C)