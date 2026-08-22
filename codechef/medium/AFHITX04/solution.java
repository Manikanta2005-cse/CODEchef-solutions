import java.util.Scanner;

class TriangleType {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        String triangleType;

        if (side1 == side2 && side2 == side3) {
            triangleType = "Equilateral";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            triangleType = "Isosceles";
        } else {
            triangleType = "Scalene";
        }

        System.out.println(triangleType);
        scanner.close();
    }
}