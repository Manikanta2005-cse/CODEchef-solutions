import java.util.Scanner;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            if (isRainbow(a, n)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    private static boolean isRainbow(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int currentExpected = 1;

        while (left <= right) {
            if (a[left] != a[right]) {
                return false;
            }
            if (a[left] != currentExpected) {
                if (a[left] == currentExpected + 1 && currentExpected < 7) {
                    currentExpected++;
                } else {
                    return false;
                }
            }
            left++;
            right--;
        }

        return currentExpected == 7;
    }
}