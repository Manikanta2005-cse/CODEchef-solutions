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
