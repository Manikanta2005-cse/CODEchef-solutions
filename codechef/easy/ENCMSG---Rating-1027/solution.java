import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            char[] s = sc.next().toCharArray();
            
            // Step 1: Swap adjacent characters
            for (int i = 0; i < n - 1; i += 2) {
                char temp = s[i];
                s[i] = s[i + 1];
                s[i + 1] = temp;
            }
            
            // Step 2: Replace each character with its symmetric alphabet opposite
            for (int i = 0; i < n; i++) {
                s[i] = (char) ('z' - (s[i] - 'a'));
            }
            
            System.out.println(new String(s));
        }
        sc.close();
    }
}