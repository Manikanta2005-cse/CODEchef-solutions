import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (s.contains("010") || s.contains("101")) {
                System.out.println("Good");
            } else {
                System.out.println("Bad");
            }
        }
        sc.close();
    }
}