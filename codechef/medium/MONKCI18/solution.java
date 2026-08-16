import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an empty shopping list
        ArrayList<String> shoppingList = new ArrayList<>();
        
        // Check if the list is empty and print
        System.out.println("Is the shopping list empty? " + shoppingList.isEmpty());
        
        // Add "Milk" to the list
        shoppingList.add("Milk");
        
        // Check if the list is empty again and print
        System.out.println("Is the shopping list empty now? " + shoppingList.isEmpty());
    }
}
