import java.util.Scanner;

class PricePerItem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalCost = scanner.nextDouble();

        int numberOfItems;
        do {
            numberOfItems = scanner.nextInt();
            if (numberOfItems <= 0) {
                System.out.println("Number of items must be positive. Please enter again.");
            }
        } while (numberOfItems <= 0);

        // Calculate the price per item
        double pricePerItem = totalCost / numberOfItems;

        System.out.println("Price per item: " + pricePerItem);

        scanner.close();
    }
}