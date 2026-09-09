import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            String r = sc.next();
            
            int changes = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) != r.charAt(i)) {
                    changes++;
                }
            }
            
            if (changes % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}