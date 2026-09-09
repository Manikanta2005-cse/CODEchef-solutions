import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            String s = sc.next();
            int carlsen = 0;
            int chef = 0;
            for (int i = 0; i < 14; i++) {
                char ch = s.charAt(i);
                if (ch == 'C') {
                    carlsen++;
                } else if (ch == 'N') {
                    chef++;
                }
            }
            if (carlsen > chef) {
                System.out.println(60 * x);
            } else if (carlsen == chef) {
                System.out.println(55 * x);
            } else {
                System.out.println(40 * x);
            }
        }
        sc.close();
    }
}