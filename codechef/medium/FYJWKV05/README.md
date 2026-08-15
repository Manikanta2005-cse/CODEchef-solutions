# FYJWKV05

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:32:06.900Z  

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

[View on CodeChef](https://www.codechef.com/problems/FYJWKV05)