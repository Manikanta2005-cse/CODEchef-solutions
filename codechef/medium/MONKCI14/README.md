# MONKCI14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking for favorite colors in a list

You are given a  **partially written Java program**  that creates and stores a list of colors using an `ArrayList`. Your task is to  **complete the program**  by using the `contains()` method to check whether specific colors are present in the list.

 **Expected Output** 

```
Contains Blue: true
Contains Pink: false

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:10:03.588Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create and initialize the ArrayList with colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        // Check if "Blue" is in the list
        boolean hasBlue = colors.contains("Blue");
        
        // Check if "Pink" is in the list
        boolean hasPink = colors.contains("Pink");
        
        // Print the results
        System.out.println("Contains Blue: " + hasBlue);
        System.out.println("Contains Pink: " + hasPink);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI14)