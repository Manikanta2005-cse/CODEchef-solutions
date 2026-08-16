import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int pos = scanner.nextInt();
            if (pos > n) {
                System.out.println("0");
                continue;
            }
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();
            Arrays.sort(a);
            long sum = 0;
            while (pos <= n) {
                sum += a[n - pos];
                pos += k;
            }
            System.out.println(sum);
        }
    }
}