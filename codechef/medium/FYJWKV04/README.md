# FYJWKV04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inventory Management with Exceptions
- Let's test your understanding of try-catch blocks with objects through an inventory management scenario. You are given a partially implemented Java program that models a store’s inventory system.
- The Inventory class is already defined with a constructor and a sell(int quantity) method that needs to be completed.

 **Tasks to perform:**   **Inside the sell method:** 

- Check if quantity is negative and throw an IllegalArgumentException also check if quantity is greater than stock throw an IllegalArgumentException.
- Otherwise deduct the quantity from stock.

 **Inside the main method:** 

- Create an Inventory object using the constructor and assign it to a variable and call the sell method to sell 20 units.
- Print the remaining stock using getStock() method for the object.
- Call sell again with 100 units to trigger an exception.
- Use a catch block to print the exception message and use a finally block to display "Transaction completed."

 **Output format:** 

```
Remaining stock: 30
Error: Insufficient stock.
Transaction completed.

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:32:02.709Z  

```java
class Inventory {
    private int stock;

    public Inventory(int initialStock) {
        if (initialStock < 0) {
            throw new IllegalArgumentException("Initial stock cannot be negative.");
        }
        this.stock = initialStock;
    }

    public void sell(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        if (quantity > stock) {
            throw new IllegalArgumentException("Insufficient stock.");
        }
        stock -= quantity;
    }

    public int getStock() {
        return stock;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Inventory inventory = new Inventory(50);
            inventory.sell(20);
            System.out.println("Remaining stock: " + inventory.getStock());
            inventory.sell(100);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV04)