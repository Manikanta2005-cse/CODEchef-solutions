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