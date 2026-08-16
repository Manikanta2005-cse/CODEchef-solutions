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