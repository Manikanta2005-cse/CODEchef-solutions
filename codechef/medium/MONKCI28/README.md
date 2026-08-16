# MONKCI28

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sorting student names alphabetically

In this example, we are going to demonstrate the usage of the sort() method from the Collections class, which is used to sort the elements of an ArrayList in ascending order.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:13:45.442Z  

```java
import java.util.ArrayList;
import java.util.Collections;

class Codechef {
    public static void main(String[] args) {
        // Create an ArrayList for student names
        ArrayList<String> students = new ArrayList<>();
        
        // Add student names in random order
        students.add("Emma");
        students.add("Liam");
        students.add("Olivia");
        students.add("Noah");
        students.add("Ava");
        
        // Print the list before sorting
        System.out.println("Before sorting: " + students);
        
        // Sort the list
        Collections.sort(students);
        
        // Print the list after sorting
        System.out.println("After sorting: " + students);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI28)