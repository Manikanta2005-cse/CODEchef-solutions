import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] b = new long[n];
            long sumB = 0;
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                sumB += b[i];
            }
            long sumA = sumB / (n + 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(b[i] - sumA).append(i == n - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}