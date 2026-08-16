import java.util.HashMap;

class PhoneBook {
    public static void main(String[] args) {
        // Create a HashMap to store names and phone numbers
        HashMap<String, String> phoneBook = new HashMap<>();

        // Add some entries to the phone book
        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "987-654-3210");
        phoneBook.put("Charlie", "555-123-4567");

        // Retrieve Alice's phone number
        String aliceNumber = phoneBook.get("Alice");
        System.out.println("Alice's phone number: " + aliceNumber);

        // Try to retrieve David's phone number (who is not in the phone book)
        String davidNumber = phoneBook.get("David");
        if (davidNumber == null) {
            System.out.println("David's phone number not found.");
        }

       // Check if Bob's name exists
        if (phoneBook.containsKey("Bob")) {
            System.out.println("Bob's contact exists.");
        }

        // Remove Charlie's contact
        phoneBook.remove("Charlie");

        //Check if Charlie's name exists
        if (!phoneBook.containsKey("Charlie")) {
            System.out.println("Charlie's contact has been removed.");
        }
    }
}