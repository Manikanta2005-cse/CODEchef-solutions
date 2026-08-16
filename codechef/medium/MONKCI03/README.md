# MONKCI03

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Add Cities by Index

In this example, we are going to demonstrate the usage of the add method with an index, which allows inserting elements at specific positions in the list.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:04:31.134Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to store city names
        ArrayList<String> cities = new ArrayList<>();

        // Step 2: Add elements at the end of the list
        cities.add("Delhi");          // ["Delhi"]
        cities.add("Mumbai");         // ["Delhi", "Mumbai"]

        // Step 3: Add element at a specific index
        cities.add(1, "Bangalore");   // Inserts at index 1: ["Delhi", "Bangalore", "Mumbai"]

        // Step 4: Add another element at the beginning
        cities.add(0, "Kolkata");     // Inserts at index 0: ["Kolkata", "Delhi", "Bangalore", "Mumbai"]

        // Step 5: Print the final list
        System.out.println("Final list of cities: " + cities);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI03)