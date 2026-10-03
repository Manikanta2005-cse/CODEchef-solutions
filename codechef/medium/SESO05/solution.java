import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = sc.nextInt();
            pairs[i][1] = sc.nextInt();
        }
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if ((pairs[i][0] == a && pairs[i][1] == b) || (pairs[i][0] == b && pairs[i][1] == a)) {
                found = true;
                break;
            }
        }
        
        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}