import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean isValid = true;
            for (int i = 0; i < s.length(); i += 2) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        sc.close();
    }
}