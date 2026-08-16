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

            Arrays.sort(a);

            boolean found = false;

            for (int i = 0; i < n - 1; i++) {
                if (a[i] == a[i + 1]) {
                    found = true;
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