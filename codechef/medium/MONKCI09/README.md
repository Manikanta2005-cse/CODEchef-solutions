# MONKCI09

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Shopping list management

You are given a partially written Java program that manages a shopping list using an ArrayList.
Your task is to complete the code by following the instructions in the comments.

 **Expected Output:** 

```
Final shopping list: [Milk, Eggs, Apples, Chicken, Rice]

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:06:49.738Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Chicken");
        shoppingList.add("Rice");
        
        shoppingList.remove(3);
        shoppingList.remove("Bread");
        
        System.out.println("Final shopping list: " + shoppingList);
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI09)