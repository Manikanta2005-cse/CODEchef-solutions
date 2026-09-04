import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] price = new int[26];
            for (int i = 0; i < 26; i++) {
                price[i] = sc.nextInt();
            }
            
            String s = sc.next();
            boolean[] present = new boolean[26];
            for (int i = 0; i < s.length(); i++) {
                present[s.charAt(i) - 'a'] = true;
            }
            
            long totalCost = 0;
            for (int i = 0; i < 26; i++) {
                if (!present[i]) {
                    totalCost += price[i];
                }
            }
            
            System.out.println(totalCost);
        }
        sc.close();
    }
}