# EFMGDV04

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Store and Display Book Objects

You are working on a Java program to manage a simple library catalog. Each book in the catalog is represented by a `Book`  **class**, which stores the book's `title`, `author`, and `publicationYear`. A `Catalog`  **class**  is responsible for maintaining a list of books and displaying them. The initial structure of the `Book`  **class**  is already provided. Your job is to complete the `Catalog` class using an  **ArrayList**  to manage a collection of `Book`  **objects**.

 **Tasks to Perform:** 

- Complete the main method inside the Catalog class by performing the following steps:
- Create an ArrayList to store Book objects.
- Add at least three Book objects to the list with different titles, authors, and publication years.

 **Output format:** 

```
My Book Catalog:
1. The Lord of the Rings by J.R.R. Tolkien (1954)
2. Pride and Prejudice by Jane Austen (1813)
3. 1984 by George Orwell (1949)

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:34:26.973Z  

```java
import java.util.ArrayList;

class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

class Catalog {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to hold Book objects
        ArrayList<Book> catalog = new ArrayList<>();

        // Step 2: Add Book objects to the ArrayList
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien", 1954);
        Book book2 = new Book("Pride and Prejudice", "Jane Austen", 1813);
        Book book3 = new Book("1984", "George Orwell", 1949);

        catalog.add(book1);
        catalog.add(book2);
        catalog.add(book3);

        // Step 3: Display the catalog without using a loop
        System.out.println("My Book Catalog:");

        Book b1 = catalog.get(0);
        System.out.println("1. " + b1.getTitle() + " by " + b1.getAuthor() + " (" + b1.getPublicationYear() + ")");

        Book b2 = catalog.get(1);
        System.out.println("2. " + b2.getTitle() + " by " + b2.getAuthor() + " (" + b2.getPublicationYear() + ")");

        Book b3 = catalog.get(2);
        System.out.println("3. " + b3.getTitle() + " by " + b3.getAuthor() + " (" + b3.getPublicationYear() + ")");
    }
}

```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV04)