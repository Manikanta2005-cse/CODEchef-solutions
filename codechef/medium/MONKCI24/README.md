# MONKCI24

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shopping Cart Clear

You are given a partially written Java program that simulates a shopping cart using an ArrayList. Your task is to complete the program using the clear() method to remove all items from the cart and verify that it is empty.

 **Expected Output:** 

```
Current cart items: [Milk, Bread, Eggs]
Number of items: 3
Cart after clearing: []
Number of items now: 0
Is cart empty? true

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:12:37.155Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an ArrayList called cart
        ArrayList<String> cart = new ArrayList<>();
        
        // Add items to the cart
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        
        // Print the cart contents and size
        System.out.println("Current cart items: " + cart);
        System.out.println("Number of items: " + cart.size());
        
        // Clear the cart
        cart.clear();
        
        // Print the cart contents again and verify it's empty
        System.out.println("Cart after clearing: " + cart);
        System.out.println("Number of items now: " + cart.size());
        System.out.println("Is cart empty? " + cart.isEmpty());
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI24)