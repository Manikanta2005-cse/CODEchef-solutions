import java.util.ArrayList;

class Codechef {
    public static void main(String[] args) {
        // Declare and initialize ArrayList
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(85);
        scores.add(90);
        scores.add(78);
        scores.add(92);
        scores.add(88);

        // Loop through ArrayList elements
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
        }
    }
}
