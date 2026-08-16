# MONKCI19

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Checking an empty book shelf

You are given a partially written Java program that simulates a simple bookshelf using an ArrayList. Your task is to complete the program by following the instructions below.

 **Expected Output:** 

```
Bookshelf is empty
Bookshelf has books

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T17:11:26.588Z  

```java
import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create an empty ArrayList called bookshelf
        ArrayList<String> bookshelf = new ArrayList<>();
        
        // Check if bookshelf is empty and print appropriate message
        if (bookshelf.isEmpty()) {
            System.out.println("Bookshelf is empty");
        } else {
            System.out.println("Bookshelf has books");
        }

        // Add "Harry Potter" to the bookshelf
        bookshelf.add("Harry Potter");

        // Check if bookshelf is empty again and print appropriate message
        if (bookshelf.isEmpty()) {
            System.out.println("Bookshelf is empty");
        } else {
            System.out.println("Bookshelf has books");
        }
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/MONKCI19)