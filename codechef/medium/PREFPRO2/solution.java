import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        
        int[] ar = new int[len];
        for (int i = 0; i < len; i++) {
            ar[i] = scanner.nextInt();
        }

        long[] pre = new long[len];
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                pre[i] += pre[i - 1];
            }
            pre[i] += ar[i];
        }

        int q = scanner.nextInt();
        while (q-- > 0) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();
            n1--;
            n2--;
            if (n1 == 0) {
                System.out.println(pre[n2]);
            } else {
                System.out.println(pre[n2] - pre[n1 - 1]);
            }
        }
        scanner.close();
    }
}