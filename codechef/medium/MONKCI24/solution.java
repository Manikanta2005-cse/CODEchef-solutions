import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an ArrayList called cart
        ArrayList<String> cart = new ArrayList<>();
        
        // Add items to the cart
        cart.add("Milk");
        cart.add("Bread");
        cart.add("Eggs");
        
        // Print the cart contents and size
        System.out.println("Current cart items: " + cart);
        System.out.println("Number of items: " + cart.size());
        
        // Clear the cart
        cart.clear();
        
        // Print the cart contents again and verify it's empty
        System.out.println("Cart after clearing: " + cart);
        System.out.println("Number of items now: " + cart.size());
        System.out.println("Is cart empty? " + cart.isEmpty());
    }
}