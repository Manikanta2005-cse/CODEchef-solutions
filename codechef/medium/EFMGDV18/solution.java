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
