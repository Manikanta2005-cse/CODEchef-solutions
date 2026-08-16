# EFMGDV18

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Finding products within a price range
- Okay, let's solidify your understanding of search and filter methods with a worked example. Imagine you're building an e-commerce application. You have a list of Product objects, and you want to allow users to filter products based on a price range.
- In this example we are creating an ArrayList of Product objects and are implementing the filtering logic to find all products within a specified price range (minimum price and maximum price).

Click `Submit` to run the code and observe the output.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:41:37.042Z  

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

class ProductFilter {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1200.0));
        products.add(new Product("Keyboard", 75.0));
        products.add(new Product("Mouse", 25.0));
        products.add(new Product("Monitor", 300.0));
        products.add(new Product("Headphones", 150.0));

        // Define the price range
        double minPrice = 50.0;
        double maxPrice = 200.0;

        // Create a new list to store the filtered products
        ArrayList<Product> filteredProducts = new ArrayList<>();

        // Iterate through the products list and filter based on the price range
        for (Product product : products) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                filteredProducts.add(product);
            }
        }

        // Print the names of the filtered products
        System.out.println("Products within the price range of " + minPrice + " to " + maxPrice + ":");
        for (Product product : filteredProducts) {
            System.out.println(product.getName() + ": $" + product.getPrice());
        }
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV18)