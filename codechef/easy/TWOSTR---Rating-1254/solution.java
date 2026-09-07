import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) return;
        int t = scanner.nextInt();
        while (t-- > 0) {
            String x = scanner.next();
            String y = scanner.next();
            boolean match = true;
            for (int i = 0; i < x.length(); i++) {
                char ch1 = x.charAt(i);
                char ch2 = y.charAt(i);
                if (ch1 != '?' && ch2 != '?' && ch1 != ch2) {
                    match = false;
                    break;
                }
            }
            if (match) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}