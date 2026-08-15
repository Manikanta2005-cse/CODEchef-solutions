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