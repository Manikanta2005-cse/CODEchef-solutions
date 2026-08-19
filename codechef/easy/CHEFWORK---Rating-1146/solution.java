import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        
        int at = 100000;
        int tr = 100000;
        int attr = 100000;

        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                tr = Math.min(tr, c[i]);
            } else if (t[i] == 2) {
                at = Math.min(at, c[i]);
            } else if (t[i] == 3) {
                attr = Math.min(attr, c[i]);
            }
        }

        int minTotalCost = Math.min(tr + at, attr);

        if (minTotalCost == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTotalCost);
        }

        scanner.close();
    }
}