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
