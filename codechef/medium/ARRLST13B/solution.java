import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(90);
        marks.add(85);
        marks.add(75);

        // Step 2: Update some elements
        marks.set(1, 88);  // Update second element
        marks.set(4, 95);  // Update fifth element

        // Step 3: Print all elements without using a loop
        System.out.println("Updated marks:");
        System.out.println("Student 1: " + marks.get(0));
        System.out.println("Student 2: " + marks.get(1));
        System.out.println("Student 3: " + marks.get(2));
        System.out.println("Student 4: " + marks.get(3));
        System.out.println("Student 5: " + marks.get(4));
    }
}
