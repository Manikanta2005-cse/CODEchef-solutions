import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int MX = 10001;
        int[] Hash = new int[MX];

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if ((long) a[i] * a[i] < MX) {
                ans += Hash[a[i] * a[i]];
            }
            Hash[a[i]]++;
        }

        System.out.println(ans);
    }
}