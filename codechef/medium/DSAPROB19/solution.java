import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] pos = new int[n];
        for (int i = 0; i < n; i++) {
            pos[i] = sc.nextInt();
        }

        Arrays.sort(pos);

        int low = 1;
        int high = pos[n - 1] - pos[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (check(pos, n, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(ans);
        sc.close();
    }

    public static boolean check(int[] pos, int n, int k, int d) {
        int count = 1;
        int lastPosition = pos[0];

        for (int i = 1; i < n; i++) {
            if (pos[i] - lastPosition >= d) {
                count++;
                lastPosition = pos[i];
            }
            if (count >= k) {
                return true;
            }
        }

        return false;
    }
}