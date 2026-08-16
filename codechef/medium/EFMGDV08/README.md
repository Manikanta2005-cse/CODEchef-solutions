# EFMGDV08

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Phone Book with HashMap

Check this worked example of  **`HashMap`**  based on `PhoneBook` class to grasp the concept properly. In this example:

- A PhoneBook class is created that stores name as key and contact as value.
- A HashMap is created to add a few contacts using the put() method in the form of name and contact.
- containsKey method is performed to check that contact detail of this person exists or not and then if contact exist get method is performed to access some contacts.
- remove method is performed to remove (name, contact) key, value pair from the PhoneBook HashMap.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:36:08.849Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV08)