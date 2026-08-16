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