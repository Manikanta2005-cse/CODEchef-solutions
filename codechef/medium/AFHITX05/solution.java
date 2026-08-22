import java.util.Scanner;

class OverflowProduct {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int product = 1;
        for (int i = 0; i < n; i++) {
            //Implement overflow detection logic here
            product = product * arr[i];
        }

        System.out.println(product);
        scanner.close();
    }
}