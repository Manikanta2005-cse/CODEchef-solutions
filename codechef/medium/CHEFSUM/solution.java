import java.util.Scanner;
import java.util.HashSet;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            HashSet<Integer> seenValues = new HashSet<>();
            int minIndex = 1;
            int minValue = Integer.MAX_VALUE;
            
            for (int i = 1; i <= n; i++) {
                int val = sc.nextInt();
                seenValues.add(val);
                
                if (val < minValue) {
                    minValue = val;
                    minIndex = i;
                }
            }
            
            System.out.println(minIndex);
        }
    }
}