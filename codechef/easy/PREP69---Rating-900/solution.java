import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            if (n == 0) {
                System.out.println(0);
                System.out.println();
                continue;
            }
            int[] temp = new int[n];
            int j = 0;
            temp[j++] = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    temp[j++] = a[i];
                }
            }
            System.out.println(j);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < j; i++) {
                sb.append(temp[i]).append(i == j - 1 ? "" : " ");
            }
            System.out.println(sb.toString());
        }
    }
}