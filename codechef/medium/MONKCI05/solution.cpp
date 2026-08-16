import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();

        // Add "Math" at the end
        subjects.add("Math");

        // Add "English" at the end
        subjects.add("English");

        // Add "Science" at index 1
        subjects.add(1, "Science");

        // Add "History" at index 2
        subjects.add(2, "History");

        // Add "Art" at index 0
        subjects.add(0, "Art");

        // Print the final list
        System.out.println(subjects);
    }
}