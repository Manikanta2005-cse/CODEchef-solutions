import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        while (t-- > 0) {
            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();

            int dTotal = d1 + d2 + d3;
            int sTotal = s1 + s2 + s3;

            if (dTotal > sTotal) {
                System.out.println("Dragon");
            } else if (sTotal > dTotal) {
                System.out.println("Sloth");
            } else if (d1 > s1) {
                System.out.println("Dragon");
            } else if (s1 > d1) {
                System.out.println("Sloth");
            } else if (d2 > s2) {
                System.out.println("Dragon");
            } else if (s2 > d2) {
                System.out.println("Sloth");
            } else {
                System.out.println("Tie");
            }
        }
        sc.close();
    }
}