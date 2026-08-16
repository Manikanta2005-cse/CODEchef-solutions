import java.util.HashMap;
import java.util.Scanner;

class InventoryManager {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input 3 item–quantity pairs
        for (int i = 0; i < 3; i++) {
            String item = scanner.next();
            int quantity = scanner.nextInt();
            inventory.put(item, quantity);
        }

        // Step 2: Print quantity of "Banana" if present
        if (inventory.containsKey("Bananas")) {
            System.out.println("Bananas: " + inventory.get("Bananas"));
        } else {
            System.out.println("Bananas not available");
        }

        // Step 3: Check if "Apple" exists
        if (inventory.containsKey("Apples")) {
            System.out.println("Apples available");
        } else {
            System.out.println("Apples not available");
        }

        // Step 4: If "Orange" exists, increase its quantity by 25
        if (inventory.containsKey("Oranges")) {
            int updatedQuantity = inventory.get("Oranges") + 25;
            inventory.put("Oranges", updatedQuantity);
            System.out.println("Oranges: " + updatedQuantity);
        }
        else{
            System.out.println("Oranges not available");
        }

        scanner.close();
    }
}
