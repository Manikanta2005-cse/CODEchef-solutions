import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (isValid(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }

    private static boolean isValid(String s) {
        int n = s.length();
        if (n < 10) {
            return false;
        }

        boolean hasLower = false;
        boolean hasUpperInside = false;
        boolean hasDigitInside = false;
        boolean hasSpecialInside = false;

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                hasLower = true;
            }

            if (i > 0 && i < n - 1) {
                if (c >= 'A' && c <= 'Z') {
                    hasUpperInside = true;
                } else if (c >= '0' && c <= '9') {
                    hasDigitInside = true;
                } else if (c == '@' || c == '#' || c == '%' || c == '&' || c == '?') {
                    hasSpecialInside = true;
                }
            }
        }

        return hasLower && hasUpperInside && hasDigitInside && hasSpecialInside;
    }
}