import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input for number of languages
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character

        // Step 2: Create ArrayList to store language names
        ArrayList<String> languages = new ArrayList<>();

        // Step 3: Read n languages from user
        for (int i = 0; i < n; i++) {
            String lang = sc.nextLine();
            languages.add(lang);
        }

        // Step 4: Sort the list
        Collections.sort(languages);

        // Step 5: Print first and last elements
        System.out.println("First Language: " + languages.get(0));
        System.out.println("Last Language: " + languages.get(languages.size() - 1));
        
        sc.close();
    }
}