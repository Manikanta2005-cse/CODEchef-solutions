import java.util.ArrayList;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take the size of the list
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        // Step 2: Input words into the ArrayList
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(sc.nextLine());
        }

        // Step 3: Remove words with length < 4
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).length() < 4) {
                words.remove(i);
                i--; // adjust index after removal
            }
        }

        // Step 4: Print the updated list
        System.out.println(words);

        sc.close();
    }
}