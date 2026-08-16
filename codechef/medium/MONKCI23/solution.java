import java.util.ArrayList;

class FruitBasket {
    public static void main(String[] args) {
        // Initialize the basket
        ArrayList<String> basket = new ArrayList<>();
        
        // Add fruits to the basket
        basket.add("Apple");
        basket.add("Banana");
        basket.add("Orange");
        
        // Display current basket
        System.out.println("Basket contents: " + basket);
        System.out.println("Basket size: " + basket.size());
        
        // Clear the basket
        basket.clear();
        
        // Display after clearing
        System.out.println("\nAfter clearing:");
        System.out.println("Basket contents: " + basket);
        System.out.println("Basket size: " + basket.size());
        System.out.println("Is basket empty? " + basket.isEmpty());
    }
}
