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
        
        int left = sc.nextInt();
        int right = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int a = pairs[i][0];
            int b = pairs[i][1];
            int sum = a + b;
            int product = a * b;
            
            if (sum >= left && sum <= right && product >= left && product <= right) {
                System.out.println(a + " " + b);
            }
        }
    }
}