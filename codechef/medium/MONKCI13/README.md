# MONKCI13

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking for a Book in Library ArrayList

In this example, we are going to demonstrate the usage of the contains() method, which allows us to check whether a specific element exists in the list.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:07:59.474Z  

```java
import java.util.ArrayList;

class LibraryCheck {
    public static void main(String[] args) {
        // Create and initialize the ArrayList
        ArrayList<String> library = new ArrayList<>();
        library.add("Harry Potter");
        library.add("The Hobbit");
        library.add("1984");
        library.add("To Kill a Mockingbird");

        // Check if books are available
        boolean hasHobbit = library.contains("The Hobbit");
        boolean hasGatsby = library.contains("The Great Gatsby");

        // Print results
        System.out.println("Is 'The Hobbit' available? " + hasHobbit);
        System.out.println("Is 'The Great Gatsby' available? " + hasGatsby);
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI13)