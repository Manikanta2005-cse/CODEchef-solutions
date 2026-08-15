# FYJWKV14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Product Stock Management

Now work on this practice problem to conceptualize your knowledge of  **throwing exceptions**. You are given a partially completed Java program with a `Product` and `Store` class, and a custom  **exception class**  `InsufficientStockException`.

 **Task to perform:** 

- Your task is to complete the sellProduct(int quantity) method in the Store class.
- If the requested quantity is greater than the current 'stock', throw an InsufficientStockException with the message provided to you in IDE.
- Otherwise, deduct the quantity from the product's stock.

The `main`  **method**  and  **exception handling**  using `try-catch` is already written for you. Focus only on implementing the selling logic inside the `sellProduct`  **method**.

 **Output format:** 

```
Error: Insufficient stock! Available stock: 5

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-15T16:42:45.290Z  

```java
class InsufficientStockException extends Exception {
    public InsufficientStockException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

class Store {
    private Product product;

    public Store(Product product) {
        this.product = product;
    }

    public void sellProduct(int quantity) throws InsufficientStockException {
        if (quantity > product.getStock()) {
            throw new InsufficientStockException("Insufficient stock! Available stock: " + product.getStock());
        }
        int newStock = product.getStock() - quantity;
        product.setStock(newStock);
        System.out.println("Sold " + quantity + " units. Remaining stock: " + product.getStock());
    }
}

public class Main {
    public static void main(String[] args) {
        Product myProduct = new Product("Laptop", 5);
        Store myStore = new Store(myProduct);

        try {
            myStore.sellProduct(7);
        } catch (InsufficientStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/FYJWKV14)