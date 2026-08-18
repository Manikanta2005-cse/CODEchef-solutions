import java.util.Scanner;
import java.util.HashMap;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            
            for (int i = 0; i < n; i++) {
                map.put(i, sc.nextInt());
            }
            
            int max = 0;
            for (int count : map.values()) {
                if (count > max) {
                    max = count;
                }
            }
            
            System.out.println(max);
        }
        sc.close();
    }
}