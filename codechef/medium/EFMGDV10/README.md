# EFMGDV10

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Inventory Management System

Create an inventory management system using a `HashMap<String, Integer>`. You’ll read  **3 item–quantity pairs**  from the user, store them in the map, and perform a few operations.

 **Tasks:** 

- Create a HashMap called inventory to store item names (String) and their quantities (Integer).
- Take input from the user for 3 items in the form: "ItemName Quantity" (e.g., Apple 50)
- Print the quantity of "Bananas" if present, else print "Bananas not available".
- Check if "Apples" exists. Print "Apples available" or "Apples not available".
- If "Oranges" exists, increase its quantity by 25 and print the updated quantity like: Orange: 100 Otherwise, print "Oranges not available"
### Sample 1:
Input
Output

```
Apples 50
Bananas 100
Oranges 20
```

```
Bananas: 100
Apples available
Oranges: 45
```

### Sample 2:
Input
Output

```
Grapes 100
Apples 20
Bananas 30
```

```
Bananas: 30
Apples available
Oranges not available
```

### Sample 3:
Input
Output

```
Grapes 100
Pineapples 20
Mangoes 10
```

```
Bananas not available
Apples not available
Oranges not available
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:37:24.223Z  

```java
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

```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV10)