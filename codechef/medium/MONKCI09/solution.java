import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<>();
        
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        shoppingList.add("Cheese");
        shoppingList.add("Apples");
        shoppingList.add("Chicken");
        shoppingList.add("Rice");
        
        shoppingList.remove(3);
        shoppingList.remove("Bread");
        
        System.out.println("Final shopping list: " + shoppingList);
    }
}