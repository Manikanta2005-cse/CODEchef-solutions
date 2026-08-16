# MONKCI23

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Emptying a Fruit Basket

In this example, we are going to demonstrate the usage of the clear() method in ArrayList, which removes all the elements from the list, making it empty. This is useful when you want to reuse the list without creating a new one.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:11:59.500Z  

```java
import java.util.ArrayList;

class FruitBasket {
    public static void main(String[] args) {
        // Initialize the basket
        ArrayList<String> basket = new ArrayList<>();
        
        // Add fruits to the basket
        basket.add("Apple");
        basket.add("Banana");
        basket.add("Orange");
        
        // Display current basket
        System.out.println("Basket contents: " + basket);
        System.out.println("Basket size: " + basket.size());
        
        // Clear the basket
        basket.clear();
        
        // Display after clearing
        System.out.println("\nAfter clearing:");
        System.out.println("Basket contents: " + basket);
        System.out.println("Basket size: " + basket.size());
        System.out.println("Is basket empty? " + basket.isEmpty());
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI23)