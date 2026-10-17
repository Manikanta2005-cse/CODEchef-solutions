import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] s = new long[n];
            for (int i = 0; i < n; i++) {
                s[i] = scanner.nextLong();
            }
            Arrays.sort(s);
            long minDiff = Long.MAX_VALUE;
            for (int i = 0; i < n - 1; i++) {
                long diff = s[i + 1] - s[i];
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
            System.out.println(minDiff);
        }
        scanner.close();
    }
}