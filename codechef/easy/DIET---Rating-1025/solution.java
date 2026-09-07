import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            long stored = 0;
            int failedDay = -1;
            for (int i = 0; i < n; i++) {
                stored += a[i];
                if (stored < k) {
                    failedDay = i + 1;
                    break;
                }
                stored -= k;
            }
            if (failedDay == -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO " + failedDay);
            }
        }
        sc.close();
    }
}