import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a <= k) {
                    k -= a;
                    result.append('1');
                } else {
                    result.append('0');
                }
            }
            System.out.println(result.toString());
        }
        sc.close();
    }
}