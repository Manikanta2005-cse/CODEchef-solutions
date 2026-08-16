# EFMGDV20

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Filter Products by Price Range
- Okay, let's practice one more problem based on searching and filtering object collections. Imagine you are working on an e-commerce application. You have a list of Product class objects, and you want to allow users to filter products based on their price range.
- Rest of the code is already given for you. Your task is to just complete the filterProductsByPrice method. The method should return a new filtered ArrayList containing only the products that fall within the specified price range.

 **Output format:** 

```
Keyboard: 75.0
Monitor: 300.0

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:46:51.630Z  

```java
import java.util.ArrayList;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class Solution {

    public static ArrayList<Product> filterProductsByPrice(ArrayList<Product> products, double minPrice, double maxPrice) {
        ArrayList<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("Mouse", 25.0));
        products.add(new Product("Keyboard", 75.0));
        products.add(new Product("Monitor", 300.0));

        ArrayList<Product> filteredProducts = filterProductsByPrice(products, 50.0, 500.0);
        
        for (Product product : filteredProducts) {
            System.out.println(product.getName() + ": " + product.getPrice());
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV20)