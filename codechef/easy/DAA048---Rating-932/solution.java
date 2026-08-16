import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            boolean found = false;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        found = true;
                    }
                }
            }

            if (found) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}