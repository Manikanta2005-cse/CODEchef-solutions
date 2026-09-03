import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;

        int t = scanner.nextInt();
        while (t-- > 0) {
            String s = scanner.next();
            int count = 0;
            boolean happy = false;

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                    if (count > 2) {
                        happy = true;
                        break;
                    }
                } else {
                    count = 0; // Reset counter when a non-vowel is encountered
                }
            }

            if (happy) {
                System.out.println("HAPPY");
            } else {
                System.out.println("SAD");
            }
        }
        scanner.close();
    }
}