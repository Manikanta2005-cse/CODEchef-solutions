# EFMGDV14

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Iterate and Display Book Titles

Okay, let's solidify your understanding of  **iterating**  through  **collections**. Imagine you have a class called `Book` with a `title` and an `author`. You have an `ArrayList` of `Book` objects, and your task is to print the title of each book in the list by running a loop.

 **Task to perform:** 
Iterate through `books` ArrayList and print the names of all the books.

 **Output format:** 

```
The Lord of the Rings
Pride and Prejudice
1984

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-16T10:40:21.178Z  

```java
import java.util.ArrayList;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();

        // Create some Book objects
        Book book1 = new Book("The Lord of the Rings", "J.R.R. Tolkien");
        Book book2 = new Book("Pride and Prejudice", "Jane Austen");
        Book book3 = new Book("1984", "George Orwell");

        // Add the Book objects to the ArrayList
        books.add(book1);
        books.add(book2);
        books.add(book3);

        // Write a for-each loop to iterate through the ArrayList and print each book's title
        for(Book book : books){
            System.out.println(book.getTitle());
        }
        
    }
}
```

---

[View on CodeChef](https://www.codechef.com/problems/EFMGDV14)