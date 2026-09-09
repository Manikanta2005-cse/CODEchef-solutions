import java.util.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int countA = 0;
            int countB = 0;
            
            for (char c : s.toCharArray()) {
                if (c == 'a') {
                    countA++;
                } else if (c == 'b') {
                    countB++;
                }
            }
            
            System.out.println(Math.min(countA, countB));
        }
    }
}