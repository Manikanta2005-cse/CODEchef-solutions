# MONKCI30

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:14:16.634Z  

```java
import java.util.ArrayList;
import java.util.Collections;

class Codechef {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        
        // Add fruits in random order
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Grapes");
        fruits.add("Mango");
        
        // Print the list before sorting
        System.out.println("Before sorting: " + fruits);
        
        // Sort the list
        Collections.sort(fruits);
        
        // Print the list after sorting
        System.out.println("After sorting: " + fruits);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI30)