import java.util.ArrayList;
import java.util.Collections;

class Codechef {
    public static void main(String[] args) {
        // Create an ArrayList for student names
        ArrayList<String> students = new ArrayList<>();
        
        // Add student names in random order
        students.add("Emma");
        students.add("Liam");
        students.add("Olivia");
        students.add("Noah");
        students.add("Ava");
        
        // Print the list before sorting
        System.out.println("Before sorting: " + students);
        
        // Sort the list
        Collections.sort(students);
        
        // Print the list after sorting
        System.out.println("After sorting: " + students);
    }
}
