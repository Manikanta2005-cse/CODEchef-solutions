# MONKCI18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Check if a shopping list is empty

In this example, we are going to demonstrate the usage of the isEmpty() method, which checks whether an ArrayList is empty or not.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:10:58.621Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an empty shopping list
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Check if the list is empty and print
        System.out.println("Is the shopping list empty? " + shoppingList.isEmpty());
        
        // Add "Milk" to the list
        shoppingList.add("Milk");
        
        // Check if the list is empty again and print
        System.out.println("Is the shopping list empty now? " + shoppingList.isEmpty());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI18)