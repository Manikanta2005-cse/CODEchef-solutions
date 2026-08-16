import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Step 1: Declare and initialize the ArrayList
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(48);
        marks.add(70);
        marks.add(86);

        // Step 2: Update each element manually (split get and set)
        int firstMark = marks.get(0);
        firstMark = firstMark + 2;
        marks.set(0, firstMark);

        int secondMark = marks.get(1);
        secondMark = secondMark + 2;
        marks.set(1, secondMark);

        int thirdMark = marks.get(2);
        thirdMark = thirdMark + 2;
        marks.set(2, thirdMark);

        // Step 3: Print updated elements manually
        System.out.println("Updated Marks:");
        System.out.println(marks.get(0));
        System.out.println(marks.get(1));
        System.out.println(marks.get(2));
    }
}