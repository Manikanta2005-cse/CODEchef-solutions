import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        
        String s1 = sc.next();
        char c1 = sc.next().charAt(0);
        int k = sc.nextInt();
        
        int count = 0;
        int ans = -1;
        
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c1) {
                count++;
                if (count == k) {
                    ans = i;
                    break;
                }
            }
        }
        
        System.out.println(ans);
    }
}