import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String s = scanner.next();
            int first = Integer.parseInt(s.substring(0, 2));
            int second = Integer.parseInt(s.substring(3, 5));
            
            if (first > 12 && second <= 12) {
                System.out.println("DD/MM/YYYY");
            } else if (first <= 12 && second > 12) {
                System.out.println("MM/DD/YYYY");
            } else {
                System.out.println("BOTH");
            }
        }
        
        scanner.close();
    }
}