import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Create and initialize the ArrayList with colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");
        
        // Check if "Blue" is in the list
        boolean hasBlue = colors.contains("Blue");
        
        // Check if "Pink" is in the list
        boolean hasPink = colors.contains("Pink");
        
        // Print the results
        System.out.println("Contains Blue: " + hasBlue);
        System.out.println("Contains Pink: " + hasPink);
    }
}
